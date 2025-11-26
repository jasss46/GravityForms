package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.ThriveLocalForm;
import org.testng.annotations.Test;

public class ThriveLocalFormTestCase extends BaseClass
{
    @Test(priority = 1)
    public void RunThriveLocalForm() throws InterruptedException {
        ThriveLocalForm.openPage();
        ThriveLocalForm.scrollDown();
        ThriveLocalForm.enterFirstName("Jaswinder");
        ThriveLocalForm.enterLastName("Singh");
        ThriveLocalForm.companyName("ThriveAgency");
        ThriveLocalForm.emailAddress(generateUniqueEmailWithTimestamp());
        ThriveLocalForm.enterMobileNumber("9098964323");
        ThriveLocalForm.marketingBudget();
        ThriveLocalForm.selectMarketingBudget();
        ThriveLocalForm.hearAboutThriveLocal();
        ThriveLocalForm.enterValueForAboutThrive("L");
        ThriveLocalForm.selectedHearAbout();
        ThriveLocalForm.freeDemoButton();
        ThriveLocalForm.displayThankYouMessage();

    }

    @Test(priority = 2)
    public void ValidateThriveLocalForm() throws InterruptedException
    {   ThriveLocalForm.openPage();
        ThriveLocalForm.scrollDown();
        ThriveLocalForm.freeDemoButton();
        ThriveLocalForm.displayValidationForName();
        ThriveLocalForm.displayValidationForCompany();
        ThriveLocalForm.displayValidationForEmail();
        ThriveLocalForm.displayValidationForPhone();

        ThriveLocalForm.enterFirstName("Jaswinder");
        ThriveLocalForm.enterLastName("Singh");
        ThriveLocalForm.companyName("ThriveAgency");
        ThriveLocalForm.emailAddress(generateUniqueEmailWithTimestamp());
        ThriveLocalForm.enterMobileNumber("9098964323");
        ThriveLocalForm.freeDemoButton();
        ThriveLocalForm.displayThankYouMessage();

    }
    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}