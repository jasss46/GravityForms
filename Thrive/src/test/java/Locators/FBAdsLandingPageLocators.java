package Locators;

import org.openqa.selenium.By;

public class FBAdsLandingPageLocators {

    public static By firstName= By.xpath("(//div[contains(@class,'ginput_container--name')]/span/input)[1]");
    public static By lastName= By.xpath("(//div[contains(@class,'ginput_container--name')]/span/input)[2]");
    public static By company = By.xpath("(//label[text()='Company/Organization']//following::input)[1]");
    public static By website = By.xpath("//div[contains(@class,'ginput_container_website')]/input");
    public static By email = By.xpath("(//div[contains(@class,'ginput_container_email')]/input)[1]");
    public static By phoneNumber = By.xpath("(//div[contains(@class,'dial-code')]/input)[1]");
    public static By monthlyBudget = By.xpath("(//div[@class='ginput_container ginput_container_select'])[1]");
    public static By selectMonthlyBudget = By.xpath("(//div[@class='ginput_container ginput_container_select'])[1]/select/option[text()='$3,000-$5,000 per month']");
    public static By describeYourBusiness = By.xpath("(//div[contains(@class,'ginput_container_textarea')]/textarea)[1]");
    public static By hearAboutThrive = By.xpath("(//li[contains(@class,'gfield--type-text')]/label[contains(text(),'about Thrive?')]//following::input)[1]");
    public static By selectAboutThrive = By.xpath("//div[@id='custom-dropdown']/div[text()='TopSEOs']");
    public static By scheduleCallBtn = By.xpath("//input[@value='SCHEDULE MY CALL']");
    public static By thankYouMessage = By.xpath("//h1[contains(text(),'Thank You for Your Interest in Thrive!')]");


    public static By validateName  = By.xpath("((//div[contains(@class,'ginput_container--name')]/span/input)[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateCompany = By.xpath("((//label[text()='Company/Organization']//following::input)[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateWebsite = By.xpath("(//div[contains(@class,'ginput_container_website')]/input//following::div[contains(@id,'validation_message')])[1]");
    public static By validateEmail  = By.xpath("((//div[contains(@class,'ginput_container_email')]/input)[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validatePhone  = By.xpath("((//div[contains(@class,'dial-code')]/input)[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateMonthlyBudget  = By.xpath("((//div[@class='ginput_container ginput_container_select'])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateBusiness  = By.xpath("((//div[contains(@class,'ginput_container_textarea')]/textarea)[1]//following::div[contains(@id,'validation_message')])[1]");

}
