package Locators;

import org.openqa.selenium.By;

public class ReferralFormLocators {
    public static By fieldFirstName = By.xpath("(//span[contains(@class,'name_first')]/input[@type='text'])[1]");
    public static By getFieldLastName = By.xpath("(//span[contains(@class,'name_last')]/input[@type='text'])[1]");
    public static By emailAddress = By.xpath("(//div[contains(@class,'container_email')]/input[@type='email'])[1]");
    public static By phoneNumber = By.xpath("(//div[contains(@class,'ginput_container_phone')]//input[@type='tel'])[1]");
    public static By referralFirstName = By.xpath("(//span[contains(@class,'name_first')]/input[@type='text'])[2]");
    public static By referralSecondName = By.xpath("(//span[contains(@class,'name_last')]/input[@type='text'])[2]");
    public static By referralPhoneNumber = By.xpath("(//div[contains(@class,'ginput_container')]//input[@type='tel'])[2]");
    public static By referralEmail = By.xpath("(//div[contains(@class,'ginput_container')]/input[@type='email'])[2]");
    public static By messageBox = By.xpath("//textarea[@class='textarea medium']");
    public static By aboutThrive = By.xpath("(//div[@class='content-sidebar-wrap']//form//div[contains(@class,'ginput_container_text')])[3]/input");
    public static By valueOfAboutThrive = By.xpath("(//div[@class='content-sidebar-wrap']//form//div[contains(@class,'ginput_container_text')])[3]//div[@class='custom-dropdown']//div[text()='Top Digital Agency']");
    public static By submitButton = By.xpath("//div[contains(@class,'gform_footer')]/input[@type='submit']");
    public static By thankYouMessage = By.xpath("//h1[contains(text(),'Thank You')]");

    public static By validateName= By.xpath("((//span[contains(@class,'name_first')]/input[@type='text'])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateEmail = By.xpath("(//div[contains(@class,'container_email')]/input[@type='email'][1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validatePhone = By.xpath("((//div[contains(@class,'ginput_container_phone')]//input[@type='tel'])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateReferralName = By.xpath("((//span[contains(@class,'name_first')]/input[@type='text'])[2]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateReferralEmail= By.xpath("((//div[contains(@class,'ginput_container')]/input[@type='email'])[2]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateReferralPhone = By.xpath("((//div[contains(@class,'ginput_container')]//input[@type='tel'])[2]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateServicesNeeded = By.xpath("(//textarea[@class='textarea medium']//following::div[contains(@id,'validation_message')])[1]");

}
