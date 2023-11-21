package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
 driver.findElement(By.xpath("//a[text() = 'Computers ' ]")).click();
        String expectedText= "Computers";
 String actualText=driver.findElement(By.xpath("//a[text()='Computers ']")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        driver.findElement(By.linkText("Electronics")).click();
        String expectedText="Electronics";
        String actualText=driver.findElement(By.xpath("//a[text()='Electronics ']")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void  userShouldNavigateToApparelPageSuccessfully(){
        driver.findElement(By.linkText("Apparel")).click();
        String expectedText="Apparel";
        String actualText=driver.findElement(By.xpath("//a[text()='Apparel ']")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public  void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
       driver.findElement(By.linkText("Digital downloads"));
       String expectedText="Digital downloads";
       String actualText=driver.findElement(By.xpath("//a[text()='Digital downloads ']")).getText();
       Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.linkText("Books")).click();
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//a[text()='Books ']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public  void  userShouldNavigateToJewelryPageSuccessfully(){
        driver.findElement(By.linkText("Jewelry")).click();
        String expectedText="Jewelry";
        String actualText=driver.findElement(By.xpath("//a[text()='Jewelry ']")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void  userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.linkText("Gift Cards"));
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//a[text()='Gift Cards ']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }




}
