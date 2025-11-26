package Locators;

import org.openqa.selenium.By;

public class StrategyFormLocators {

    public static By bookMyStrategyButton = By.xpath("//div[contains(@class,'gmb-link popup')]//a[contains(text(),'BOOK MY')]");
    public static By name = By.xpath("(//ul[contains(@id,'gform_fields')]//div[contains(@class,'ginput_container_text')]/input)[1]");
    public static By email = By.xpath("(//ul[contains(@id,'gform_fields')]//div[contains(@class,'ginput_container ginput_container_email')]/input)[1]");
    public static By company = By.xpath("(//ul[contains(@id,'gform_fields')]//div[contains(@class,'ginput_container ginput_container_text')]/input)[2]");
    public static By phoneNumber = By.xpath("(//ul[contains(@id,'gform_fields')]//div[@class='iti__flag-container']//following::input)[1]");
    public static By monthlyBudget = By.xpath("(//ul[contains(@id,'gform_fields')]//div[contains(@class,'ginput_container_select')])[1]");
    public static By selectBudget = By.xpath("(//div[contains(@class,'ginput_container_select')])[1]/select/option[3]");
    public static By hearAboutThriveText = By.xpath("(//div[contains(@class,'ginput_container_text')])[4]/input");
    public static By hearAboutThriveSelect = By.xpath("//*[@id='custom-dropdown']/div[text()='Top Digital Agency']");
    public static By bookMySessionBtn = By.xpath("//input[@value='Book My Session']");

    public static By validateName = By.xpath("((//div[contains(@class,'ginput_container_text')]/input)[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateEmail = By.xpath("((//div[contains(@class,'ginput_container ginput_container_email')]/input)[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validatePhone = By.xpath("((//div[@class='iti__flag-container']//following::input)[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateMonthlyBudget = By.xpath("((//ul[contains(@id,'gform_fields')]//div[contains(@class,'ginput_container_select')])[1]//following::div[contains(@id,'validation_message')])[1]");
}
