package GravityForms;

import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.HotelsLandingPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class HotelsLandingPage extends BaseClass {

    public static PageURL pageURL = new PageURL();

    public static void pageURL() throws InterruptedException {
        driver.get(pageURL.getHotelsLandingPage());
        ExtentLogger.pass("Navigate to: " + pageURL.getHotelsLandingPage());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'hotelbanner bannerwrap')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class='wp-block-heading']")));
        Thread.sleep(10000);
    }

    public static void enterFirstName(String name) {
        WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(HotelsLandingPageLocators.firstName));
        firstNameField.sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
        Assert.assertEquals(firstNameField.getAttribute("value"), name, "First Name input mismatch!");
    }

    public static void enterLastName(String name) {
        WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(HotelsLandingPageLocators.lastName));
        lastNameField.sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
        Assert.assertEquals(lastNameField.getAttribute("value"), name, "Last Name input mismatch!");
    }

    public static void enterCompanyName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(HotelsLandingPageLocators.company)).sendKeys(name);
        ExtentLogger.pass("Entered Company name as: " + name);
    }
    public static void enterEmailAddress(String email)
    {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(HotelsLandingPageLocators.emailAddress));
        emailField.sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
        Assert.assertEquals(emailField.getAttribute("value"), email, "Email Address input mismatch!");
    }

    public static void enterMobileNumber(String number) {
        WebElement mobileField = wait.until(ExpectedConditions.elementToBeClickable(HotelsLandingPageLocators.mobileNumber));
        mobileField.sendKeys(number);
        ExtentLogger.pass("Entered Mobile number as: " + number);
        String a= mobileField.getAttribute("value");
        System.out.println(a);
        Assert.assertTrue(a.contains(number), "Mobile Number input does not contain expected value!");
    }

    public static void requestDemo()
    {
        wait.until(ExpectedConditions.elementToBeClickable(HotelsLandingPageLocators.requestFreeDemo)).click();
        ExtentLogger.pass("Request Free Demo button is clicked ");
    }

    public static void displayThankYouMessage() {
        try {
            WebElement thankYouMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(HotelsLandingPageLocators.thankYouMessage));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(HotelsLandingPageLocators.validateName));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(HotelsLandingPageLocators.validateCompany));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Company field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Company is not displayed");
        }
    }

    public static void displayValidationForEmail()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(HotelsLandingPageLocators.validateEmail));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(HotelsLandingPageLocators.validatePhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Phone number is not displayed");
        }
    }

}
