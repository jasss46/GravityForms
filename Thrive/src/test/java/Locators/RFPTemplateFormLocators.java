package Locators;

import org.openqa.selenium.By;

public class RFPTemplateFormLocators {


    public static By firstName = By.xpath("//div[@class='content-sidebar-wrap']//form//div//input[@placeholder='First Name*']");
    public static By lastName = By.xpath("//div[@class='content-sidebar-wrap']//form//div//input[@placeholder='Last Name*']");
    public static By emailAddress = By.xpath("//div[@class='content-sidebar-wrap']//form//div//input[@placeholder='Email Address*']");
    public static By companyName = By.xpath("//div[@class='content-sidebar-wrap']//form//div//input[@placeholder='Company']");
    public static By phoneNumber = By.xpath("//div[@class='content-sidebar-wrap']//form//div//input[@type='tel']");
    public static By checkBoxes = By.xpath("//ul[@class='gfield_checkbox']//input[@class='gfield-choice-input']");
    public static By aboutThrive = By.xpath("//div[@class='content-sidebar-wrap']//form//div//input[@placeholder='How did you hear about Thrive?']");
    public static By selectThriveValue = By.xpath("//div[@class='content-sidebar-wrap']//form//div[@class='custom-dropdown']//div[text()='Upcity']");
    public static By freeTemplateButton = By.xpath("//div[@class='content-sidebar-wrap']//form//input[@value='DOWNLOAD MY FREE TEMPLATE']");
    public static By displayThankText = By.xpath("//div[contains(@class,'wp-block-group__inner-container')]//div[contains(text(),'Thanks for requesting an RFP template from us!')]");

    public static By validateName = By.xpath("(//span[contains(@class,'name')]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateEmail = By.xpath("(//input[@placeholder='Email Address*']//following::div[contains(@id,'validation_message')])[1]");
    public static By validatePhone = By.xpath("(//input[@type='tel']//following::div[contains(@id,'validation_message')])[1]");
    public static By validateTemplate = By.xpath("((//ul[@class='gfield_checkbox']//label)//following::div[contains(@id,'validation_message')])[1]");
}
