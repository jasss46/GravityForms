package TestCases;

import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.ReviewsLandingPage;
import org.testng.annotations.Test;

public class ReviewsLandingPageTestCase extends BaseClass {

    @Test(priority = 1)
    public void runReviewsLandingPageForm() throws InterruptedException
    {
        ReviewsLandingPage.pageURL();
        ReviewsLandingPage.enterFirstName("Jaswinder");
        ReviewsLandingPage.enterLastName("Singh");
        ReviewsLandingPage.enterCompanyName("Thrive");
        ReviewsLandingPage.enterEmailAddress(generateUniqueEmailWithTimestamp());
        ReviewsLandingPage.enterMobileNumber("98765 45673");
        ReviewsLandingPage.claimReviews();
        ReviewsLandingPage.displayThankYouMessage();

    }

    @Test(priority = 2)
    public void validateReviewsLandingPage() throws InterruptedException
    {
        ReviewsLandingPage.pageURL();
        ReviewsLandingPage.claimReviews();
        ReviewsLandingPage.displayValidationForName();
        ReviewsLandingPage.displayValidationForCompany();
        ReviewsLandingPage.displayValidationForEmail();
        ReviewsLandingPage.displayValidationForPhone();

        ReviewsLandingPage.enterFirstName("Jaswinder");
        ReviewsLandingPage.enterLastName("Singh");
        ReviewsLandingPage.enterCompanyName("Thrive");
        ReviewsLandingPage.enterEmailAddress(generateUniqueEmailWithTimestamp());
        ReviewsLandingPage.enterMobileNumber("98765 45673");
        ReviewsLandingPage.claimReviews();
        ReviewsLandingPage.displayThankYouMessage();

    }
    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}
