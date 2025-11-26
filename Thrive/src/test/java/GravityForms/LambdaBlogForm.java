package GravityForms;
import Config.BaseClass;
import Config.BaseDeviceTest;
import Config.BaseTest;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.BlogFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LambdaBlogForm extends BaseDeviceTest
{
    public static PageURL pageURL = new PageURL();

    public  static void URL() throws InterruptedException {
        driver.get(pageURL.getBlogForm());
        ExtentLogger.pass("Navigate to: " + pageURL.getBlogForm());
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='newblogouterwrap']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);
    }


    public static void emailAddress(String email)
    {
        wait.until(ExpectedConditions.elementToBeClickable(BlogFormLocators.emailAddress)).sendKeys(email);
        ExtentLogger.pass("Entered Email Address:" + email);
    }

    public static void subscribeButton()
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(BlogFormLocators.subscribeButton)).click();
        ExtentLogger.pass("Subscribe Button is clicked");
    }

    public static void displayThankYouMessage()
    {
        try
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(BlogFormLocators.thankYouMessage));
            ExtentLogger.pass("Message: Thank you Message displayed");
        } catch (Exception ex)
        {
            ExtentLogger.fail("Failed to display Thank you message");
        }
    }

    public static void displayValidation()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(BlogFormLocators.validationMessage));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Email field is required->"+errorMsg);
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation not displayed");
        }
    }

}