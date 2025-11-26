package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.MainContactForm;
import org.testng.annotations.Test;

public class MainContactFormTestCase extends BaseClass {

    @Test(priority = 1)
    public void runMainContactForm() throws InterruptedException {
        MainContactForm.pageURL();
        MainContactForm.enterFirstName("Kritika51");
        MainContactForm.enterLastName("Dhillonn2");
        MainContactForm.enterCompanyName("Test12New");
        MainContactForm.enterWebsiteName("testing");
        MainContactForm.enterEmailAddress(generateUniqueEmailWithTimestamp());
        MainContactForm.enterMobileNumber("99889 66587");
        MainContactForm.enterCompanySize();
        MainContactForm.enterCompanySize1();
        MainContactForm.clickAboutThrive();
        MainContactForm.enterValueForAboutThrive("a");
        MainContactForm.enterValueAd();
        MainContactForm.clickAllServices();
        MainContactForm.enterTextInTextArea("For Testing Purpose");
        MainContactForm.clickOnSubmitButton();
        MainContactForm.displayThankYouMessage();
    }

    @Test(priority = 2)
    public  void ValidateMainContactForm() throws InterruptedException {
        MainContactForm.pageURL();
        MainContactForm.clickOnSubmitButton();
        MainContactForm.displayValidationForName();
        MainContactForm.displayValidationForOrganization();
        MainContactForm.displayValidationForEmail();
        MainContactForm.displayValidationForPhone();
        MainContactForm.displayValidationForCompanySize();
        MainContactForm.displayValidationForServices();
        MainContactForm.enterFirstName("Kritika51");
        MainContactForm.enterLastName("Dhillonn2");
        MainContactForm.enterCompanyName("Test12New");
        MainContactForm.enterWebsiteName("testing");
        MainContactForm.enterEmailAddress(generateUniqueEmailWithTimestamp());
        MainContactForm.enterMobileNumber("99889 66587");
        MainContactForm.enterCompanySize();
        MainContactForm.enterCompanySize1();
        MainContactForm.clickAboutThrive();
        MainContactForm.enterValueForAboutThrive("a");
        MainContactForm.enterValueAd();
        MainContactForm.clickAllServices();
        MainContactForm.enterTextInTextArea("For Testing Purpose");
        MainContactForm.clickOnSubmitButton();
        MainContactForm.displayThankYouMessage();
    }

    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "kritika+" + timestamp + "@thriveagency.com";
    }
}