package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //Enter username
        //driver.findElement(By.name("Username")).sendKeys("Admin");
        // Verify the text ‘Reset Password
        String expectedDisplay = "Reset Password";
        String actualDisplay = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
        Assert.assertEquals(expectedDisplay, actualDisplay);
    }

    @After
    public void ternDown() {
        closeBrowser();
    }

}


