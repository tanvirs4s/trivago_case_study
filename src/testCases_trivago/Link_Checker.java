package testCases_trivago;

import org.openqa.selenium.*;
import java.util.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation_helper.Helper;


public class Link_Checker
{
    public WebDriver driver;
    static int statusCode;

    @Test
    public void Check_For_Broken_Link() throws Exception
    {
        WebElement allLink = driver.findElement(By.xpath("html/body"));
        List<WebElement> total_links = allLink.findElements(By.tagName("a"));
        System.out.println("The Total number of link found: " + total_links.size());
        for (int i=1;i< total_links.size();i++)
        {
            String url = total_links.get(i).getAttribute("href");
            statusCode = Helper.getResponseCode(url);
            if (statusCode==200)
                System.out.println("URL:" +url+ " => Not Broken.");
            else
                System.out.println("URL:" +url+ " => Broken.");
        }
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