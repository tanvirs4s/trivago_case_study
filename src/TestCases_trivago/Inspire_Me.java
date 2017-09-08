package TestCases_trivago;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject_trivago.*;
import automation_helper.*;

public class Inspire_Me
{
    public WebDriver driver;

    @Test
    public void Get_Inspiration_Update() throws Exception
    {
        String emailForInspire = Helper.generateAutomaticEmail();
        Home_Page.scrollDownWindowToInspireMe(driver);
        Home_Page.checkCheckBoxForInspireMe(driver).click();
        Home_Page.emailForInspireMe(driver).sendKeys(emailForInspire);
        Home_Page.inspireMeButton(driver).click();
        Home_Page.scrollUpWindowToInspiration(driver);
        String getConformationForInspire = Home_Page.confirmationMsgForInspire(driver);
        Assert.assertEquals(getConformationForInspire,"You are now checked-in!");
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