package Locators;

import org.openqa.selenium.By;

public class ProposalPopUpFormLocators {

    public static By getFreeProposal = By.xpath("//div[@class='proposal-inner GetYourFreeProposal']/button");
    public static By enterWebsite = By.xpath("//div[contains(@class,'ginput_container_text')]/input[@placeholder='Website']");
    public static By describeYourBusiness = By.xpath("//div[contains(@class,'ginput_container_textarea')]/textarea[contains(@placeholder,'your business')]");
    public static By hearAboutThrive = By.xpath("//div[contains(@class,'ginput_container_text')]/input[contains(@placeholder,'about Thrive?')]");
    public static By selectAboutThrive = By.xpath("//div[@id='custom-dropdown']/div[text()='TopSEOs']");
    public static By getStartedBtn = By.xpath("//input[@value='Get Started']");
    public static By firstName = By.xpath("(//div[contains(@class,'ginput_container--name')]/span/input[@placeholder='First Name*'])[1]");
    public static By lastName = By.xpath("(//div[contains(@class,'ginput_container--name')]/span/input[@placeholder='Last Name*'])[1]");
    public static By emailAddress = By.xpath("(//div[contains(@class,'ginput_container_email')]/input[@placeholder='Email Address*'])[1]");
    public static By marketingBudget = By.xpath("(//div[contains(@class,'ginput_container_select')])[4]");
    public static By selectMarketingBudget = By.xpath("(//div[contains(@class,'ginput_container_select')])[4]/select/option[text()='$750-$1,500']");
    public static By phoneNumber = By.xpath("//div[contains(@class,'dial-code')]//input[1]");
    public static By companyOrganization = By.xpath("(//div[contains(@class,'ginput_container_text')]/input[@placeholder='Company/Organization*'])[1]");
    public static By sendProposalBtn = By.xpath("(//input[@value='Send My Free Proposal'])[1]");
    public static By thankyouMessage = By.xpath("//h1[text()='Thanks For Contacting Us!']");

    public static By validateName = By.xpath("(//div[contains(@class,'ginput_container--name')]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateEmail = By.xpath("((//div[contains(@class,'ginput_container_email')]/input[@placeholder='Email Address*'])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validatePhone = By.xpath("(//div[contains(@class,'dial-code')]//input[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateOrganization = By.xpath("((//div[contains(@class,'ginput_container_text')]/input[@placeholder='Company/Organization*'])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateBudget = By.xpath("((//div[contains(@class,'ginput_container_select')])[4]//following::div[contains(@id,'validation_message')])[1]");
    }
