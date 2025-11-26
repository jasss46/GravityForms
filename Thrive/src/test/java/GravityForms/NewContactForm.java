package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.MainContactFormLocator;
import Locators.NewContactFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class NewContactForm extends BaseClass
{
    public static PageURL pageURL = new PageURL();

    public static void URL() throws InterruptedException {
        driver.get(pageURL.newContactForm);
        ExtentLogger.pass("Navigated to: " + pageURL.getNewContactForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='content-sidebar-wrap']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);
    }

    public static void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3000)");
    }

    public static void enterFirstName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.firstName)).sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
    }

    public static void enterLastName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.lastName)).sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
    }

    public static void companyName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.companyOrganizationName)).sendKeys(name);
        ExtentLogger.pass("Entered Company name as: " + name);
    }

    public static void websiteAddress(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.websiteName)).sendKeys(name);
        ExtentLogger.pass("Entered Website name as: " + name);
    }
    public static void emailAddress(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.emailAddress)).sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
    }

    public static void phoneNumber(String number) {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.mobileNumber)).sendKeys(number);
        ExtentLogger.pass("Entered Mobile number as: " + number);
    }
    public static void services() {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.clickServices)).click();
        ExtentLogger.pass("Services field is clicked");
    }

    public static void selectServies() {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.selectServices)).click();
        ExtentLogger.pass("Service is selected");
    }

    public static void companySize() {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.clickCompanySize)).click();
        ExtentLogger.pass("Company Size field is clicked");
    }

    public static void selectCompanySize() {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.selectCompanySize)).click();
        ExtentLogger.pass("Company Size field is selected");
    }

    public static void aboutThrive() {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.clickAboutThrive)).click();
        ExtentLogger.pass("About Thrive field is clicked:");
    }

    public static void enterValueForAboutThrive(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.clickAboutThrive)).sendKeys(name);
        ExtentLogger.pass("Value sent to About Thrive field :" + name);
    }

    public static void enterValueVideoAd() {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.selectAboutThrive)).click();
        ExtentLogger.pass("Entered about Thrive field value: ");
    }

    public static void enterTextInTextArea(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.tellUsAboutYourBusiness)).sendKeys(name);
        ExtentLogger.pass("Tell us About your business Message: " + name);
    }

    public static void freeDemoButton() {
        wait.until(ExpectedConditions.elementToBeClickable(NewContactFormLocators.sendMeFreeProposalButton)).click();
        ExtentLogger.pass("Button is clicked:");
    }

    public static void displayThankYouMessage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(NewContactFormLocators.thankYouMessage));
            ExtentLogger.pass("Message: Thank you Message displayed");
            Assert.assertTrue(driver.findElement(NewContactFormLocators.thankYouMessage).isDisplayed(), "Thank you message is not displayed");
        } catch (Exception ex) {
            ExtentLogger.fail("Failed to display Thank you message");
            Assert.fail("Failed to display Thank you message");
        }
    }

    public static void displayValidationForName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(NewContactFormLocators.validateName));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Name field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Name is not displayed");
        }
    }

    public static void displayValidationForOrganization()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(NewContactFormLocators.validateOrganization));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Company/Organization field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Company/Organization is not displayed");
        }
    }

    public static void displayValidationForPhone()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(NewContactFormLocators.validatePhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Phone number is not displayed");
        }
    }

    public static void displayValidationForEmail()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(NewContactFormLocators.validateEmail));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Email field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Email is not displayed");
        }
    }
    public static void displayValidationForServices()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(NewContactFormLocators.validateServices));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Services field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Services is not displayed");
        }
    }
    public static void displayValidationForCompanySize()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(NewContactFormLocators.validateCompanySize));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Company size field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Company size is not displayed");
        }
    }

}