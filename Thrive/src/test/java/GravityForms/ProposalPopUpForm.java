package GravityForms;

import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.AIStrategySessionLocators;
import Locators.ProposalPopUpFormLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProposalPopUpForm extends BaseClass {


    public static PageURL pageURL = new PageURL();

    public  static void pageURL() throws InterruptedException {
        driver.get(pageURL.getPopupForm());
        ExtentLogger.pass("Navigate to: "+ pageURL.getPopupForm());
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//section[contains(@class,'single-blog-post')]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='search_header']/span"))).click();
        Thread.sleep(10000);
    }
    public static void getFreeProposal(){
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.getFreeProposal)).click();
        ExtentLogger.pass("Get Your Free Proposal button is clicked");
    }
    public static void enterWebsite(String website)
    {
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.enterWebsite)).sendKeys(website);
        ExtentLogger.pass("Website entered :" + website);

    }

    public static void enterBusinessDescription(String description)
    {
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.describeYourBusiness)).sendKeys(description);
        ExtentLogger.pass("Business decsribed as :" + description);

    }

    public static void enterValueOfAboutThrive(String value){
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.hearAboutThrive)).click();
        ExtentLogger.pass("About Thrive field is clicked:");
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.hearAboutThrive)).sendKeys(value);
        ExtentLogger.pass("Value sent to About Thrive field :" + value);
    }

    public static void selectedValueOfAboutThrive(){
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.selectAboutThrive)).click();
        ExtentLogger.pass("Entered about Thrive field value: ");
    }

    public static void getStarted(){
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.getStartedBtn)).click();
        ExtentLogger.pass("About Thrive field is clicked:");
    }

    public static void firstName(String name){
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.firstName)).sendKeys(name);
        ExtentLogger.pass("Entered First name as: " + name);
    }
    public static void lastName(String name){
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.lastName)).sendKeys(name);
        ExtentLogger.pass("Entered Last name as: " + name);
    }

    public static void emailAddress(String email){
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.emailAddress)).sendKeys(email);
        ExtentLogger.pass("Entered Email Address as: " + email);
    }

    public static void selectMonthlyBudget()
    {
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.marketingBudget)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.selectMarketingBudget)).click();
        ExtentLogger.pass("Monthly Marketing Budget is selected");
    }

    public static void phoneNumber(String phone){
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.phoneNumber)).sendKeys(phone);
        ExtentLogger.pass("Entered Mobile number as: " + phone);
    }

    public static void companyOrOrganization(String company){
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.companyOrganization)).sendKeys(company);
        ExtentLogger.pass("Tell us About your business Message: " + company);
    }

    public static void sendProposal(){
        wait.until(ExpectedConditions.elementToBeClickable(ProposalPopUpFormLocators.sendProposalBtn)).click();
        ExtentLogger.pass("Send My Free Proposal button is clicked ");
    }

    public static void displayThankYouMessage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(ProposalPopUpFormLocators.thankyouMessage));
            ExtentLogger.pass("Message: Thank you Message displayed");
        } catch (Exception ex) {
            ExtentLogger.fail("Failed to display Thank you message");
        }
    }

    public static void displayValidationForName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ProposalPopUpFormLocators.validateName));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ProposalPopUpFormLocators.validateEmail));
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
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ProposalPopUpFormLocators.validateBudget));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Monthly Marketing Budget field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Monthly Marketing Budget is not displayed");
        }
    }


    public static void displayValidationForPhone()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ProposalPopUpFormLocators.validatePhone));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Phone number field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Phone number is not displayed");
        }
    }
    public static void displayValidationForOrganization()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ProposalPopUpFormLocators.validateOrganization));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Company/Organization field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Company/Organization field is not displayed");
        }
    }
}
