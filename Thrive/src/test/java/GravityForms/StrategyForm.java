package GravityForms;

import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.StrategyFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class StrategyForm  extends BaseClass {
    public static PageURL pageURL = new PageURL();

    public static void pageURL() throws InterruptedException {
        driver.get(pageURL.getStrategyForm());
        ExtentLogger.pass("Navigate to: " + pageURL.getStrategyForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'gmb-banner-wrapper')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='gmb-link-list']/ul/li[1]"))).click();
        Thread.sleep(10000);
    }

    public static void freeStrategySession() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(StrategyFormLocators.bookMyStrategyButton)).click();
        ExtentLogger.pass("Book Free Strategy Session button clicked");
    }

    public static void enterName(String name) {
        WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(StrategyFormLocators.name));
        firstNameField.sendKeys(name);
        ExtentLogger.pass("Entered Name as: " + name);
        Assert.assertEquals(firstNameField.getAttribute("value"), name, " Name input mismatch!");
    }

    public static void enterEmailAddress(String email)
    {
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(StrategyFormLocators.email));
        emailField.sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
        Assert.assertEquals(emailField.getAttribute("value"), email, "Email Address input mismatch!");
    }

    public static void enterCompany(String company) {
        wait.until(ExpectedConditions.elementToBeClickable(StrategyFormLocators.company)).sendKeys(company);
        ExtentLogger.pass("Company Size field is clicked");
    }

    public static void enterMobileNumber(String number) {
        WebElement mobileField = wait.until(ExpectedConditions.elementToBeClickable(StrategyFormLocators.phoneNumber));
        mobileField.sendKeys(number);
        ExtentLogger.pass("Entered Mobile number as: " + number);
        String a= mobileField.getAttribute("value");
        System.out.println(a);
        Assert.assertTrue(a.contains(number), "Mobile Number input does not contain expected value!");
    }

    public static void monthlyBudget() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(StrategyFormLocators.monthlyBudget)).click();
        ExtentLogger.pass("Monthly Budget Clicked");
    }

    public static void selectOptionForMonthlyBudget() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(StrategyFormLocators.selectBudget)).click();
        ExtentLogger.pass("Monthly Budget Selected");
    }

    public static void aboutThrive()
    {
        wait.until(ExpectedConditions.elementToBeClickable(StrategyFormLocators.hearAboutThriveText)).click();
        ExtentLogger.pass("About Thrive field is clicked");
    }

    public static void enterValue(String value)
    {
        wait.until(ExpectedConditions.elementToBeClickable(StrategyFormLocators.hearAboutThriveText)).sendKeys(value);
        ExtentLogger.pass("Value sent to About Thrive field :" + value);
    }

    public static void selectValueAboutThrive()
    {
        wait.until(ExpectedConditions.elementToBeClickable(StrategyFormLocators.hearAboutThriveSelect)).click();
        ExtentLogger.pass("Entered about Thrive field value ");
    }

    public static void bookMySession() throws InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(StrategyFormLocators.bookMySessionBtn)).click();
        ExtentLogger.pass("Book My Session button clicked");
    }

    public static void displayValidationForName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(StrategyFormLocators.validateName));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(StrategyFormLocators.validateEmail));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(StrategyFormLocators.validatePhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Phone number is not displayed");
        }
    }
    public static void displayValidationForMonthlyBudget()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(StrategyFormLocators.validateMonthlyBudget));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Monthly Budget field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Monthly Budget field is not displayed");
        }
    }
}
