package TestCases;

import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.HotelsLandingPage;
import org.testng.annotations.Test;

public class HotelsLandingPageTestCase extends BaseClass {

    @Test(priority = 1)
    public void runHotelsLandingPage() throws InterruptedException
    {
        HotelsLandingPage.pageURL();
        HotelsLandingPage.enterFirstName("Jaswinder");
        HotelsLandingPage.enterLastName("Singh");
        HotelsLandingPage.enterCompanyName("Thrive");
        HotelsLandingPage.enterEmailAddress(generateUniqueEmailWithTimestamp());
        HotelsLandingPage.enterMobileNumber("98765 45673");
        HotelsLandingPage.requestDemo();
        HotelsLandingPage.displayThankYouMessage();

    }

    @Test(priority = 2)
    public void validateHotelsLandingPage() throws InterruptedException
    {
        HotelsLandingPage.pageURL();
        HotelsLandingPage.requestDemo();
        HotelsLandingPage.displayValidationForName();
        HotelsLandingPage.displayValidationForCompany();
        HotelsLandingPage.displayValidationForEmail();
        HotelsLandingPage.displayValidationForPhone();

        HotelsLandingPage.enterFirstName("Jaswinder");
        HotelsLandingPage.enterLastName("Singh");
        HotelsLandingPage.enterCompanyName("Thrive");
        HotelsLandingPage.enterEmailAddress(generateUniqueEmailWithTimestamp());
        HotelsLandingPage.enterMobileNumber("98765 45673");
        HotelsLandingPage.requestDemo();
        HotelsLandingPage.displayThankYouMessage();

    }
    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}
