package Locators;

import org.openqa.selenium.By;

public class CityFormLocator {

    public static By companySize = By.xpath("(//div[contains(@class,'ginput_container_select')]//Select)[4]") ;
    public static By selectCompanySize = By.xpath("//*[@id='input_49_49']/option[3]");
    public static By websiteAddress = By.xpath("//div[contains(@class,' ginput_container_text')]//input[contains(@placeholder,'Website Address?')]");
    public static By aboutThrive = By.xpath("//input[@id='input_49_48']");
    public static By FacebookAgency = By.xpath("//div[text()='Facebook Agency Directory']");
    public static By textArea = By.xpath("//textarea[@id='input_49_10']");
    public static By getStartedButton = By.xpath("//input[@id='gform_next_button_49_31']");
    public static By firstName = By.xpath("//div[contains(@class,'hero-form')]//ul//div//span[contains(@class,'name_first')]//input[contains(text(),First)]");
    public static By lastName = By.xpath("//div[contains(@class,'hero-form')]//ul//div//span[contains(@class,'name_last')]//input[contains(text(),Last)]");
    public static By companyOrganization = By.xpath("//div[contains(@class,'hero-form')]//ul//div[contains(@class,'ginput_container')]//input[contains(@placeholder,'Company/Org*')]");
    public static By phoneNumber = By.xpath("(//div[contains(@class,'iti iti--allow-dropdown')]/input[@type='tel'])[1]");
    public static By emailAddress = By.xpath("//div[contains(@class,'hero-form')]//ul//div[contains(@class,'ginput_container')]/input[@type='email']");
    public static By startedButton = By.xpath("//div[contains(@class,'hero-form')]//div[contains(@class,'gform_page_footer')]//input[@class='gform_button button']");
    public static By thankYouMessage = By.xpath("//h1[contains(text(),'Thanks For Contacting Us!')]");

    public static By displayValidation= By.xpath("(//div[contains(@class,'ginput_container_select')]//Select)[4]//following::div[contains(@id,'validation_message')]");
    public static By validationForName = By.xpath("(//div[contains(@class,'hero-form')]//ul//div//span[contains(@class,'name')]//following::div[contains(@id,'validation_message')])[1]");
    public static By validationForOrganization = By.xpath("(//input[contains(@placeholder,'Company/Org*')]//following::div[contains(@id,'validation_message')])[1]");
    public static By validationForPhone = By.xpath("((//div[contains(@class,'iti iti--allow-dropdown')]/input[@type='tel'])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validationForEmail = By.xpath("(//div[contains(@class,'hero-form')]//ul//div[contains(@class,'ginput_container')]/input[@type='email']//following::div[contains(@id,'validation_message')])[1]");
}
