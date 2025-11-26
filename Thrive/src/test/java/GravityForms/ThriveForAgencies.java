package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.RFPTemplateFormLocators;
import Locators.ThriveAgenciesFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ThriveForAgencies extends BaseClass {

    public static PageURL pageurl = new PageURL();

    public static void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,3000)");
    }

    public static void pageURL() throws InterruptedException {
        driver.get(pageurl.getThriveForAgenciesForm());
        ExtentLogger.pass("Navigate to :" + pageurl.getThriveForAgenciesForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'landing-page-content1')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);

    }
    public static void enterFirstName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveAgenciesFormLocators.getFirstName)).sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
    }

    public static void enterLastName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveAgenciesFormLocators.lastName)).sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
    }

    public static void enterCompanyName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveAgenciesFormLocators.company)).sendKeys(name);
        ExtentLogger.pass("Entered Company name as: " + name);
    }

    public static void enterEmailAddress(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveAgenciesFormLocators.emailAddress)).sendKeys(name);
        ExtentLogger.pass("Entered Email Address  as: " + name);
    }

    public static void enterMobileNumber(String number) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveAgenciesFormLocators.phoneNumber)).sendKeys(number);
        ExtentLogger.pass("Entered Phone Number as: " + number);
    }

    public static void enterWebsiteAddress(String name) {
      WebElement a= wait.until(ExpectedConditions.elementToBeClickable(ThriveAgenciesFormLocators.website));
      a.click();
      a.sendKeys(name);
        ExtentLogger.pass("Entered Email Address  as: " + name);
    }

    public static void enterTextArea(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveAgenciesFormLocators.textArea)).sendKeys(name);
        ExtentLogger.pass("Entered Email Address  as: " + name);
    }

    public static void clickHowDidYouHearField() {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveAgenciesFormLocators.howDidYouHear)).click();
        ExtentLogger.pass("How did you hear about Thrive Clicked: ");
    }

    public static void enterValueInAboutThriveField(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveAgenciesFormLocators.howDidYouHear)).sendKeys(name);
        ExtentLogger.pass("Entered value name: a");
    }

    public static void selectAdforum() {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveAgenciesFormLocators.adForum)).click();
        ExtentLogger.pass("Selected Value: Adforum");
    }

    public static void clickSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(ThriveAgenciesFormLocators.newSubmitButton)).click();
        ExtentLogger.pass("Submit button clicked");
    }
    public static void displayThankYouMessage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(ThriveAgenciesFormLocators.thankYouMessage));
            ExtentLogger.pass("Message: Thank you Message displayed");
        } catch (Exception ex) {
            ExtentLogger.fail("Failed to display Thank you message");
        }
    }

    public static void displayValidationForName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ThriveAgenciesFormLocators.validateName));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ThriveAgenciesFormLocators.validateEmail));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ThriveAgenciesFormLocators.validatePhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Phone number is not displayed");
        }
    }
    public static void displayValidationForCompany()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ThriveAgenciesFormLocators.validateCompany));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Company field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Company field is not displayed");
        }
    }
}