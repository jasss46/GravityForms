package GravityForms;
import Config.BaseClass;
import Config.PageURL;
import ExtentReporter.ExtentLogger;
import Locators.ProductFormLocators;
import Locators.ResultGallerySubmitFormLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ResultGallerySubmitForm extends BaseClass {

    public static PageURL pageurl = new PageURL();

    public static void PageURL() throws InterruptedException {
        driver.get(pageurl.getResultGalleryForm());
        Thread.sleep(10000);
//         wait.until(
//                webDriver -> {
//                    String bgColor = (String) ((JavascriptExecutor) webDriver)
//                            .executeScript("return window.getComputedStyle(document.body).getPropertyValue('background-color');");
//                    return bgColor != null && !bgColor.isEmpty() && !"rgba(0, 0, 0, 0)".equals(bgColor);
//                }
//        );
    }
    public static void enterPassword(String password)
    {
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.enterPassword)).sendKeys(password);
    }

    public static void clickEnterButton(){
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.clickEnterButton)).click();
    }

    public static void clientName(){
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.clientName)).click();
    }

    public static void selectClientName(){
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.selectClientName)).click();
    }

    public static void selectCityName(String cityName)
    {
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.cityName)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.enterCityName)).sendKeys(cityName);
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.selectCityName)).click();
    }

//    public static void addNewCity(String newCity){
//        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.addCityButton)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.enterNewCityName)).sendKeys(newCity);
//        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.addNewCity)).click();
//    }
//
//    public static void verifyTheAddedCity(String city){
//        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.cityName)).click();
//        List<WebElement> elements = driver.findElements(By.xpath("//span[contains(@class,'select2-dropdown')]//span//ul//li"));
//        List<String> elementTexts = new ArrayList<>();
//        for (WebElement e : elements) {
//            elementTexts.add(e.getText().trim());
//        }
//        boolean exists = elementTexts.contains(city);
//        Assert.assertTrue(exists, "Expected value '" + city + "' not found in the list!");
//    }

    public static void selectSpecialistName(String specialistName)
    {
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.specialistName)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.enterSpecialistName)).sendKeys(specialistName);
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.selectSpecialistName)).click();
    }

//    public static void addNewSpecialist(String newSpecialist){
//        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.clickAddButtonForSpecialistName)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.addNewSpecialistName)).sendKeys(newSpecialist);
//        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.clickAddButton)).click();
//    }
//    public static void verifyTheAddedSpecialist(String specialist){
//        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.cityName)).click();
//        List<WebElement> elements = driver.findElements(By.xpath("//span[contains(@class,'select2-dropdown')]//span//ul//li"));
//        List<String> elementTexts = new ArrayList<>();
//        for (WebElement e : elements) {
//            elementTexts.add(e.getText().trim());
//        }
//        boolean exists = elementTexts.contains(specialist);
//        Assert.assertTrue(exists, "Expected value '" + specialist + "' not found in the list!");
//    }

    public static void uploadImage(String filePath)
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(ResultGallerySubmitFormLocator.chooseFile))
                .sendKeys(filePath);
        ExtentLogger.pass("File uploaded: " + filePath);
    }

    public static void selectIndustry(){
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.clickIndustry)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.selectIndustry)).click();
    }
    public static void selectServices(){
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.clickServices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.selectServices)).click();
    }
    public static void selectAccountLength(){
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.clickAccountLength)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.selectAccountLength)).click();
    }
    public static void selectBusinessType(){
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.clickBusinessType)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.selectBusinessType)).click();
    }
    public static void selectSpendWithThrive(){
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.clickOnSpendWithThrive)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.selectSpendWithThrive)).click();
    }

    public static void addDescription(String description){

        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.enterText)).sendKeys(description);
    }

    public static void submitForm(){
        wait.until(ExpectedConditions.elementToBeClickable(ResultGallerySubmitFormLocator.submitBtn)).click();
    }
    public static void displayValidationForClientName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ResultGallerySubmitFormLocator.validateClientName));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Client Name field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Client Name is not displayed");
        }
    }

    public static void displayValidationForSpecialistName()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ResultGallerySubmitFormLocator.validateSpecialistName));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Specialist Name field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Specialist Name is not displayed");
        }
    }

    public static void displayValidationForResultsImage()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ResultGallerySubmitFormLocator.validateResultsImage));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Results image is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Results image is not displayed");
        }
    }

    public static void displayValidationForDescription()
    {
        try
        {
            WebElement error =wait.until(ExpectedConditions.visibilityOfElementLocated(ResultGallerySubmitFormLocator.validateDescription));
            String errorMsg = error.getText();
            ExtentLogger.pass("Validation:Description field is required ->"+errorMsg );
        } catch (Exception ex)
        {
            ExtentLogger.fail("Validation for Description is not displayed");
        }
    }


}
