package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import ExtentReporter.ExtentLogger;
import GravityForms.SEOAuditReportForm;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class SeoAuditReportFormTestCase extends BaseClass {
    static org.openqa.selenium.Alert Alert;

    @Test(priority = 1)
    public void RunSeoAuditForm() throws InterruptedException {
        SEOAuditReportForm.pageURL();
        SEOAuditReportForm.scrollDown();
        SEOAuditReportForm.firstName("Jaswinder");
        SEOAuditReportForm.lastName("Singh");
        SEOAuditReportForm.enterWebsite("https://thriveagency.com");
        SEOAuditReportForm.emailAddress(generateUniqueEmailWithTimestamp());
        SEOAuditReportForm.getFreeReportNowButton();
        SEOAuditReportForm.displayReport();
    }

    @Test(priority = 2)
    public void ValidateSEOAuditForm() throws InterruptedException
    {
        SEOAuditReportForm.pageURL();
        SEOAuditReportForm.scrollDown();
        SEOAuditReportForm.getFreeReportNowButton();
        Alert= driver.switchTo().alert();
        String firstAlert= Alert.getText();
        ExtentLogger.pass("Alert says:" + firstAlert);
        Alert.accept();
        SEOAuditReportForm.enterWebsite("https://thriveagency.com");
        SEOAuditReportForm.getFreeReportNowButton();
        Alert= driver.switchTo().alert();
        String secondAlert= Alert.getText();
        ExtentLogger.pass("Alert says:" + secondAlert);
        Alert.accept();
        SEOAuditReportForm.emailAddress(generateUniqueEmailWithTimestamp());
        SEOAuditReportForm.getFreeReportNowButton();
        SEOAuditReportForm.displayReport();
    }

    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }

}