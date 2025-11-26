package Locators;

import org.openqa.selenium.By;

public class GMBFormLocators {

    public static By downloadButton = By.xpath("//div[@class='gmb-file-content']//a");
    public static By Name = By.xpath("//div[contains(@class,'custom_slide_well')]//form//div//ul//input[@type=\"text\"]");
    public static By emailAddress = By.xpath("//div[contains(@class,'custom_slide_well')]//form//div//ul//input[@type=\"email\"]");
    public static By getAccessButton = By.xpath("//input[contains(@id,'gform_submit_button') and contains(@value,'GET ACCESSS IMMEDIATELY')]");
    public static By displayMessage = By.xpath("//h1[contains(text(),'Want Help Getting Your Business In')]");
    public static By validationMsg = By.xpath("//div[contains(@class,'custom_slide_well')]//form//div//ul//input[@type=\"email\"]//following::div[contains(@id,'validation_message')]");
}
