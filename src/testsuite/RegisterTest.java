package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrl="https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openBrowser(baseUrl);

    }
@Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
     driver.findElement(By.linkText("Register")).click();

    String expectedText ="Register";
   String actualText= driver.findElement(By.xpath("//h1[contains(text(),'Register')]")).getText();
    Assert.assertEquals(expectedText,actualText);

}
@Test
    public void userShouldToRegisterPageSuccessfully() {
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("gender")).click();
    driver.findElement(By.id("FirstName")).sendKeys("Abcd");
    driver.findElement(By.id("LastName")).sendKeys("Xyz");
    driver.findElement(By.xpath("//select[@name = 'DateOfBirthDay']")).sendKeys("1");
    driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']")).sendKeys("January");
    driver.findElement(By.xpath("//select[@name = 'DateOfBirthYear']")).sendKeys("1989");
    driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com"); //
    driver.findElement(By.id("Password")).sendKeys("Prime123");
    driver.findElement(By.id("ConfirmPassword")).sendKeys("Prime123");
    driver.findElement(By.xpath("//button[@name = 'register-button']")).click();

    String actualMessage = driver.findElement(By.xpath("//div[@class = 'result']")).getText();
    String expectedMessage = "Your registration completed";

    Assert.assertEquals(expectedMessage, actualMessage);
}

       @After
    public void testDown(){
        closeBrowser();
       }
    }







