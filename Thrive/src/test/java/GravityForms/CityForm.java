package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.BlogFormLocators;
import Locators.CityFormLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CityForm extends BaseClass {

   public static PageURL pageURL = new PageURL();

    public static void pageURL() throws InterruptedException {
        driver.get(pageURL.getCityForm());
        ExtentLogger.pass("Navigate to: " + pageURL.getCityForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//article[@aria-label='Arlington Digital Marketing Agency']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);
    }

    public static void arrowClick(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='contact-tick']"))).click();
    }

    public static void companySize() {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.companySize)).click();
        ExtentLogger.pass("Company Size field is clicked");
    }

    public static void selectCompanySize() {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.selectCompanySize)).click();
        ExtentLogger.pass("Company Size field is selected");
    }

    public static void websiteAddress(String website) {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.websiteAddress)).sendKeys(website);
        ExtentLogger.pass("Entered Website name as: " + website);
    }

    public static void aboutThrive() {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.aboutThrive)).click();
        ExtentLogger.pass("About Thrive field is clicked:");
    }

    public static void enterValueForAboutThrive(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.aboutThrive)).sendKeys(name);
        ExtentLogger.pass("Value sent to About Thrive field :" + name);
    }

    public static void enterValueFacebook() {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.FacebookAgency)).click();
        ExtentLogger.pass("Entered about Thrive field value: ");
    }

    public static void textArea(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.textArea)).sendKeys(name);
        ExtentLogger.pass("Entered TextArea name as: " + name);
    }

    public static void getStartedButton() {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.getStartedButton)).click();
        ExtentLogger.pass("Message: Submit Button Clicked");
    }

    public static void enterFirstName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.firstName)).sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
    }

    public static void enterLastName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.lastName)).sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
    }

    public static void companyOrganization(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.companyOrganization)).sendKeys(name);
        ExtentLogger.pass("Entered Company name as: " + name);
    }

    public static void phoneNumber(String number) {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.phoneNumber)).sendKeys(number);
        ExtentLogger.pass("Entered Mobile number as: " + number);
    }

    public static void emailAddress(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.emailAddress)).sendKeys(name);
        ExtentLogger.pass("Entered Email Address as: " + name);
    }

    public static void startedButton() {
        wait.until(ExpectedConditions.elementToBeClickable(CityFormLocator.startedButton)).click();
        ExtentLogger.pass("Message: Submit Button Clicked");
    }

    public static void displayThankYouMessage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(CityFormLocator.thankYouMessage));
            ExtentLogger.pass("Message: Thank you Message displayed");
            Assert.assertTrue(driver.findElement(CityFormLocator.thankYouMessage).isDisplayed(), "Thank you message is not displayed");
        } catch (Exception ex) {
            ExtentLogger.fail("Failed to display Thank you message");
            Assert.fail("Failed to display Thank you message");
        }
    }
    public static void displayValidation()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(CityFormLocator.displayValidation));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Company size field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation not displayed");
        }
    }
    public static void displayValidationForName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(CityFormLocator.validationForName));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(CityFormLocator.validationForOrganization));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(CityFormLocator.validationForPhone));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(CityFormLocator.validationForEmail));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Email field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Email is not displayed");
        }
    }
}