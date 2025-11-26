package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.NewContactForm;
import org.testng.annotations.Test;

public class NewContactFormTestCase extends BaseClass
{
    @Test(priority = 1)
    public void RunNewContactForm() throws InterruptedException {
        NewContactForm.URL();
        NewContactForm.scrollDown();
        NewContactForm.enterFirstName("Jaswinder");
        NewContactForm.enterLastName("Singh");
        NewContactForm.companyName("ThriveAgency");
        NewContactForm.websiteAddress("https://thriveagency.com");
        NewContactForm.emailAddress(generateUniqueEmailWithTimestamp());
        NewContactForm.phoneNumber("8987654321");
        NewContactForm.services();
        NewContactForm.selectServies();
        NewContactForm.companySize();
        NewContactForm.selectCompanySize();
        NewContactForm.aboutThrive();
        NewContactForm.enterValueForAboutThrive("V");
        NewContactForm.enterValueVideoAd();
        NewContactForm.enterTextInTextArea("testing only");
        NewContactForm.freeDemoButton();
        NewContactForm.displayThankYouMessage();
    }

    @Test(priority = 2)
    public void ValidateNewContactForm() throws InterruptedException {
        NewContactForm.URL();
        NewContactForm.scrollDown();
        NewContactForm.freeDemoButton();
        NewContactForm.displayValidationForName();
        NewContactForm.displayValidationForEmail();
        NewContactForm.displayValidationForOrganization();
        NewContactForm.displayValidationForPhone();
        NewContactForm.displayValidationForServices();
        NewContactForm.displayValidationForCompanySize();

        NewContactForm.enterFirstName("Jaswinder");
        NewContactForm.enterLastName("Singh");
        NewContactForm.companyName("ThriveAgency");
        NewContactForm.websiteAddress("https://thriveagency.com");
        NewContactForm.emailAddress(generateUniqueEmailWithTimestamp());
        NewContactForm.phoneNumber("8987654321");
        NewContactForm.services();
        NewContactForm.selectServies();
        NewContactForm.companySize();
        NewContactForm.selectCompanySize();
        NewContactForm.aboutThrive();
        NewContactForm.enterValueForAboutThrive("V");
        NewContactForm.enterValueVideoAd();
        NewContactForm.enterTextInTextArea("testing only");
        NewContactForm.freeDemoButton();
        NewContactForm.displayThankYouMessage();
    }



    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}