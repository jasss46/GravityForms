package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.SeoAuditReportFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SEOAuditReportForm extends BaseClass {

   public static PageURL pageURL = new PageURL();

    public static void pageURL() throws InterruptedException {
    driver.get(pageURL.getSeoAuditForm());
        ExtentLogger.pass("Navigate to Page:");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'lazyloaded topLeafBG')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);
    }

    public static void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3000)");
    }

    public static void firstName(String name)
    {
        wait.until(ExpectedConditions.elementToBeClickable(SeoAuditReportFormLocators.firstName)).sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
    }

    public static void lastName(String name)
    {
        wait.until(ExpectedConditions.elementToBeClickable(SeoAuditReportFormLocators.lastName)).sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
    }

    public static void enterWebsite(String website){
        wait.until(ExpectedConditions.elementToBeClickable(SeoAuditReportFormLocators.enterWebsite)).sendKeys(website);
        ExtentLogger.pass("Entered Website Name as: " + website);
    }

    public static void emailAddress(String email){
        wait.until(ExpectedConditions.elementToBeClickable(SeoAuditReportFormLocators.emailAddress)).sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
    }

    public static void getFreeReportNowButton(){
        wait.until(ExpectedConditions.elementToBeClickable(SeoAuditReportFormLocators.getFreeReportNowButton)).click();
        ExtentLogger.pass("Button is clicked");
    }

    public static void displayReport()
    {
        try {
            WebElement displayReport = wait.until(ExpectedConditions.visibilityOfElementLocated(SeoAuditReportFormLocators.displayReport));
            Assert.assertTrue(displayReport.isDisplayed(), "Report is displayed");
            ExtentLogger.pass("Message: Report is displayed");
        } catch (Exception ex) {
            ExtentLogger.fail("Failed to display Report");
            Assert.fail("Report displayed verification failed");
        }
    }
}