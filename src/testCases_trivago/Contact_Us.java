package testCases_trivago;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject_trivago.Contact_Page;
import pageObject_trivago.Home_Page;
import automation_helper.Helper;
import static org.testng.Assert.*;

public class Contact_Us
{
    public WebDriver driver;

    @Test
    public void Send_Message() throws Exception
    {
        String fullName,emailAddress,message;
        fullName = Helper.generateFullNeme();
        emailAddress = Helper.generateAutomaticEmail();
        message = Contact_Page.messageContent();
        Helper.scrollDownWindowToContact(driver);
        Home_Page.linkContactUs(driver).click();
        Contact_Page.contactMessage(driver).sendKeys(message);
        Contact_Page.contactFullName(driver).sendKeys(fullName);
        Contact_Page.contactEmailAddress(driver).sendKeys(emailAddress);
        Helper.scrollDownWindowToContact(driver);
        Contact_Page.submitButton(driver).click();
        String confirmationText = Contact_Page.confirmationMessage(driver);
        Assert.assertEquals(confirmationText,"Message Sent Successfully!");
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