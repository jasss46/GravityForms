package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.ProductFormLocators;
import Locators.RFPTemplateFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class RFPTemplateForm extends BaseClass
{

    public static PageURL pageURL = new PageURL();

    public static void pageURL() throws InterruptedException {
        driver.get(pageURL.getRFPForm());
        ExtentLogger.pass("Navigate to : " + pageURL.getRFPForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//article[@aria-label='Download PDF landing page']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);
    }

    public static void firstName(String name)
    {
        wait.until(ExpectedConditions.elementToBeClickable(RFPTemplateFormLocators.firstName)).sendKeys(name);
    }
    public static void lastName(String name)
    {
        wait.until(ExpectedConditions.elementToBeClickable(RFPTemplateFormLocators.lastName)).sendKeys(name);
    }

    public static void emailAddress(String email)
    {
        wait.until(ExpectedConditions.elementToBeClickable(RFPTemplateFormLocators.emailAddress)).sendKeys(email);
    }

    public  static  void companyName(String company){
        wait.until(ExpectedConditions.elementToBeClickable(RFPTemplateFormLocators.companyName)).sendKeys(company);
    }

    public static void phoneNumber(String number){
        wait.until(ExpectedConditions.elementToBeClickable(RFPTemplateFormLocators.phoneNumber)).sendKeys(number);
    }

    public static void clickAllServices()
    {
        try
        {
            List<WebElement> elementToClick = driver.findElements(RFPTemplateFormLocators.checkBoxes);
            for (int i=1; i<=elementToClick.size();i++)
            {
                String selectCheckbox = "(//ul[@class='gfield_checkbox']//label)[" + i + "]";
                WebElement element = driver.findElement(By.xpath(selectCheckbox));
                element.click();
            }
        }

        catch (Exception ex)
        {
            ExtentLogger.fail("Services are not Clicked");
        }
    }

    public static void aboutThrive(){
        wait.until(ExpectedConditions.elementToBeClickable(RFPTemplateFormLocators.aboutThrive)).click();
    }

    public static void enterValue(String value){
        wait.until(ExpectedConditions.elementToBeClickable(RFPTemplateFormLocators.aboutThrive)).sendKeys(value);
    }

    public static void selectThriveValue(){
        wait.until(ExpectedConditions.elementToBeClickable(RFPTemplateFormLocators.selectThriveValue)).click();
    }

    public static void freeTemplateButton(){
        wait.until(ExpectedConditions.elementToBeClickable(RFPTemplateFormLocators.freeTemplateButton)).click();
    }

    public static void displayThankText(){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(RFPTemplateFormLocators.displayThankText));
            ExtentLogger.pass("Message: Thank you Message displayed");
        }
        catch (Exception ex){
            ExtentLogger.fail("Failed to display Thank you message");
        }
    }

    public static void displayValidationForName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(RFPTemplateFormLocators.validateName));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(RFPTemplateFormLocators.validateEmail));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(RFPTemplateFormLocators.validatePhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Phone number is not displayed");
        }
    }
    public static void displayValidationForTemplatesSelection()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(RFPTemplateFormLocators.validateTemplate));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Templates selection is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Templates selection is not displayed");
        }
    }
}