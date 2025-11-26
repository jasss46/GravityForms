package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.ReferralForm;
import org.testng.annotations.Test;

public class ReferralFormTestCase extends BaseClass
{
    @Test(priority = 1)
    public void runReferralForm() throws InterruptedException {
        ReferralForm.pageURL();
        ReferralForm.scrollDown();
        ReferralForm.enterFirstName("Jaswinder");
        ReferralForm.enterLastName("Singh");
        ReferralForm.enterEmailAddress(generateUniqueEmailWithTimestamp());
        ReferralForm.enterPhoneNumber("9858785849");
        ReferralForm.enterReferralFirstName("Amit");
        ReferralForm.enterReferralLastName("Rana");
        ReferralForm.enterReferralPhoneNumber("6698587852");
        ReferralForm.enterReferralEmail(generateUniqueEmail());
        ReferralForm.enterMessage("For Testing Purpose");
        ReferralForm.aboutThrive();
        ReferralForm.enterValueOfAboutThrive("T");
        ReferralForm.valueOfAboutThrive();
        ReferralForm.clickSubmitButton();
        ReferralForm.displayThankYouMessage();
    }

    @Test(priority = 2)
    public void ValidateReferralForm() throws InterruptedException {
        ReferralForm.pageURL();
        ReferralForm.scrollDown();
        ReferralForm.clickSubmitButton();
        ReferralForm.displayValidationForName();
        ReferralForm.displayValidationForPhone();
        ReferralForm.displayValidationForEmail();
        ReferralForm.displayValidationForReferralName();
        ReferralForm.displayValidationForReferralPhone();
        ReferralForm.displayValidationForEmail();
        ReferralForm.displayValidationForServicesRequired();

        ReferralForm.enterFirstName("Jaswinder");
        ReferralForm.enterLastName("Singh");
        ReferralForm.enterEmailAddress(generateUniqueEmailWithTimestamp());
        ReferralForm.enterPhoneNumber("9858785849");
        ReferralForm.enterReferralFirstName("Amit");
        ReferralForm.enterReferralLastName("Rana");
        ReferralForm.enterReferralPhoneNumber("6698587852");
        ReferralForm.enterReferralEmail(generateUniqueEmail());
        ReferralForm.enterMessage("For Testing Purpose");
        ReferralForm.aboutThrive();
        ReferralForm.enterValueOfAboutThrive("T");
        ReferralForm.valueOfAboutThrive();
        ReferralForm.clickSubmitButton();
        ReferralForm.displayThankYouMessage();

    }

    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
    public static String generateUniqueEmail() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "Amitrana+" + timestamp + "@thriveagency.com";
    }
}