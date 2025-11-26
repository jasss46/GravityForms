package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.GMBGuideForm;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class GMBGuideFormTestCase extends BaseClass
{
    @Test(priority = 1)
    public  void RunGMBForm() throws InterruptedException {
        GMBGuideForm.URL();
        GMBGuideForm.downloadButton();
        GMBGuideForm.Name("Jaswinder Singh");
        GMBGuideForm.emailAddress(generateUniqueEmailWithTimestamp());
        GMBGuideForm.getAccessButton();
        GMBGuideForm.displayMessage();
    }
    @Test(priority = 2)
    public void ValidateGMBForm() throws InterruptedException {
        GMBGuideForm.URL();
        Thread.sleep(10000);
        GMBGuideForm.downloadButton();
        GMBGuideForm.getAccessButton();
        GMBGuideForm.displayValidation();
        GMBGuideForm.Name("Jaswinder Singh");
        GMBGuideForm.emailAddress(generateUniqueEmailWithTimestamp());
        GMBGuideForm.getAccessButton();
        GMBGuideForm.displayMessage();
    }

    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}
