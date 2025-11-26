package TestCases;
import Config.BaseClass;
import Config.BaseDeviceTest;
import Config.BaseTest;
import Config.CommonMethods;
import GravityForms.JoinNowBlogForm;
import GravityForms.LambdaBlogForm;
import org.testng.annotations.Test;


public class LambdaBlogFormTestCase extends BaseDeviceTest
{
    @Test(priority = 1)
    public void LambdaRunBlogForm() throws InterruptedException
    {
        LambdaBlogForm.URL();
        LambdaBlogForm.emailAddress(generateUniqueEmailWithTimestamp());
        LambdaBlogForm.subscribeButton();
        LambdaBlogForm.displayThankYouMessage();
    }

  //  @Test(priority = 2)
    public void ValidateBlogForm() throws InterruptedException {
        LambdaBlogForm.URL();
        LambdaBlogForm.subscribeButton();
        LambdaBlogForm.displayValidation();
        LambdaBlogForm.emailAddress(generateUniqueEmailWithTimestamp());
        LambdaBlogForm.subscribeButton();
        LambdaBlogForm.displayThankYouMessage();
    }

    public static String generateUniqueEmailWithTimestamp() {
            String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
            return "jaswinder.singh+" + timestamp + "@thriveagency.com";
        }
}
