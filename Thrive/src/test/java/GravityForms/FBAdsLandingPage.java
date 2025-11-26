package GravityForms;

import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.FBAdsLandingPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class FBAdsLandingPage extends BaseClass {

    public static PageURL pageURL = new PageURL();

    public static void pageURL() throws InterruptedException {
        driver.get(pageURL.getFbAdsLandingPage());
        ExtentLogger.pass("Navigate to: " + pageURL.getFbAdsLandingPage());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//article[@aria-label='FB ADS Landing Page']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);

    }

    public static void enterFirstName(String name) {
        WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.firstName));
        firstNameField.sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
        Assert.assertEquals(firstNameField.getAttribute("value"), name, "First Name input mismatch!");
    }

    public static void enterLastName(String name) {
        WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.lastName));
        lastNameField.sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
        Assert.assertEquals(lastNameField.getAttribute("value"), name, "Last Name input mismatch!");
    }

    public static void enterCompanyName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.company)).sendKeys(name);
        ExtentLogger.pass("Entered Company name as: " + name);
    }

    public static void enterWebsite(String website)
    {
        wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.website)).sendKeys(website);
        ExtentLogger.pass("Entered Company name as: " + website);
    }

    public static void enterEmailAddress(String email)
    {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.email));
        emailField.sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
        Assert.assertEquals(emailField.getAttribute("value"), email, "Email Address input mismatch!");
    }

    public static void enterPhoneNumber(String number) {
        WebElement mobileField = wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.phoneNumber));
        mobileField.sendKeys(number);
        ExtentLogger.pass("Entered Mobile number as: " + number);
        String a= mobileField.getAttribute("value");
        System.out.println(a);
        Assert.assertTrue(a.contains(number), "Mobile Number input does not contain expected value!");
    }
    public static void monthlyMarketingBudget() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.monthlyBudget)).click();
        ExtentLogger.pass("Monthly Budget Clicked");
    }

    public static void selectOptionOfMonthlyMarketingBudget() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.selectMonthlyBudget)).click();
        ExtentLogger.pass("Monthly Budget Selected");
    }

    public static void enterBusinessDescription(String description)
    {
        wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.describeYourBusiness)).sendKeys(description);
        ExtentLogger.pass("Business decsribed as :" + description);

    }

    public static void enterValueOfAboutThrive(String value){
        wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.hearAboutThrive)).click();
        ExtentLogger.pass("About Thrive field is clicked:");
        wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.hearAboutThrive)).sendKeys(value);
        ExtentLogger.pass("Value sent to About Thrive field :" + value);
    }

    public static void selectedValueOfAboutThrive()
    {
        wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.selectAboutThrive)).click();
        ExtentLogger.pass("Entered about Thrive field value.");
    }

    public static void scheduleCall()
    {
        wait.until(ExpectedConditions.elementToBeClickable(FBAdsLandingPageLocators.scheduleCallBtn)).click();
        ExtentLogger.pass("Schedule Call button is clicked");
    }
    public static void displayThankYouMessage() {
        try {
            WebElement thankYouMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(FBAdsLandingPageLocators.thankYouMessage));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(FBAdsLandingPageLocators.validateName));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(FBAdsLandingPageLocators.validateCompany));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Company field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Company is not displayed");
        }
    }

    public static void displayValidationForWebsite()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(FBAdsLandingPageLocators.validateWebsite));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Website field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Website is not displayed");
        }
    }

    public static void displayValidationForEmail()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(FBAdsLandingPageLocators.validateEmail));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(FBAdsLandingPageLocators.validatePhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Phone number is not displayed");
        }
    }

    public static void displayValidationForBudget()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(FBAdsLandingPageLocators.validateMonthlyBudget));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Monthly budget field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Monthly budget is not displayed");
        }
    }

    public static void displayValidationForBusiness()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(FBAdsLandingPageLocators.validateBusiness));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Tell us about your business field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Tell us about your business is not displayed");
        }
    }



}
