package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.RFPTemplateForm;
import org.testng.annotations.Test;

public class RFPTemplateFormTestCase extends BaseClass {

    @Test(priority = 1)
    public void RunRFPForm() throws InterruptedException {
        RFPTemplateForm.pageURL();
        RFPTemplateForm.firstName("Jaswinder");
        RFPTemplateForm.lastName("Singh");
        RFPTemplateForm.emailAddress(generateUniqueEmailWithTimestamp());
        RFPTemplateForm.companyName("Thrive agency");
        RFPTemplateForm.phoneNumber("+91 98785 43934");
        RFPTemplateForm.clickAllServices();
        RFPTemplateForm.aboutThrive();
        RFPTemplateForm.enterValue("U");
        RFPTemplateForm.selectThriveValue();
        RFPTemplateForm.freeTemplateButton();
        RFPTemplateForm.displayThankText();
    }

    @Test(priority = 2)
    public void ValidateRFPForm() throws InterruptedException {
        RFPTemplateForm.pageURL();
        RFPTemplateForm.freeTemplateButton();
        RFPTemplateForm.displayValidationForName();
        RFPTemplateForm.displayValidationForEmail();
        RFPTemplateForm.displayValidationForPhone();
        RFPTemplateForm.displayValidationForTemplatesSelection();

        RFPTemplateForm.firstName("Jaswinder");
        RFPTemplateForm.lastName("Singh");
        RFPTemplateForm.emailAddress(generateUniqueEmailWithTimestamp());
        RFPTemplateForm.companyName("Thrive agency");
        RFPTemplateForm.phoneNumber("+91 98785 43934");
        RFPTemplateForm.clickAllServices();
        RFPTemplateForm.aboutThrive();
        RFPTemplateForm.enterValue("U");
        RFPTemplateForm.selectThriveValue();
        RFPTemplateForm.freeTemplateButton();
        RFPTemplateForm.displayThankText();
    }

    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}
