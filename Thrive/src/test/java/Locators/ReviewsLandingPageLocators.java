package Locators;

import org.openqa.selenium.By;

public class ReviewsLandingPageLocators {
    public static By firstName = By.xpath("(//div[contains(@class,'ginput_complex')]//input[@type='text'])[1]");
    public static  By lastName = By.xpath("(//div[contains(@class,'ginput_complex')]//input[@type='text'])[2]");
    public static By company = By.xpath("(//div[contains(@class,'ginput_container')]//input[contains(@placeholder,'Company')])[1]");
    public static  By emailAddress = By.xpath("(//div[contains(@class,'ginput_container_email')]//input[@type='email'])[1]");
    public static By mobileNumber = By.xpath("(//div[contains(@class,'ginput_container_phone')]//input[@type='tel'])[1]");
    public static By claimReviews = By.xpath("//input[@value='CLAIM MY FREE REVIEWS']");
    public static By thankYouMessage = By.xpath("//h1[contains(text(),'Thank You for Choosing Thrive Local!')]");

    public static By validateName = By.xpath("((//div[contains(@class,'ginput_complex')]//input[@type='text'])[2]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateCompany=By.xpath("((//input[contains(@placeholder,'Company')])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateEmail = By.xpath("((//div[contains(@class,'ginput_container_email')]//input[@type='email'])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validatePhone = By.xpath("((//div[contains(@class,'ginput_container_phone')]//input[@type='tel'])[1]//following::div[contains(@id,'validation_message')])[1]");
}
