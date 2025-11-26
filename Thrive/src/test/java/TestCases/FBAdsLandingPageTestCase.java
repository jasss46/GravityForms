package TestCases;

import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.FBAdsLandingPage;
import org.testng.annotations.Test;


public class FBAdsLandingPageTestCase extends BaseClass {

    @Test(priority = 1)
    public void runFBAdsLandingPage() throws InterruptedException
    {
        FBAdsLandingPage.pageURL();
        FBAdsLandingPage.enterFirstName("Jaswinder");
        FBAdsLandingPage.enterLastName("Singh");
        FBAdsLandingPage.enterCompanyName("Thrive");
        FBAdsLandingPage.enterWebsite("Test");
        FBAdsLandingPage.enterEmailAddress(generateUniqueEmailWithTimestamp());
        FBAdsLandingPage.enterPhoneNumber("98076 67054");
        FBAdsLandingPage.monthlyMarketingBudget();
        FBAdsLandingPage.selectOptionOfMonthlyMarketingBudget();
        FBAdsLandingPage.enterBusinessDescription("Testing purpose");
        FBAdsLandingPage.enterValueOfAboutThrive("Top");
        FBAdsLandingPage.selectedValueOfAboutThrive();
        FBAdsLandingPage.scheduleCall();
        FBAdsLandingPage.displayThankYouMessage();
    }

    @Test(priority = 2)
    public void ValidateFBAdsLandingPage() throws InterruptedException
    {
        FBAdsLandingPage.pageURL();
        FBAdsLandingPage.scheduleCall();
        FBAdsLandingPage.displayValidationForName();
        FBAdsLandingPage.displayValidationForCompany();
        FBAdsLandingPage.displayValidationForWebsite();
        FBAdsLandingPage.displayValidationForEmail();
        FBAdsLandingPage.displayValidationForPhone();
        FBAdsLandingPage.displayValidationForBudget();
        FBAdsLandingPage.displayValidationForBusiness();

        FBAdsLandingPage.enterFirstName("Jaswinder");
        FBAdsLandingPage.enterLastName("Singh");
        FBAdsLandingPage.enterCompanyName("Thrive");
        FBAdsLandingPage.enterWebsite("Test");
        FBAdsLandingPage.enterEmailAddress(generateUniqueEmailWithTimestamp());
        FBAdsLandingPage.enterPhoneNumber("98076 67054");
        FBAdsLandingPage.monthlyMarketingBudget();
        FBAdsLandingPage.selectOptionOfMonthlyMarketingBudget();
        FBAdsLandingPage.enterBusinessDescription("Testing purpose");
        FBAdsLandingPage.enterValueOfAboutThrive("Top");
        FBAdsLandingPage.selectedValueOfAboutThrive();
        FBAdsLandingPage.scheduleCall();
        FBAdsLandingPage.displayThankYouMessage();

    }


    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}
