package GravityForms;

import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.PDFGuideFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PDFGuideForm extends BaseClass {

    public static PageURL pageURL = new PageURL();

    public static void pageURL() throws InterruptedException {
        driver.get(pageURL.getFreePdfGuideForm());
        ExtentLogger.pass("Navigate to: " + pageURL.getFreePdfGuideForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='landing-page-content1']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='sec-heading-title exchange-campaign'])[1]"))).click();
        Thread.sleep(10000);
    }

    public static void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3000)");
    }

    public static void enterName(String name) {
        WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(PDFGuideFormLocators.name));
        firstNameField.sendKeys(name);
        ExtentLogger.pass("Entered Name as: " + name);
        Assert.assertEquals(firstNameField.getAttribute("value"), name, "Name input mismatch!");
    }

    public static void enterEmailAddress(String email)
    {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(PDFGuideFormLocators.email));
        emailField.sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
        Assert.assertEquals(emailField.getAttribute("value"), email, "Email Address input mismatch!");
    }

    public static void getFreeguide()
    {
        wait.until(ExpectedConditions.elementToBeClickable(PDFGuideFormLocators.freeGuideBtn)).click();
        ExtentLogger.pass("Get My Free Guide button is clicked ");
    }

    public static void verifyNavigationToPdf() throws InterruptedException {
        wait.until(ExpectedConditions.urlToBe(PDFGuideFormLocators.url));
        Thread.sleep(3000);
        String pdf = driver.getCurrentUrl();
        Assert.assertEquals(pdf,PDFGuideFormLocators.url);
        ExtentLogger.pass("User is navigated to pdf");

    }
}
