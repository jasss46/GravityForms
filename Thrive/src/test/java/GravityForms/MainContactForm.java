package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.BlogFormLocators;
import Locators.CityFormLocator;
import Locators.MainContactFormLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import java.util.List;

public class MainContactForm extends BaseClass {
    public static PageURL pageURL = new PageURL();

    public static void pageURL() throws InterruptedException {
        driver.get(pageURL.getMainContactForm());
        ExtentLogger.pass("Navigate to: " + pageURL.getMainContactForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'main-contactwrap has-background')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);
    }

    public static void enterFirstName(String name) {
        WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.firstName));
        firstNameField.sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
        Assert.assertEquals(firstNameField.getAttribute("value"), name, "First Name input mismatch!");
    }

    public static void enterLastName(String name) {
        WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.lastName));
        lastNameField.sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
        Assert.assertEquals(lastNameField.getAttribute("value"), name, "Last Name input mismatch!");
    }

    public static void enterCompanyName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.company)).sendKeys(name);
        ExtentLogger.pass("Entered Company name as: " + name);
    }

    public static void enterWebsiteName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.website)).sendKeys(name);
        ExtentLogger.pass("Entered Website name as: " + name);
    }

    public static void enterEmailAddress(String email)
    {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.emailAddress));
        emailField.sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
        Assert.assertEquals(emailField.getAttribute("value"), email, "Email Address input mismatch!");
    }

    public static void enterMobileNumber(String number) {
        WebElement mobileField = wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.mobileNumber));
        mobileField.sendKeys(number);
        ExtentLogger.pass("Entered Mobile number as: " + number);
        String a= mobileField.getAttribute("value");
        System.out.println(a);
        Assert.assertTrue(a.contains(number), "Mobile Number input does not contain expected value!");
    }
    public static void enterCompanySize() {
        wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.companySize)).click();
        ExtentLogger.pass("Company Size field is clicked");
    }

    public static void enterCompanySize1() {
        wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.companySize1)).click();
        ExtentLogger.pass("Company Size filed is selected: ");
    }

    public static void clickAboutThrive() {
        wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.aboutThrive)).click();
        ExtentLogger.pass("About Thrive field is clicked:");
    }

    public static void enterValueForAboutThrive(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.aboutThrive)).sendKeys(name);
        ExtentLogger.pass("Value sent to About Thrive field :" + name);
    }

    public static void enterValueAd() {
        wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.adForum)).click();
        ExtentLogger.pass("Entered about Thrive field value: ");
    }

    public static void clickAllServices() {
        List<WebElement> elementToClick = driver.findElements(MainContactFormLocator.checkboxes);
        for (WebElement AllCheck : elementToClick) {
            AllCheck.click();
        }
        ExtentLogger.pass("All services are selected: ");
    }

    public static void enterTextInTextArea(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.textArea)).sendKeys(name);
        ExtentLogger.pass("Tell us About your business Message: " + name);
    }


    public static void clickOnSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(MainContactFormLocator.getMyFreeProposal)).click();
        ExtentLogger.pass("Message: Submit Button Clicked");
    }

    public static void displayThankYouMessage() {
        try {
            WebElement thankYouMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(MainContactFormLocator.thankYouMessage));
            Assert.assertTrue(thankYouMsg.isDisplayed(), "Thank You message was not displayed!");
            ExtentLogger.pass("Message: Thank you Message displayed");
        } catch (Exception ex) {
            ExtentLogger.fail("Failed to display Thank you message");
            Assert.fail("Thank You message verification failed");
        }
    }

    public static void displayValidationForName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(MainContactFormLocator.validateName));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(MainContactFormLocator.validateCompany));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(MainContactFormLocator.validatePhone));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(MainContactFormLocator.validateEmail));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Email field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Email is not displayed");
        }
    }

    public static void displayValidationForCompanySize()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(MainContactFormLocator.validateCompanySize));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Company size field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Company size is not displayed");
        }
    }
    public static void displayValidationForServices()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(MainContactFormLocator.validateServices));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Services field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Services is not displayed");
        }
    }
}