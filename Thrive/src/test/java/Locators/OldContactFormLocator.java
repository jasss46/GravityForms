package Locators;

import org.openqa.selenium.By;

public class OldContactFormLocator {
    public static By firstName =By.xpath("(//div[contains(@class,'get-free-proposal')]//input[@type='text'])[1]");
    public static By lastName =By.xpath(" (//div[contains(@class,'get-free-proposal')]//input[@type='text'])[2]");
    public static By emailAddress =By.xpath("//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_email')]//input[@type='email']");
    public static By phoneNumber =By.xpath(" //div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_phone')]//input[@type='tel']");
    public static By companyOrganization =By.xpath("(//div[contains(@class,'get-free-proposal')]//input[@type='text'])[4]");
    public static By websiteName =By.xpath("(//div[contains(@class,'get-free-proposal')]//input[@type='text'])[5]");
    public static By estimatedMonthlyBudget =By.xpath("(//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_select')]//select)[1]");
    public static By selectOptionOfEstimatedMonthlyBudget = By.xpath("//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_select')]//option[text()='$2,500-$5,000 per month']");
    public static By estimatedWebDesignBudget = By.xpath("(//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_select')]//select)[2]");
    public static By selectOptionOfEstimatedWebDesignBudget = By.xpath("//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_select')]//option[text()='$1,000-$5,000']");
    public static By photographyVideographyBudget = By.xpath("(//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_select')]//select)[3]");
    public static By selectOptionOfPhotographyVideographyBudget = By.xpath("//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_select')]//option[text()='$2,500-$10,000']");
    public static By Message =By.xpath("//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_textarea')]//textarea[@class='textarea small']");
    public static By aboutThrive =By.xpath("(//div[contains(@class,'get-free-proposal')]//input[@type='text'])[6]");
    public static By selectedValueAboutThrive =By.xpath("//div[contains(@class,'get-free-proposal ')]//div[@class='custom-dropdown']//div[text()='Top Digital Agency']");
    public static By submitButton =By.xpath("//div[contains(@class,'get-free-proposal')]//input[@value='Submit']");
    public static By thankYouMessage = By.xpath("//h1[contains(text(),'Thanks For Contacting Us!')]");

    public static By validateName = By.xpath("(//div[contains(@class,'get-free-proposal')]//span[contains(@class,'name')]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateEmail = By.xpath("(//div[contains(@class,'get-free-proposal')]//input[@type='email']//following::div[contains(@id,'validation_message')])[1]");
    public static By validatePhone = By.xpath("(//div[contains(@class,'get-free-proposal')]//input[@type='tel']//following::div[contains(@id,'validation_message')])[1]");
    public static By validateOrganization = By.xpath("((//div[contains(@class,'get-free-proposal')]//input[@type='text'])[4]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateServices = By.xpath("//div[contains(@class,'get-free-proposal')]//div[contains(@class,'ginput_container_checkbox')]//following::div[contains(@id,'validation_message')]");
}
