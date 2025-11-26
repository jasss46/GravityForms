package Locators;
import org.openqa.selenium.By;

public class ResultGallerySubmitFormLocator {
    public static By enterPassword = By.xpath("//input[@type='password']");
    public static By clickEnterButton = By.xpath("//button[@class='password_submit']");
    public static By clientName = By.xpath("(//span[@class='select2-selection__rendered'])[1]//span[@class='select2-selection__placeholder'][normalize-space()='Select an Option']");
    public static By selectClientName = By.xpath("//span[@class='select2-results']//li[4]");
    public static By cityName = By.xpath("(//span[@class='select2-selection__rendered'])[2]//span[@class='select2-selection__placeholder'][normalize-space()='Select an Option']");
    public static By enterCityName = By.xpath("//span[contains(@class,'select2-dropdown')]//span//input");
    public static By selectCityName = By.xpath("//span[contains(@class,'select2-dropdown')]//span//ul//li[1]");
//    public static By addCityButton = By.xpath("(//span[@class='showFields'])[2]//i[@class='fas fa-plus-circle']");
//    public static By enterNewCityName = By.xpath("//div[@class='custom_div']//input[@placeholder='Add New City Name']");
//    public static By addNewCity = By.xpath("(//div[@class='custom_div']//span[@class='add_term'])[2]");
    public static By specialistName = By.xpath("(//span[@class='select2-selection__rendered'])[3]//span[@class='select2-selection__placeholder'][normalize-space()='Select an Option']");
    public static By enterSpecialistName = By.xpath("//span[contains(@class,'select2-dropdown')]//span//input");
    public static By selectSpecialistName = By.xpath("//span[contains(@class,'select2-dropdown')]//span//ul//li[1]");
//    public static By clickAddButtonForSpecialistName = By.xpath("(//span[@class='showFields'])[3]//i[@class='fas fa-plus-circle']");
//    public static By addNewSpecialistName = By.xpath("//div[@class='custom_div']//input[@placeholder='Add New Specialist Name']");
//    public static By clickAddButton = By.xpath("(//div[@class='custom_div']//span[@class='add_term'])[3]");
//    public static By addSpecialist = By.xpath("(//div[@class='custom_div']//span[@class='add_term'])[3]");
//    public static By addSpecialistName = By.xpath("//span[contains(@class,'select2-dropdown')]//span//input");
    public static By chooseFile = By.xpath("//div[contains(@class,'ginput_container_post_image')]//span//input[@type='file']");
    public static By clickIndustry = By.xpath("(//span[@class='select2-selection__rendered'])[4]");
    public static By selectIndustry = By.xpath("//span[@class='select2-results']//ul//li[4]");
    public static By clickServices = By.xpath("(//span[@class='select2-selection__rendered'])[5]//span[@class='select2-selection__placeholder'][normalize-space()='Select an Option']");
    public static By selectServices = By.xpath("//span[@class='select2-results']//ul//li[4]");
    public static By clickAccountLength = By.xpath("(//span[@class='select2-selection__rendered'])[6]");
    public static By selectAccountLength = By.xpath("//span[@class='select2-results']//ul//li[4]");
    public static By clickBusinessType = By.xpath("(//span[@class='select2-selection__rendered'])[8]");
    public static By selectBusinessType = By.xpath("//span[@class='select2-results']//ul//li[4]");
    public static By clickOnSpendWithThrive = By.xpath("(//span[@class='select2-selection__rendered'])[9]");
    public static By selectSpendWithThrive = By.xpath("//span[@class='select2-results']//ul//li[4]");
    public static By enterText = By.xpath("//div[@class='ginput_container ginput_container_textarea']//textarea[@class='textarea medium']");
    public static By submitBtn = By.xpath("//input[@value='Submit']");

    public static By validateClientName = By.xpath("((//div[contains(@class,'container_select')]//select)[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateSpecialistName = By.xpath("((//div[@class='content-sidebar-wrap']//form//div[contains(@class,'ginput_container_select')]//select)[3]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateResultsImage = By.xpath("((//div[contains(@class,'post_image gform')]//input[@type='file'])[1]//following::div[contains(@id,'validation_message')])[1]");
    public static By validateDescription = By.xpath("(//textarea[@class='textarea medium']//following::div[contains(@id,'validation_message')])[1]");
}
