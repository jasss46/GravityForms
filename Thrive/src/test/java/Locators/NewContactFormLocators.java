package Locators;

import org.openqa.selenium.By;

public class NewContactFormLocators {

    public static By firstName = By.xpath("//div[contains(@class,'fl-module-pp-gravity-form')]//div//span//input[@placeholder='First Name*']");
    public static By lastName = By.xpath("//div[contains(@class,'fl-module-pp-gravity-form')]//div//span//input[@placeholder='Last Name*']");
    public static By companyOrganizationName = By.xpath("//div[contains(@class,'fl-module-pp-gravity-form')]//div[contains(@class,'ginput_container_text')]//input[@placeholder='Company/Organization*']");
    public static By websiteName = By.xpath("//div[contains(@class,'fl-module-pp-gravity-form')]//div[contains(@class,'ginput_container_text')]//input[@placeholder='Website']");
    public static By emailAddress = By.xpath("//div[contains(@class,'fl-module-pp-gravity-form')]//div[contains(@class,'ginput_container_email')]//input[@placeholder='Email Address*']");
    public static By mobileNumber = By.xpath("//div[contains(@class,'fl-module-pp-gravity-form')]//div[contains(@class,'iti--show-flags')]//input[@type=\"tel\"]");
    public static By clickCompanySize = By.xpath("(//div[contains(@class,'fl-module-pp-gravity-form')]//form//select)[5]");
    public static By selectCompanySize = By.xpath("(//div[contains(@class,'fl-module-pp-gravity-form')]//div//select)[5]//option[3]");
    public static By clickAboutThrive = By.xpath("//div[contains(@class,'fl-module-pp-gravity-form')]//div[contains(@class,'ginput_container_text')]//input[@placeholder='How did you hear about Thrive?']");
    public static By selectAboutThrive = By.xpath("//div[contains(@class,'fl-module-pp-gravity-form')]//div[contains(@class,'custom-dropdown')]//div[text()='Video Ad']");
    public static By tellUsAboutYourBusiness = By.xpath("//div[contains(@class,'fl-module-pp-gravity-form')]//div[contains(@class,'ginput_container_textarea')]//textarea[@class='textarea small']");
    public static By sendMeFreeProposalButton = By.xpath("//div[contains(@class,'fl-module-pp-gravity-form')]//input[@value='Send My Free Proposal']");
    public static By thankYouMessage = By.xpath("//h1[contains(text(),'Thanks For Contacting Us!')]");
    public static By clickServices = By.xpath("//div[contains(@class,'fl-module-pp-gravity-form')]//form//input[@value='Services*']");
    public static By selectServices = By.xpath("(//div[contains(@class,'fl-module-pp-gravity-form')]//form//ul)[4]/li[2]");

    public static By validateName = By.xpath("(//div[contains(@class,'fl-module-pp-gravity-form')]//div//span[contains(@class,'name')]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateOrganization = By.xpath("(//input[@placeholder='Company/Organization*']//following::div[contains(@id,'validation_message')])[1]");
    public static By validateEmail = By.xpath("(//input[@placeholder='Email Address*']//following::div[contains(@id,'validation_message')])[1]");
    public static By validatePhone = By.xpath("(//div[contains(@class,'fl-module-pp-gravity-form')]//div[contains(@class,'iti--show-flags')]//input[@type=\"tel\"]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateServices = By.xpath("(//div[contains(@class,'fl-module-pp-gravity-form')]//form//input[@value='Services*']//following::div[contains(@id,'validation_message')])[1]");
    public static By validateCompanySize = By.xpath("(//div[contains(@class,'fl-module-pp-gravity-form')]//form//select)[5]//following::div[contains(@id,'validation_message')]");


}