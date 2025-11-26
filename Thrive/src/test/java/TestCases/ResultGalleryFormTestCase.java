package TestCases;

import Config.BaseClass;
import GravityForms.ResultGallerySubmitForm;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ResultGalleryFormTestCase extends BaseClass {
    static String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\Files\\ThriveShot.png";

    @Test(priority = 1)
    public void runResultGalleryForm() throws InterruptedException {
        ResultGallerySubmitForm.PageURL();
        driver.findElement(By.xpath("//*[@id='Capa_1']")).click();
        ResultGallerySubmitForm.clientName();
        ResultGallerySubmitForm.selectClientName();
        ResultGallerySubmitForm.selectCityName("Brenham");
        ResultGallerySubmitForm.selectSpecialistName("Caroline Zeichner");
        ResultGallerySubmitForm.uploadImage(filePath);
        ResultGallerySubmitForm.selectIndustry();
        ResultGallerySubmitForm.selectServices();
        ResultGallerySubmitForm.selectAccountLength();
        ResultGallerySubmitForm.selectBusinessType();
        ResultGallerySubmitForm.selectSpendWithThrive();
        ResultGallerySubmitForm.addDescription("Testing");
        ResultGallerySubmitForm.submitForm();
    }

    @Test(priority = 2)
    public void ValidateResultGalleryForm() throws InterruptedException
    {
        ResultGallerySubmitForm.PageURL();
        driver.findElement(By.xpath("//*[@id='Capa_1']")).click();
        ResultGallerySubmitForm.submitForm();
        ResultGallerySubmitForm.displayValidationForClientName();
        ResultGallerySubmitForm.displayValidationForSpecialistName();
        ResultGallerySubmitForm.displayValidationForResultsImage();
        ResultGallerySubmitForm.displayValidationForDescription();

        ResultGallerySubmitForm.clientName();
        ResultGallerySubmitForm.selectClientName();
        ResultGallerySubmitForm.selectSpecialistName("Caroline Zeichner");
        ResultGallerySubmitForm.uploadImage(filePath);
        ResultGallerySubmitForm.addDescription("Testing");
        ResultGallerySubmitForm.submitForm();
    }

}
