package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.OldContactForm;
import org.testng.annotations.Test;

public class OldContactFormTestCase extends BaseClass {

    @Test(priority = 1)
    public void RunOldContactForm() throws InterruptedException {
        OldContactForm.URL();
        OldContactForm.scrollDown();
        OldContactForm.firstName("Jaswinder");
        OldContactForm.lastName("Singh");
        OldContactForm.emailAddress(generateUniqueEmailWithTimestamp());
        OldContactForm.phoneNumber("76590 23467");
        OldContactForm.companyOrganization("ThriveAgency");
        OldContactForm.websiteName("https://thriveagency.com");
        OldContactForm.Services("Web Design","Pay Per Click (PPC)","Photography / Video");
        OldContactForm.estimatedMonthlyBudget();
        OldContactForm.selectOptionOfEstimatedMonthlyBudget();
        OldContactForm.estimatedWebDesignBudget();
        OldContactForm.selectOptionOfEstimatedWebDesignBudget();
        OldContactForm.photographyVideographyBudget();
        OldContactForm.selectOptionOfPhotographyVideographyBudget();
        OldContactForm.Message("For testing only");
        OldContactForm.aboutThrive();
        OldContactForm.enterValue("T");
        OldContactForm.selectedValueAboutThrive();
        OldContactForm.submitButton();
        OldContactForm.displayThankYouMessage();
    }

    @Test(priority = 2)
    public void ValidateOldContactForm() throws InterruptedException {
        OldContactForm.URL();
        OldContactForm.scrollDown();
        OldContactForm.submitButton();
        OldContactForm.displayValidationForName();
        OldContactForm.displayValidationForEmail();
        OldContactForm.displayValidationForPhone();
        OldContactForm.displayValidationForOrganization();
        OldContactForm.displayValidationForServices();

        OldContactForm.firstName("Jaswinder");
        OldContactForm.lastName("Singh");
        OldContactForm.emailAddress(generateUniqueEmailWithTimestamp());
        OldContactForm.phoneNumber("76590 23467");
        OldContactForm.companyOrganization("ThriveAgency");
        OldContactForm.websiteName("https://thriveagency.com");
        OldContactForm.Services("Web Design","Pay Per Click (PPC)","Photography / Video");
        OldContactForm.estimatedMonthlyBudget();
        OldContactForm.selectOptionOfEstimatedMonthlyBudget();
        OldContactForm.estimatedWebDesignBudget();
        OldContactForm.selectOptionOfEstimatedWebDesignBudget();
        OldContactForm.photographyVideographyBudget();
        OldContactForm.selectOptionOfPhotographyVideographyBudget();
        OldContactForm.Message("For testing only");
        OldContactForm.aboutThrive();
        OldContactForm.enterValue("T");
        OldContactForm.selectedValueAboutThrive();
        OldContactForm.submitButton();
        OldContactForm.displayThankYouMessage();

    }



    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}
