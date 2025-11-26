package TestCases;
import Config.BaseClass;
import Config.CommonMethods;
import GravityForms.JoinNowBlogForm;
import org.testng.annotations.Test;


public class BlogFormTestCase extends BaseClass
{
    @Test(priority = 1)
    public void RunBlogForm() throws InterruptedException
    {
        JoinNowBlogForm.URL();
        JoinNowBlogForm.emailAddress(generateUniqueEmailWithTimestamp());
        JoinNowBlogForm.subscribeButton();
        JoinNowBlogForm.displayThankYouMessage();
    }

    @Test(priority = 2)
    public void ValidateBlogForm() throws InterruptedException {
        JoinNowBlogForm.URL();
        JoinNowBlogForm.subscribeButton();
        JoinNowBlogForm.displayValidation();
        JoinNowBlogForm.emailAddress(generateUniqueEmailWithTimestamp());
        JoinNowBlogForm.subscribeButton();
        JoinNowBlogForm.displayThankYouMessage();
    }

    public static String generateUniqueEmailWithTimestamp() {
            String timestamp = CommonMethods.getTimestamp_hh_mm_ss();
            return "jaswinder.singh+" + timestamp + "@thriveagency.com";
        }
}
