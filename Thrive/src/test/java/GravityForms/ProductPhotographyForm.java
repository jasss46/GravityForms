package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.OldContactFormLocator;
import Locators.ProductFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPhotographyForm extends BaseClass {
    public static PageURL pageURL = new PageURL();

    public  static void pageURL() throws InterruptedException {
        driver.get(pageURL.getProductPhotographyForm());
        ExtentLogger.pass("Navigate to: "+ pageURL.getProductPhotographyForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'builder-global-templates')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);
    }

    public static void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3000)");
    }

    public static void firstName(String name){
        wait.until(ExpectedConditions.elementToBeClickable(ProductFormLocators.firstName)).sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
    }
    public static void lastName(String name){
        wait.until(ExpectedConditions.elementToBeClickable(ProductFormLocators.lastName)).sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
    }

    public static void emailAddress(String email){
        wait.until(ExpectedConditions.elementToBeClickable(ProductFormLocators.emailAddress)).sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
    }
    public static void phoneNumber(String phone){
        wait.until(ExpectedConditions.elementToBeClickable(ProductFormLocators.phoneNumber)).sendKeys(phone);
        ExtentLogger.pass("Entered Mobile number as: " + phone);
    }

    public static void Message(String message){
        wait.until(ExpectedConditions.elementToBeClickable(ProductFormLocators.Message)).sendKeys(message);
        ExtentLogger.pass("Tell us About your business Message: " + message);
    }

    public static void aboutThrive(){
        wait.until(ExpectedConditions.elementToBeClickable(ProductFormLocators.aboutThrive)).click();
        ExtentLogger.pass("About Thrive field is clicked:");
    }

    public static void enterValueOfAboutThrive(String value){
        wait.until(ExpectedConditions.elementToBeClickable(ProductFormLocators.aboutThrive)).sendKeys(value);
        ExtentLogger.pass("Value sent to About Thrive field :" + value);
    }

    public static void selectedValueOfAboutThrive(){
        wait.until(ExpectedConditions.elementToBeClickable(ProductFormLocators.selectedValueOfAboutThrive)).click();
        ExtentLogger.pass("Entered about Thrive field value: ");
    }

    public static void uploadFile(String filePath) {
        wait.until(ExpectedConditions.presenceOfElementLocated(ProductFormLocators.uploadFile))
                .sendKeys(filePath);
        ExtentLogger.pass("File uploaded: " + filePath);
    }

    public static void submitButton(){
        wait.until(ExpectedConditions.elementToBeClickable(ProductFormLocators.submitButton)).click();
        ExtentLogger.pass("Message: Submit Button Clicked");
    }

    public static void displayThankYouMessage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(ProductFormLocators.thankYouMessage));
            ExtentLogger.pass("Message: Thank you Message displayed");
        } catch (Exception ex) {
            ExtentLogger.fail("Failed to display Thank you message");
        }
    }

    public static void displayValidationForName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ProductFormLocators.validateName));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Name field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Name is not displayed");
        }
    }

    public static void displayValidationForEmail()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ProductFormLocators.validateEmail));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Email field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Email is not displayed");
        }
    }

    public static void displayValidationForPhone()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ProductFormLocators.validatePhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Phone number is not displayed");
        }
    }
    public static void displayValidationForMessage()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ProductFormLocators.validateMessage));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Message field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Message is not displayed");
        }
    }
    public static void displayValidationForFile()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ProductFormLocators.validateFile));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Upload file is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Upload file is not displayed");
        }
    }
}