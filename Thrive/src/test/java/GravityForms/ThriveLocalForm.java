package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.ThriveLocalFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class ThriveLocalForm extends BaseClass {
    public static PageURL pageURL = new PageURL();


    public static void openPage() throws InterruptedException {
        driver.get(pageURL.getThriveLocalForm());
        ExtentLogger.pass("Navigated to: " + pageURL.getThriveLocalForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'landing-page-content1')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);
    }

    public static void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3000)");
    }

    public static void enterFirstName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveLocalFormLocators.firstName)).sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
        Assert.assertEquals(driver.findElement(ThriveLocalFormLocators.firstName).getAttribute("value"), name, "First name is not entered correctly");
    }

    public static void enterLastName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveLocalFormLocators.lastName)).sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
        Assert.assertEquals(driver.findElement(ThriveLocalFormLocators.lastName).getAttribute("value"), name, "Last name is not entered correctly");
    }

    public static void companyName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveLocalFormLocators.companyName)).sendKeys(name);
        ExtentLogger.pass("Entered Company name as: " + name);
        Assert.assertEquals(driver.findElement(ThriveLocalFormLocators.companyName).getAttribute("value"), name, "Company name is not entered correctly");
    }

    public static void emailAddress(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveLocalFormLocators.emailAddress)).sendKeys(email);
        ExtentLogger.pass("Entered Email Address: " + email);
    }
    private static void captureEmailValidationError(String email) {
        WebElement error = driver.findElement(By.xpath("((//div[contains(@class,'wp-block-columns')]//form//div[contains(@class,'gfield_validation_message')])[3])"));
        String errorMessage = error.getText();
        ExtentLogger.fail("Invalid email format: " + email + ". " + errorMessage);
    }

    public static void enterMobileNumber(String number) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveLocalFormLocators.phoneNumber)).sendKeys(number);
        ExtentLogger.pass("Entered Mobile number as: " + number);
    }

    public static void marketingBudget() {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveLocalFormLocators.marketingBudget)).click();
        ExtentLogger.pass("Marketing Budget is Clicked");
    }

    public static void selectMarketingBudget() {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveLocalFormLocators.selectMarketingBudget)).click();
        ExtentLogger.pass("Marketing Budget is selecetd");
    }
    public static void hearAboutThriveLocal() {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveLocalFormLocators.hearAboutThriveLocal)).click();
        ExtentLogger.pass("About Thrive field is clicked:");
    }

    public static void enterValueForAboutThrive(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveLocalFormLocators.hearAboutThriveLocal)).sendKeys(name);
        ExtentLogger.pass("Value sent to About Thrive field");
    }

    public static void selectedHearAbout() {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveLocalFormLocators.selectedHearAbout)).click();
        ExtentLogger.pass("About Thrive field value is selected");
    }

    public static void freeDemoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveLocalFormLocators.freeDemoButton)).click();
        ExtentLogger.pass("Button is clicked");
    }

    public static void displayThankYouMessage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(ThriveLocalFormLocators.thankYouMessage));
            ExtentLogger.pass("Message: Thank you Message displayed");
            Assert.assertTrue(driver.findElement(ThriveLocalFormLocators.thankYouMessage).isDisplayed(), "Thank you message is not displayed");
        } catch (Exception ex) {
            ExtentLogger.fail("Failed to display Thank you message");
            Assert.fail("Failed to display Thank you message");
        }
    }

    public static void displayValidationForName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ThriveLocalFormLocators.validateName));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Name field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Name is not displayed");
        }
    }

    public static void displayValidationForCompany()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ThriveLocalFormLocators.validateCompany));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Company field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Company field is not displayed");
        }
    }

    public static void displayValidationForEmail()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ThriveLocalFormLocators.validateEmail));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ThriveLocalFormLocators.validatePhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Phone number is not displayed");
        }
    }

}