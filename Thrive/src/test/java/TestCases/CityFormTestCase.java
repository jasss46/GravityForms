package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.CityForm;
import org.testng.annotations.Test;

public class CityFormTestCase extends BaseClass {

    @Test(priority = 1)
    public void runCityForm() throws InterruptedException {
        CityForm.pageURL();
        CityForm.arrowClick();
        CityForm.companySize();
        CityForm.selectCompanySize();
        CityForm.websiteAddress("https://thriveagency.com");
        CityForm.aboutThrive();
        CityForm.enterValueForAboutThrive("f");
        CityForm.enterValueFacebook();
        CityForm.textArea("Only for testing");
        CityForm.getStartedButton();
        CityForm.enterFirstName("Jaswinder");
        CityForm.enterLastName("Singh");
        CityForm.companyOrganization("ThriveAgency");
        CityForm.phoneNumber("9876543267");
        CityForm.emailAddress(generateUniqueEmailWithTimestamp());
        CityForm.startedButton();
        CityForm.displayThankYouMessage();
    }

    @Test(priority = 2)
    public void ValidateCityForm() throws InterruptedException
    {
        CityForm.pageURL();
        CityForm.arrowClick();
        CityForm.getStartedButton();
        CityForm.displayValidation();
        CityForm.companySize();
        CityForm.selectCompanySize();
        CityForm.getStartedButton();
        CityForm.startedButton();
        CityForm.displayValidationForName();
        CityForm.displayValidationForOrganization();
        CityForm.displayValidationForPhone();
        CityForm.displayValidationForEmail();
        CityForm.enterFirstName("Jaswinder");
        CityForm.enterLastName("Singh");
        CityForm.companyOrganization("ThriveAgency");
        CityForm.phoneNumber("9876543267");
        CityForm.emailAddress(generateUniqueEmailWithTimestamp());
        CityForm.startedButton();
        CityForm.displayThankYouMessage();
    }

    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}
