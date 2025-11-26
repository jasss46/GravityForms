package Locators;

import org.openqa.selenium.By;

public class ThriveLocalFormLocators {
    public static By firstName = By.xpath("//div[contains(@class,'gravity-theme')]//div[contains(@class,'ginput_container--name')]//span[contains(@class,'name_first')]//input");
    public static By lastName = By.xpath("//div[contains(@class,'gravity-theme')]//div[contains(@class,'ginput_container--name')]//span[contains(@class,'name_last')]//input[@placeholder='Last Name*']");
    public static By companyName = By.xpath("//div[contains(@class,'gravity-theme')]//input[@placeholder='Company*']");
    public static By emailAddress = By.xpath("//div[contains(@class,'gravity-theme')]//input[@placeholder='Email*']");
    public static By phoneNumber = By.xpath("//div[contains(@class,'gravity-theme')]//input[@type='tel']");
    public static By marketingBudget = By.xpath("//div[contains(@class,'gravity-theme')]//div[contains(@class,' ginput_container_select')]//select[@class='large gfield_select']");
    public static By selectMarketingBudget = By.xpath("//div[contains(@class,'gravity-theme')]//div[contains(@class,' ginput_container_select')]//select//option[3]");
    public static By hearAboutThriveLocal = By.xpath("//div[contains(@class,'gravity-theme')]//input[@placeholder='How did you hear about Thrive Local?']");
    public static By selectedHearAbout = By.xpath("//div[contains(@class,'gravity-theme')]//div[contains(@class,'custom-dropdown')]//div[3]");
    public static By freeDemoButton = By.xpath("//div[contains(@class,'gravity-theme')]//div[contains(@class,'gform_footer top_label')]//input[@type='submit']");
    public static By thankYouMessage = By.xpath("//h1[contains(text(),'Thank You for Choosing Thrive Local!')]");

    public static By validateName = By.xpath("(//span[contains(@class,'name')]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateEmail = By.xpath("(//div[contains(@class,'gravity-theme')]//input[@placeholder='Email*']//following::div[contains(@id,'validation_message')])[1]");
    public static By validatePhone = By.xpath("(//div[contains(@class,'gravity-theme')]//input[@type='tel']//following::div[contains(@id,'validation_message')])[1]");
    public static By validateCompany = By.xpath("(//div[contains(@class,'gravity-theme')]//input[@placeholder='Company*']//following::div[contains(@id,'validation_message')])[1]");
}
