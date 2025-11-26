package TestCases;

import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.ProposalPopUpForm;
import org.testng.annotations.Test;

public class ProposalPopUpFormTestCase extends BaseClass {

    @Test(priority = 1)
    public void runProposalPopUpForm() throws InterruptedException
    {
        ProposalPopUpForm.pageURL();
        ProposalPopUpForm.getFreeProposal();
        ProposalPopUpForm.enterWebsite("https://thriveagency.com/");
        ProposalPopUpForm.enterBusinessDescription("Testing purpose");
        ProposalPopUpForm.enterValueOfAboutThrive("Top");
        ProposalPopUpForm.selectedValueOfAboutThrive();
        ProposalPopUpForm.getStarted();
        ProposalPopUpForm.firstName("Jaswinder");
        ProposalPopUpForm.lastName("Singh");
        ProposalPopUpForm.emailAddress( generateUniqueEmailWithTimestamp());
        ProposalPopUpForm.selectMonthlyBudget();
        ProposalPopUpForm.companyOrOrganization("Thrive");
        ProposalPopUpForm.phoneNumber("98765 56789");
        ProposalPopUpForm.sendProposal();
        ProposalPopUpForm.displayThankYouMessage();
    }

    @Test(priority = 2)
    public void validateProposalPopUpForm() throws InterruptedException
    {
        ProposalPopUpForm.pageURL();
        ProposalPopUpForm.getFreeProposal();
        ProposalPopUpForm.getStarted();
        ProposalPopUpForm.sendProposal();
        ProposalPopUpForm.displayValidationForName();
        ProposalPopUpForm.displayValidationForEmail();
        ProposalPopUpForm.displayValidationForMarketingBudget();
        ProposalPopUpForm.displayValidationForOrganization();
        ProposalPopUpForm.displayValidationForPhone();

        ProposalPopUpForm.firstName("Jaswinder");
        ProposalPopUpForm.lastName("Singh");
        ProposalPopUpForm.emailAddress( generateUniqueEmailWithTimestamp());
        ProposalPopUpForm.selectMonthlyBudget();
        ProposalPopUpForm.companyOrOrganization("Thrive");
        ProposalPopUpForm.phoneNumber("98765 56789");
        ProposalPopUpForm.sendProposal();
        ProposalPopUpForm.displayThankYouMessage();

    }

    public static String generateUniqueEmailWithTimestamp() {
        String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
        return "jaswinder.singh+" + timestamp + "@thriveagency.com";
    }
}
