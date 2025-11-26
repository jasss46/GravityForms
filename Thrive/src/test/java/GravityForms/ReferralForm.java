package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.ProductFormLocators;
import Locators.ReferralFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReferralForm extends BaseClass {

    public static PageURL pageURL = new PageURL();


    public static void pageURL() throws InterruptedException {
        driver.get(pageURL.getReferralForm());
        ExtentLogger.pass("Navigate to : " + pageURL.getReferralForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'landing-page-content')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);
    }
    public static void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000)");
    }

    public static void enterFirstName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.fieldFirstName)).sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
    }

    public static void enterLastName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.getFieldLastName)).sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
    }

    public static void enterEmailAddress(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.emailAddress)).sendKeys(name);
        ExtentLogger.pass("Entered Email Address  as: " + name);
    }
    public static void flagVisibitly(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='iti__selected-flag'])[2]")));
    }

    public static void enterPhoneNumber(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.phoneNumber)).sendKeys(name);
        ExtentLogger.pass("Entered Phone number as: " + name);
    }

    public static void enterReferralFirstName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.referralFirstName)).sendKeys(name);
        ExtentLogger.pass("Referral First Name is : " + name);
    }

    public static void enterReferralLastName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.referralSecondName)).sendKeys(name);
        ExtentLogger.pass("Referral Last Name is :" + name);
    }

    public static void enterReferralPhoneNumber(String number) {
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.referralPhoneNumber)).sendKeys(number);
        ExtentLogger.pass("Referral Phone number is:" + number);
    }

    public static void enterReferralEmail(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.referralEmail)).sendKeys(name);
        ExtentLogger.pass(" Referral Email is :" + name);
    }

    public static void enterMessage(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.messageBox)).sendKeys(name);
        ExtentLogger.pass(" Entered Message as :" + name);
    }

    public static void aboutThrive(){
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.aboutThrive)).click();
    }

    public static void enterValueOfAboutThrive(String value){
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.aboutThrive)).sendKeys(value);
    }

    public static void valueOfAboutThrive(){
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.valueOfAboutThrive)).click();
    }

    public static void clickSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ReferralFormLocators.submitButton)).click();
        ExtentLogger.pass(" Submit Button Clicked");
    }

    public static void displayThankYouMessage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(ReferralFormLocators.thankYouMessage));
            ExtentLogger.pass("Message: Thank you Message displayed");
        } catch (Exception ex) {
            ExtentLogger.fail("Failed to display Thank you message");
        }
    }

    public static void displayValidationForName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ReferralFormLocators.validateName));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ReferralFormLocators.validateEmail));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ReferralFormLocators.validatePhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Phone number is not displayed");
        }
    }

    public static void displayValidationForReferralName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ReferralFormLocators.validateReferralName));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Referral Name field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Referral Name is not displayed");
        }
    }

    public static void displayValidationForReferralEmail()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ReferralFormLocators.validateReferralEmail));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Referral Email field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Referral Email is not displayed");
        }
    }

    public static void displayValidationForReferralPhone()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ReferralFormLocators.validateReferralPhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Referral Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Referral Phone number is not displayed");
        }
    }

    public static void displayValidationForServicesRequired()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ReferralFormLocators.validateServicesNeeded));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Services needed  field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Service needed is not displayed");
        }
    }
}
