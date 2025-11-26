package TestCases;

import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.PDFGuideForm;
import org.testng.annotations.Test;

public class PDFGuideTestCase extends BaseClass {

    @Test(priority = 1)
    public void runPDFGuide() throws InterruptedException
    {
        PDFGuideForm.pageURL();
        PDFGuideForm.scrollDown();
        PDFGuideForm.enterName("Jaswinder");
        PDFGuideForm.enterEmailAddress(generateUniqueEmailWithTimestamp());
        PDFGuideForm.getFreeguide();
        PDFGuideForm.verifyNavigationToPdf();

    }

    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}
