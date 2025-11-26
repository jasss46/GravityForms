package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.NewContactFormLocators;
import Locators.OldContactFormLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class OldContactForm extends BaseClass {

    public static PageURL pageURL = new PageURL();

    public static void URL() throws InterruptedException {
        driver.get(pageURL.getOldContactForm());
        ExtentLogger.pass("Navigate to : " + pageURL.getOldContactForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'custom-city-banner')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);
    }

    public static void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3000)");
    }

    public static void flagVisibitly(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='iti__selected-flag'])[2]")));
    }

    public static void firstName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.firstName)).sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
    }

    public static void lastName(String name)
    {
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.lastName)).sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
    }

    public static void emailAddress(String email)
    {
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.emailAddress)).sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
    }

    public  static void phoneNumber(String number)
    {
        WebElement num = wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.phoneNumber));
        num.sendKeys(number);
        ExtentLogger.pass("Entered Mobile number as: " + number);
    }

    public static void companyOrganization(String organization)
    {
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.companyOrganization)).sendKeys(organization);
        ExtentLogger.pass("Entered Company name as: " + organization);
    }

    public static void websiteName(String website) {
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.websiteName)).sendKeys(website);
        ExtentLogger.pass("Entered Website name as: " + website);
    }

    public static void Services(String value1,String value2, String value3) throws InterruptedException {
        driver.findElement(By.xpath("//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_checkbox')]//ul//li//label[text()='"+value1+"']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_checkbox')]//ul//li//label[text()='"+value2+"']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_checkbox')]//ul//li//label[text()='"+value3+"']")).click();
        Thread.sleep(2000);
        ExtentLogger.pass("All services are selected: ");
    }

    public static void estimatedMonthlyBudget() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.estimatedMonthlyBudget)).click();
        ExtentLogger.pass("Monthly Budget Clicked:");
    }

    public static void selectOptionOfEstimatedMonthlyBudget() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.selectOptionOfEstimatedMonthlyBudget)).click();
        ExtentLogger.pass("Monthly Budget Selected:");
    }

    public static void estimatedWebDesignBudget() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.estimatedWebDesignBudget)).click();
        ExtentLogger.pass("WebDesign Budget Clicked:");
    }

    public static void selectOptionOfEstimatedWebDesignBudget()
    {
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.selectOptionOfEstimatedWebDesignBudget)).click();
        ExtentLogger.pass("WebDesign Budget Selected:");
    }

    public static void photographyVideographyBudget(){
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.photographyVideographyBudget));
        ExtentLogger.pass("Photography Videography Budget Clicked:");
    }

    public static void selectOptionOfPhotographyVideographyBudget(){
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.selectOptionOfPhotographyVideographyBudget)).click();
        ExtentLogger.pass("Photography Videography Budget Selected:");
    }

    public static void Message(String text)
    {
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.Message)).sendKeys(text);
        ExtentLogger.pass("Tell us About your business Message: " + text);
    }

    public static void aboutThrive()
    {
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.aboutThrive)).click();
        ExtentLogger.pass("About Thrive field is clicked:");
    }

    public static void enterValue(String value)
    {
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.aboutThrive)).sendKeys(value);
        ExtentLogger.pass("Value sent to About Thrive field :" + value);
    }

    public static void selectedValueAboutThrive()
    {
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.selectedValueAboutThrive)).click();
        ExtentLogger.pass("Entered about Thrive field value ");
    }

    public static void submitButton()
    {
        wait.until(ExpectedConditions.elementToBeClickable(OldContactFormLocator.submitButton)).click();
        ExtentLogger.pass("Button is clicked");
    }

    public static void displayThankYouMessage()
    {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(OldContactFormLocator.thankYouMessage));
            ExtentLogger.pass("Message: Thank you Message displayed");
        } catch (Exception ex) {
            ExtentLogger.fail("Failed to display Thank you message");
        }
    }

    public static void displayValidationForName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(OldContactFormLocator.validateName));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(OldContactFormLocator.validateEmail));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(OldContactFormLocator.validatePhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Phone number is not displayed");
        }
    }

    public static void displayValidationForOrganization()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(OldContactFormLocator.validateOrganization));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Company/Organization field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Company/Organization is not displayed");
        }
    }

    public static void displayValidationForServices()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(OldContactFormLocator.validateServices));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Services field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Services is not displayed");
        }
    }
}