package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.BlogFormLocators;
import Locators.GMBFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GMBGuideForm extends BaseClass
{
    public static PageURL pageURL = new PageURL();

    public static void URL() throws InterruptedException {
        driver.get(pageURL.getGMBGuideForm());
        ExtentLogger.pass("Navigate to:" + pageURL.getGMBGuideForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,' gmb-banner-wrapper')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='gmb-guide-list']/li[1]"))).click();
        Thread.sleep(10000);
    }


    public static void downloadButton()
    {
        wait.until(ExpectedConditions.elementToBeClickable(GMBFormLocators.downloadButton)).click();
        ExtentLogger.pass("Message: Download Button Clicked");
    }

    public  static void Name(String name)
    {
        wait.until(ExpectedConditions.elementToBeClickable(GMBFormLocators.Name)).sendKeys(name);
        ExtentLogger.pass("Entered name as: " + name);
    }
    public  static void emailAddress(String email)
    {
        wait.until(ExpectedConditions.elementToBeClickable(GMBFormLocators.emailAddress)).sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
    }

    public static void getAccessButton()
    {
        wait.until(ExpectedConditions.elementToBeClickable(GMBFormLocators.getAccessButton)).click();
        ExtentLogger.pass("Message: Submit Button Clicked");
    }

    public static void displayMessage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(GMBFormLocators.displayMessage));
            ExtentLogger.pass("Message: Thank you Message displayed");
        } catch (Exception ex) {
            ExtentLogger.fail("Failed to display Thank you message");
        }
    }

    public static void displayValidation()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(GMBFormLocators.validationMsg));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Email field is required->"+errorMsg);
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation not displayed");
        }
    }

}