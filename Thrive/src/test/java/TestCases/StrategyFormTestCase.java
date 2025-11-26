package TestCases;

import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.StrategyForm;
import org.testng.annotations.Test;

public class StrategyFormTestCase extends BaseClass {

    @Test(priority=1)
    public void runStrategyForm() throws InterruptedException {
        StrategyForm.pageURL();
        StrategyForm.freeStrategySession();
        StrategyForm.enterName("Jaswinder Singh");
        StrategyForm.enterEmailAddress(generateUniqueEmailWithTimestamp());
        StrategyForm.enterCompany("Thrive");
        StrategyForm.enterMobileNumber("87659 08214");
        StrategyForm.monthlyBudget();
        StrategyForm.selectOptionForMonthlyBudget();
        StrategyForm.aboutThrive();
        StrategyForm.enterValue("Top");
        StrategyForm.selectValueAboutThrive();
        StrategyForm.bookMySession();

    }

    @Test(priority=2)
    public void validateStrategyForm() throws InterruptedException
    {
        StrategyForm.pageURL();
        StrategyForm.freeStrategySession();
        StrategyForm.bookMySession();
        StrategyForm.displayValidationForName();
        StrategyForm.displayValidationForEmail();
        StrategyForm.displayValidationForPhone();
        StrategyForm.displayValidationForMonthlyBudget();

        StrategyForm.enterName("Jaswinder Singh");
        StrategyForm.enterEmailAddress(generateUniqueEmailWithTimestamp());
        StrategyForm.enterCompany("Thrive");
        StrategyForm.enterMobileNumber("87659 08214");
        StrategyForm.monthlyBudget();
        StrategyForm.selectOptionForMonthlyBudget();
        StrategyForm.bookMySession();
    }

    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}
