package Locators;

import org.openqa.selenium.By;

public class ThriveAgenciesFormLocators {
    public static By getFirstName = By.xpath("(//div[contains(@class,'ginput_container--name')]//following::input[@type='text'])[1]");
    public static By lastName = By.xpath("(//span[contains(@class,'name_last')]//input[@type='text'])[1]");
    public static By emailAddress = By.xpath("(//div[contains(@class,'container_email')]//input[@type='email'])[1]");
    public static By phoneNumber = By.xpath("(//div[contains(@class,'iti--allow-dropdown')]/input[@type='tel'])[1]");
    public static By company = By.xpath("(//div[contains(@class,'ginput_container_text')]//input[@type='text'])[2]");
    public static By website = By.xpath("(//div[contains(@class,'ginput_container_text')])[3]/input");
    public static By textArea = By.xpath("(//textarea[contains(@class,'textarea ')])[1]");
    public static By howDidYouHear = By.xpath("(//div[contains(@class,'ginput_container_text')]//input[@type='text'])[4]");
    public static By adForum = By.xpath("//div[@role='listbox']//div[text()='Adforum']");
    public static By newSubmitButton = By.xpath("//div[contains(@class,'gform_footer')]//input[@type='submit']");
    public static By thankYouMessage= By.xpath("//h1[contains(text(),'Thanks For Contacting Us!')]");

    public static By validateName = By.xpath("((//span[contains(@class,'name')]//input[@type='text'])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateEmail = By.xpath("((//div[contains(@class,'container_email')]//input[@type='email'])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validatePhone = By.xpath("((//div[contains(@class,'iti--allow-dropdown')]/input[@type='tel'])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateCompany = By.xpath("((//div[contains(@class,'ginput_container_text')]//input[@type='text'])[2]//following::div[contains(@id,'validation_message')])[1]");
}
