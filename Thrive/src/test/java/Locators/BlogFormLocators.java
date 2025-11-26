package Locators;
import org.openqa.selenium.By;

public class BlogFormLocators {

    public static By emailAddress = By.xpath("//div[@class='main-newswrap']//input[@placeholder='Email']");
    public static By subscribeButton = By.xpath("//div[@class='main-newswrap']//input[@value='SUBSCRIBE']");
    public static By thankYouMessage = By.xpath("//h1[contains(text(),'Thank You For Signing Up')]");
    public static By validationMessage = By.xpath("//div[@class='main-newswrap']//input[@placeholder='Email']//following::div[contains(@id,'validation_message')]");
}
