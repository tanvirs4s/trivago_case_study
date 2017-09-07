package testCases_trivago;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject_trivago.*;

public class View_Destination_Category
{
    public WebDriver driver;

    @Test(priority = 0, enabled = true)
    public void View_Destination_In_USA() throws Exception
    {
        Home_Page.menuOption(driver).click();
        Menu_Options.destinationInUsa(driver).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("articleheader")));
        WebElement element = driver.findElement(By.id("articleheader"));
        String headerTitle= element.getText();
        Assert.assertEquals(headerTitle,"USA");
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"http://room5.trivago.com/destination/usa/");
    }
    @Test(priority = 1, enabled = false)
    public void View_Destination_In_Southeast() throws Exception
    {
        Home_Page.menuOption(driver).click();
        Menu_Options.destinationInSouthEast(driver).click();
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("articleheader")));
        WebElement element = driver.findElement(By.id("articleheader"));
        String headerTitle= element.getText();
        Assert.assertEquals(headerTitle,"USA / SOUTHEAST");
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"http://room5.trivago.com/destination/usa/country/southeast/");
    }


    @BeforeMethod
    public void setUp() throws Exception
    {
        driver = new FirefoxDriver();
        driver.get("http://room5.trivago.com/");

    }

    @AfterMethod
    public void tearDown() throws Exception
    {
        driver.quit();
    }

}