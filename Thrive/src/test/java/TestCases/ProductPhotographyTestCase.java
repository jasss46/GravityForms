package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.ProductPhotographyForm;
import org.testng.annotations.Test;

public class ProductPhotographyTestCase extends BaseClass {

    static String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\Files\\ThriveShot.png";
    @Test(priority = 1)
    public void RunProductPhotographyForm() throws InterruptedException {
        ProductPhotographyForm.pageURL();
        System.out.println(filePath);
        ProductPhotographyForm.scrollDown();
        ProductPhotographyForm.firstName("Jaswinder");
        ProductPhotographyForm.lastName("Singh");
        ProductPhotographyForm.emailAddress(generateUniqueEmailWithTimestamp());
        ProductPhotographyForm.phoneNumber("8976543456");
        ProductPhotographyForm.Message("Only for testing");
        ProductPhotographyForm.aboutThrive();
        ProductPhotographyForm.enterValueOfAboutThrive("Q");
        ProductPhotographyForm.selectedValueOfAboutThrive();
        ProductPhotographyForm.uploadFile(filePath);
        ProductPhotographyForm.submitButton();
        ProductPhotographyForm.displayThankYouMessage();
    }

    @Test(priority = 2)
    public void ValidateProductPhotographyForm() throws InterruptedException {
        ProductPhotographyForm.pageURL();
        ProductPhotographyForm.scrollDown();
        ProductPhotographyForm.submitButton();
        ProductPhotographyForm.displayValidationForName();
        ProductPhotographyForm.displayValidationForEmail();
        ProductPhotographyForm.displayValidationForPhone();
        ProductPhotographyForm.displayValidationForMessage();
        ProductPhotographyForm.displayValidationForFile();
        ProductPhotographyForm.firstName("Jaswinder");
        ProductPhotographyForm.lastName("Singh");
        ProductPhotographyForm.emailAddress(generateUniqueEmailWithTimestamp());
        ProductPhotographyForm.phoneNumber("8976543456");
        ProductPhotographyForm.Message("Only for testing");
        ProductPhotographyForm.aboutThrive();
        ProductPhotographyForm.enterValueOfAboutThrive("Q");
        ProductPhotographyForm.selectedValueOfAboutThrive();
        ProductPhotographyForm.uploadFile(filePath);
        ProductPhotographyForm.submitButton();
        ProductPhotographyForm.displayThankYouMessage();
    }

    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}