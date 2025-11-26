package Locators;

import org.openqa.selenium.By;

public class AIStrategySessionLocators {

    public static By firstName = By.xpath("(//div[contains(@class,'ginput_container--name')]/span/input)[1]");
    public static By lastName = By.xpath("(//div[contains(@class,'ginput_container--name')]/span/input)[2]");
    public static By company = By.xpath("//div[contains(@class,'ginput_container_text')]/input[@placeholder='Company*']");
    public static By email = By.xpath("(//div[contains(@class,'ginput_container_email')]/input)[1]");
    public static By phoneNumber = By.xpath("(//div[contains(@class,'dial-code')]/input)[1]");
    public static By industry = By.xpath("(//div[contains(@class,'ginput_container_select')])[1]");
    public static By selectIndustry = By.xpath("(//div[contains(@class,'ginput_container_select')])[1]/select/option[text()='Technology/IT']");
    public static By marketingBudget = By.xpath("(//div[contains(@class,'ginput_container_select')])[2]");
    public static By selectMarketingBudget = By.xpath("(//div[contains(@class,'ginput_container_select')])[2]/select/option[text()='$1,500-$3,000']");
    public static By bookNow = By.xpath("//input[@value='BOOK NOW']");
    public static By thankYouMessage = By.xpath("//h1[contains(text(),'Thank You! Our Team Will Be in Touch Soon!')]");

    public static By validateName = By.xpath("((//div[contains(@class,'ginput_container--name')]/span/input)[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateEmail = By.xpath("((//div[contains(@class,'ginput_container_email')]/input)[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validatePhone = By.xpath("((//div[contains(@class,'dial-code')]/input)[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateCompany = By.xpath("(//div[contains(@class,'ginput_container_text')]/input[@placeholder='Company*']//following::div[contains(@id,'validation_message')])[1]");
    public static By validateBudget = By.xpath("(//div[contains(@class,'ginput_container_select')])[2]//following::div[contains(@id,'validation_message')]");
}
