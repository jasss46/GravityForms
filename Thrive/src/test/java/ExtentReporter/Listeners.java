package ExtentReporter;

import Config.ScreenshotUtils;
import Config.VideoRecorderUtil;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static Config.BaseClass.driver;

public class Listeners implements ITestListener, ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        try {
            ExtentReport.initReports();
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public void onFinish(ISuite suite) {
        try {
            ExtentReport.flushReports();
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        try {
            ExtentReport.createTest(result.getMethod().getMethodName());

            // Start recording and save the .mov path in the test result attributes
            String currentMovPath = VideoRecorderUtil.startRecording(result.getMethod().getMethodName());
            result.setAttribute("movPath", currentMovPath);

        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        try {
            ExtentLogger.pass(result.getMethod().getMethodName() + " is passed");
            attachVideoToReport(result);

        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            ExtentLogger.fail(result.getMethod().getMethodName() + " is failed");
            ExtentLogger.fail(String.valueOf(result.getThrowable()));

            attachVideoToReport(result);

            String screenshotPath = ScreenshotUtils.captureScreenshot(driver, result.getMethod().getMethodName());
            ExtentLogger.failWithScreenshot("Failure Screenshot", screenshotPath);

        } catch (Exception e) {
            ExtentLogger.fail("Exception in onTestFailure: " + e.getMessage());
        }
    }

    /**
     * Stops recording, converts to MP4, and attaches video to Extent report
     */
    private void attachVideoToReport(ITestResult result) {
        try {
            // Retrieve the correct .mov path stored earlier
            String movPath = (String) result.getAttribute("movPath");

            if (movPath != null) {
                // Stop recording if not already stopped
                VideoRecorderUtil.stopRecording();

                // Convert MOV to MP4
                String mp4Path = VideoRecorderUtil.convertMovToMp4(movPath);
                System.out.println("MP4 Video Path: " + mp4Path);

                // Attach MP4 to report
                ExtentLogger.attachVideo("Test Video Recording", mp4Path);
            } else {
                System.err.println("No MOV path found for test: " + result.getMethod().getMethodName());
            }
        } catch (Exception e) {
            System.err.println("Error attaching video: " + e.getMessage());
        }
    }
}
