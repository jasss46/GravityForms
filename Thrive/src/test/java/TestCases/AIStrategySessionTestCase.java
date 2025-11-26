package TestCases;

import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.AIStrategySessionForm;
import org.testng.annotations.Test;

public class AIStrategySessionTestCase extends BaseClass {

    @Test(priority = 1)
    public void runAIStrategySessionForm() throws InterruptedException
    {
        AIStrategySessionForm.pageURL();
        AIStrategySessionForm.enterFirstName("Jaswinder");
        AIStrategySessionForm.enterLastName("Singh");
        AIStrategySessionForm.enterCompanyName("Thrive");
        AIStrategySessionForm.enterEmailAddress(generateUniqueEmailWithTimestamp());
        AIStrategySessionForm.enterPhoneNumber("98076 67054");
        AIStrategySessionForm.selectIndustry();
        AIStrategySessionForm.selectMonthlyBudget();
        AIStrategySessionForm.bookNow();
        AIStrategySessionForm.displayThankYouMessage();
    }

    @Test(priority = 2)
    public void validateAIStrategyForm() throws InterruptedException
    {
        AIStrategySessionForm.pageURL();
        AIStrategySessionForm.bookNow();
        AIStrategySessionForm.displayValidationForName();
        AIStrategySessionForm.displayValidationForCompany();
        AIStrategySessionForm.displayValidationForEmail();
        AIStrategySessionForm.displayValidationForPhone();
        AIStrategySessionForm.displayValidationForMarketingBudget();

        AIStrategySessionForm.enterFirstName("Jaswinder");
        AIStrategySessionForm.enterLastName("Singh");
        AIStrategySessionForm.enterCompanyName("Thrive");
        AIStrategySessionForm.enterEmailAddress(generateUniqueEmailWithTimestamp());
        AIStrategySessionForm.enterPhoneNumber("98076 67054");
        AIStrategySessionForm.selectIndustry();
        AIStrategySessionForm.selectMonthlyBudget();
        AIStrategySessionForm.bookNow();
        AIStrategySessionForm.displayThankYouMessage();

    }

    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}
