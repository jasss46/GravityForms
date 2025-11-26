package Locators;
import org.openqa.selenium.By;

public class SeoAuditReportFormLocators {

    public static By firstName = By.xpath("(//div[@class='site-container']//form)[3]//div//input[@placeholder='First Name']");
    public static By lastName = By.xpath("(//div[@class= 'site-container']//form)[3]//div//input[@placeholder='Last Name']");
    public static By enterWebsite = By.xpath("(//div[@class= 'site-container']//form)[3]//div//input[@placeholder='Enter website']");
    public static By emailAddress = By.xpath("(//div[@class= 'site-container']//form)[3]//div//input[@name='email']");
    public static By getFreeReportNowButton = By.xpath("(//div[@class= 'site-container']//form)[3]//div//input[@type='submit']");
    public static By displayReport = By.xpath("//div[@class='portlet-body bg-none']");
}
