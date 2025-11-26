package ZoomClips;

import Config.BaseClass;
import Helpers.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ZoomClips extends BaseClass {
    By signIn = By.xpath("(//a[contains(text(),'Sign In')])[1]");
    By email = By.xpath("//input[@type='email']");
    By password = By.xpath("//input[@type='password']");
    By signInButton = By.xpath("//button[@type='button']//span[contains(text(),'Sign In')]");
    By clips = By.xpath("//ul[@id='personal-nav-list']/li/a[contains(text(),'Clips')]");
    By myPlaylist = By.xpath("//div[@role='tablist']//div[@id='tab-PlayList']");
    By secondPlaylist = By.xpath(("//div[@class='list-item-container']//div[@class='play-list-item']//h5[contains(text(),'02-11-2025')]"));
    By singleVideoSharedots = By.xpath("//button[contains(@class,'action-more')]");
    By singleVideoShareButton = By.xpath("(//div[@class='clip-dropdown-menu-item']//span[contains(text(),'Share')])[2]");
    By inputText = By.xpath("(//input[@type='text'])[5]");
    By share = By.xpath("//button[contains(@class,'share')]//span[contains(text(),'Share')]");
    By closeIcon = By.xpath(("(//button[contains(@class,'close-icon')]//i[@class='zm-icon-close'])[4]"));

    @Test
    public void launchZoomClips() throws InterruptedException {
        driver.get("https://www.zoom.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        System.out.println("Test started");
        CommonMethods.wait(5000);
        wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
        CommonMethods.wait(2000);
        System.out.println("Sign in clicked");
        wait.until(ExpectedConditions.elementToBeClickable(email)).sendKeys("demandgendev@thriveagency.com");
        CommonMethods.wait(2000);
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys("GcJ@nn&yS2m51k39");
        CommonMethods.wait(2000);
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
        CommonMethods.wait(3000);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='zm-loading-spinner']/*[local-name()='svg']")));
        CommonMethods.wait(2000);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(clips));
            actions.moveToElement(driver.findElement(clips)).click().perform();
        } catch (Exception ex) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(clips));
            actions.moveToElement(driver.findElement(clips)).click().perform();
        }
        CommonMethods.wait(2000);
        wait.until(ExpectedConditions.elementToBeClickable(myPlaylist)).click();
        CommonMethods.wait(2000);
        wait.until(ExpectedConditions.elementToBeClickable(secondPlaylist)).click();
        CommonMethods.wait(2000);
        singleVideoShareButtons();
    }

    public void singleVideoShareButtons() {
        CommonMethods.wait(2000);
        List<WebElement> moreButtons = driver.findElements(singleVideoSharedots);
        for (int i = 1; i <= moreButtons.size(); i++) {
            String videoMenuIcon = "(//button[contains(@class,'action-more')])" + "[" + i + "]";
            driver.findElement(By.xpath(videoMenuIcon)).click();
            CommonMethods.wait(1000);
            wait.until(ExpectedConditions.elementToBeClickable(singleVideoShareButton)).click();
            CommonMethods.wait(2000);
            String[] nameOfPeopleToShare = {"Kritika Dhillon", "Ikbal Singh"};
            for (int j = 0; j < nameOfPeopleToShare.length; j++) {
                int count = 0;
                CommonMethods.wait(1000);
                List<WebElement> nameList = driver.findElements(By.xpath("//div[@class='email-select-container']//div[@class='email-select-item']//span[@class='email-text-content']"));
                for (WebElement names : nameList) {
                    count++;
                    if (names.getText().contains(nameOfPeopleToShare[j])) {
                        String deleteIcon = "(//div[@class='email-select-container']//div[@class='email-select-item'])[" + count + "]//button[contains(@class,'remove-checked-email')]";
                        driver.findElement(By.xpath(deleteIcon)).click();
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[contains(@class,'icon-success')]")));
                        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//i[contains(@class,'icon-success')]")));
                    }
                }
            }
            String[] emailOfPeopleToShare = {"kritika@thriveagency.com", "ikbal@thriveagency.com"};
            for (int z = 0; z < emailOfPeopleToShare.length; z++) {
                wait.until(ExpectedConditions.elementToBeClickable(inputText)).sendKeys(emailOfPeopleToShare[z]);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='zm-loading-spinner']")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='zm-loading-spinner']")));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='email-warp']/span[2]"))).click();
                CommonMethods.wait(2000);
                wait.until(ExpectedConditions.elementToBeClickable(share)).click();
                wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[contains(@class,'icon-success')]")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//i[contains(@class,'icon-success')]")));
            }
            wait.until(ExpectedConditions.elementToBeClickable(closeIcon)).click();
            CommonMethods.wait(2000);
        }
    }
}

