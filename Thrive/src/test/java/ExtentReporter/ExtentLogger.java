package ExtentReporter;

import com.aventstack.extentreports.MediaEntityBuilder;

import static ExtentReporter.ExtentReport.test;

public class ExtentLogger {
    private ExtentLogger() {
    }

    /**
     * Add test steps in extent report for the passing actions
     * @param message
     */
    public static void pass(String message) {
        test.pass(message);
    }

    public static void info(String message) {
        test.info(message);
    }
    /**
     * Add test steps in extent report for the failing actions
     * @param message
     */
//    public static void fail(String message) {
//        ExtentReport.test.fail(MarkupHelper.createLabel(message, ExtentColor.RED));
//    }s

    public static void fail(String message) {
        test.fail(message);
    }

    public static void failWithScreenshot(String message, String screenshotPath) {
        try {
            test.fail(message,
                    MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
        } catch (Exception e) {
            test.fail(message + " (Screenshot attachment failed: " + e.getMessage() + ")");
        }
    }
    /**
     * Attach video inside Extent Report using HTML5 video tag
     */
    public static void attachVideo(String message, String videoPath) {
        // Convert Windows path to URI-style (file:///)
        String finalPath = "file:///" + videoPath.replace("\\", "/");

        // Attach clickable link instead of embedded video
        ExtentLogger.info("Test Video Recording: " +
                "<a href='" + finalPath + "' target='_blank'>Click to view recording.</a>");

    }
}
