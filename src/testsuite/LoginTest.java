package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
driver.findElement(By.linkText("Log in")).click();

        String expectedText = "Welcome,Please Sign In!";
        // Find the actual text element and get the text from element
             String actualText =   driver.findElement(By.xpath("//h1")).getText();

        //verify expected and actual text
        Assert.assertEquals(expectedText,actualText);

    }
        @Test
        public void userShouldLoginSuccessfullyWithValidCredentials(){


            WebElement LoginLink = driver.findElement(By.linkText("Log in"));
            LoginLink.click();

            WebElement emailField = driver.findElement(By.id("Email"));
            emailField.sendKeys( "Prime123@gmail.com");
            driver.findElement(By.name("Password")).sendKeys("Prime123");
            driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
            String expectedText="Log out";
            String actualText =driver.findElement(By.xpath("//a[text()='log out']")).getText();
Assert.assertEquals("log out",expectedText,actualText);

        }
        @Test
        public void verifyTheErrorMessage() {
            WebElement LoginLink = driver.findElement(By.linkText("Log in"));
            LoginLink.click();


            WebElement emailField = driver.findElement(By.id("Email"));
            emailField.sendKeys("Prime1234@gmail.com");
            driver.findElement(By.name("Password")).sendKeys("rutu4321");
            driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
            String expectedText = "Login was unsuccessful Please correct the errors and try again.\n" +
                    "No customer account found";
            String actualText = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

            Assert.assertEquals(expectedText, actualText);

        }
    @After
public void tearDown(){
    closeBrowser();
    }
}








