package Locators;

import org.openqa.selenium.By;

public class ProductFormLocators {

        public static By firstName = By.xpath("//div[@class='entry-content']//form//div//input[@placeholder='First Name*']");
        public static By lastName = By.xpath("//div[@class='entry-content']//form//div//input[@placeholder='Last Name*']");
        public static By emailAddress = By.xpath("//div[@class='entry-content']//form//div[contains(@class,'ginput_container_email')]//input[@placeholder=\"Email*\"]");
        public static By phoneNumber = By.xpath("//div[@class='entry-content']//form//div[contains(@class,' gfield--type-phone')]//input[@type=\"tel\"]");
        public static By Message = By.xpath("//div[@class='entry-content']//form//div[contains(@class,'ginput_container_textarea')]//textarea[@placeholder=\"Message*\"]");
        public static By aboutThrive = By.xpath("//div[@class='entry-content']//form//div[contains(@class,'ginput_container_text')]//input[@placeholder=\"How did you hear about Thrive?\"]");
        public static By selectedValueOfAboutThrive = By.xpath("//div[@class='entry-content']//form//div[contains(@class,'custom-dropdown')]//div[text()='QuickSprout']") ;
        public static By uploadFile =By.xpath("//div[@class='entry-content']//form//div[contains(@class,'ginput_container_fileupload')]//input[contains(@type,\"file\")]");
        public static By submitButton= By.xpath("//div[@class='entry-content']//form//input[@value='Submit']");
        public static By thankYouMessage = By.xpath("//div[contains(@class,'fl-col-bg-color')]//div[contains(text(),' We will get in touch with you shortly.')]");

        public static By validateName = By.xpath("(//div[@class='entry-content']//form//div//input[@placeholder='First Name*']//following::div[contains(@id,'validation_message')])[1]");
        public static By validateEmail = By.xpath("(//div[contains(@class,'ginput_container_email')]//input[@placeholder='Email*']//following::div[contains(@id,'validation_message')])[1]");
        public static By validatePhone = By.xpath("(//div[contains(@class,' gfield--type-phone')]//input[@type='tel']//following::div[contains(@id,'validation_message')])[1]");
        public static By validateMessage = By.xpath("(//div[contains(@class,'ginput_container_textarea')]//textarea[@placeholder='Message*']//following::div[contains(@id,'validation_message')])[1]");
        public static By validateFile = By.xpath("(//div[contains(@class,'ginput_container_fileupload')]//input[contains(@type,'file')]//following::div[contains(@id,'validation_message')])[2]");

    }
