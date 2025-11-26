package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.ThriveForAgencies;
import org.testng.annotations.Test;

public class ThriveForAgenciesFormTestCase extends BaseClass
{
    @Test(priority = 1)
    public void runThriveForAgencies() throws InterruptedException {
        ThriveForAgencies.pageURL();
        ThriveForAgencies.scrollDown();
        ThriveForAgencies.enterFirstName("Jaswinder");
        ThriveForAgencies.enterLastName("Singh");
        ThriveForAgencies.enterEmailAddress(generateUniqueEmailWithTimestamp());
        ThriveForAgencies.enterMobileNumber("9858785875");
        ThriveForAgencies.enterCompanyName("test");
        ThriveForAgencies.enterWebsiteAddress("Thrive Agency");
        ThriveForAgencies.enterTextArea("For Testing Purpose");
        ThriveForAgencies.clickHowDidYouHearField();
        ThriveForAgencies.enterValueInAboutThriveField("a");
        ThriveForAgencies.selectAdforum();
        ThriveForAgencies.clickSubmitButton();
        ThriveForAgencies.displayThankYouMessage();
    }
    @Test(priority = 2)
    public void ValidateThriveForAgencies() throws InterruptedException {
        ThriveForAgencies.pageURL();
        ThriveForAgencies.scrollDown();
        ThriveForAgencies.clickSubmitButton();
        ThriveForAgencies.displayValidationForName();
        ThriveForAgencies.displayValidationForEmail();
        ThriveForAgencies.displayValidationForPhone();
        ThriveForAgencies.displayValidationForCompany();

        ThriveForAgencies.enterFirstName("Jaswinder");
        ThriveForAgencies.enterLastName("Singh");
        ThriveForAgencies.enterEmailAddress(generateUniqueEmailWithTimestamp());
        ThriveForAgencies.enterMobileNumber("9858785875");
        ThriveForAgencies.enterCompanyName("test");
        ThriveForAgencies.clickSubmitButton();
        ThriveForAgencies.displayThankYouMessage();
    }
    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}