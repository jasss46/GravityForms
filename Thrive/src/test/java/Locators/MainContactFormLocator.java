package Locators;
import org.openqa.selenium.By;

public class MainContactFormLocator {

   public static By firstName = By.xpath("(//div[contains(@class,'ginput_complex')]//input[@type='text'])[1]");
   public static  By lastName = By.xpath("(//div[contains(@class,'ginput_complex')]//input[@type='text'])[2]");
   public static By company = By.xpath("(//div[contains(@class,'ginput_container')]//input[contains(@placeholder,'Company')])[1]");
   public static  By website = By.xpath("(//div[contains(@class,'ginput_container_text')]/input[@placeholder='Website'])[1]");
   public static  By emailAddress = By.xpath("(//div[contains(@class,'ginput_container_email')]//input[@type='email'])[1]");
   public static By mobileNumber = By.xpath("(//div[contains(@class,'ginput_container_phone')]//input[@type='tel'])[1]");
   public static By companySize = By.xpath("(//div[contains(@class,'ginput_container_select')])[1]");
   public static  By companySize1 = By.xpath("(//div[contains(@class,'ginput_container_select')]/select/option)[2]");
   public static By aboutThrive = By.xpath("(//div[contains(@class,'ginput_container_text')]//input[contains(@placeholder,'How did you hear about Thrive?')])[1]");
   public static By adForum = By.xpath("//div[@id='custom-dropdown']//following::div[text()='Adforum']");
   public static By checkboxes = By.xpath("//ul[@class='gfield_checkbox']/li/label");
   public static By textArea = By.xpath("(//div[contains(@class,'container_textarea')]/textarea[@placeholder='Tell us about your business'])[1]");
   public static By getMyFreeProposal = By.xpath("//div[contains(@class,'gform_footer')]//input[@value='Send My Free Proposal']");
   public static By thankYouMessage = By.xpath("//h1[contains(text(),'Thanks For Contacting Us!')]");

   public static By validateName = By.xpath("((//div[contains(@class,'ginput_complex')]//input[@type='text'])[2]//following::div[contains(@id,'validation_message')])[1]");
   public static By validateCompany=By.xpath("((//input[contains(@placeholder,'Company')])[1]//following::div[contains(@id,'validation_message')])[1]");
   public static By validateEmail = By.xpath("((//div[contains(@class,'ginput_container_email')]//input[@type='email'])[1]//following::div[contains(@id,'validation_message')])[1]");
   public static By validatePhone = By.xpath("((//div[contains(@class,'ginput_container_phone')]//input[@type='tel'])[1]//following::div[contains(@id,'validation_message')])[1]");
   public static By validateCompanySize = By.xpath("((//div[contains(@class,'ginput_container_select')])[1]//following::div[contains(@id,'validation_message')])[1]");
   public static By validateServices = By.xpath("(//ul[@class='gfield_checkbox']//input[@class='gfield-choice-input']//following::div[contains(@id,'validation_message')])[1]");



}
