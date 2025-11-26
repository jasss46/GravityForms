package GravityForms;

import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.AIStrategySessionLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AIStrategySessionForm extends BaseClass {

    public static PageURL pageURL = new PageURL();

    public static void pageURL() throws InterruptedException {
        driver.get(pageURL.getAIStrategySession());
        ExtentLogger.pass("Navigate to: " + pageURL.getAIStrategySession());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'aibanner bannerwrap')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='demoform']/h1"))).click();
        Thread.sleep(10000);
    }

    public static void enterFirstName(String name) {
        WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(AIStrategySessionLocators.firstName));
        firstNameField.sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
        Assert.assertEquals(firstNameField.getAttribute("value"), name, "First Name input mismatch!");
    }

    public static void enterLastName(String name) {
        WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(AIStrategySessionLocators.lastName));
        lastNameField.sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
        Assert.assertEquals(lastNameField.getAttribute("value"), name, "Last Name input mismatch!");
    }

    public static void enterCompanyName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(AIStrategySessionLocators.company)).sendKeys(name);
        ExtentLogger.pass("Entered Company name as: " + name);
    }

    public static void enterEmailAddress(String email)
    {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(AIStrategySessionLocators.email));
        emailField.sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
        Assert.assertEquals(emailField.getAttribute("value"), email, "Email Address input mismatch!");
    }

    public static void enterPhoneNumber(String number) {
        WebElement mobileField = wait.until(ExpectedConditions.elementToBeClickable(AIStrategySessionLocators.phoneNumber));
        mobileField.sendKeys(number);
        ExtentLogger.pass("Entered Phone number as: " + number);
        String a= mobileField.getAttribute("value");
        System.out.println(a);
        Assert.assertTrue(a.contains(number), "Phone Number input does not contain expected value!");
    }

    public static void selectIndustry()
    {
        wait.until(ExpectedConditions.elementToBeClickable(AIStrategySessionLocators.industry)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AIStrategySessionLocators.selectIndustry)).click();
        ExtentLogger.pass("Industry is selected");
    }

    public static void selectMonthlyBudget()
    {
        wait.until(ExpectedConditions.elementToBeClickable(AIStrategySessionLocators.marketingBudget)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AIStrategySessionLocators.selectMarketingBudget)).click();
        ExtentLogger.pass("Monthly Marketing Budget is selected");
    }

    public static void bookNow()
    {
        wait.until(ExpectedConditions.elementToBeClickable(AIStrategySessionLocators.bookNow)).click();
        ExtentLogger.pass("Book Now button is clicked");
    }

    public static void displayThankYouMessage() {
        try {
            WebElement thankYouMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(AIStrategySessionLocators.thankYouMessage));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(AIStrategySessionLocators.validateName));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(AIStrategySessionLocators.validateCompany));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Company field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Company is not displayed");
        }
    }

    public static void displayValidationForPhone()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(AIStrategySessionLocators.validatePhone));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(AIStrategySessionLocators.validateEmail));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Email field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Email is not displayed");
        }
    }

    public static void displayValidationForMarketingBudget()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(AIStrategySessionLocators.validateBudget));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Monthly Marketing Budget field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Monthly Marketing Budget is not displayed");
        }
    }

}
