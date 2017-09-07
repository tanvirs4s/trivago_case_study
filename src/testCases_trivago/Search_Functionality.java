package testCases_trivago;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject_trivago.Home_Page;
import pageObject_trivago.Search_Result;

public class Search_Functionality
{
    public WebDriver driver;


    @Test
    public void Search_By_Article_Title() throws Exception
    {
        String getSearchItem = Home_Page.getSearchItem(driver);
        Home_Page.searchButton(driver).click();
        Home_Page.searchField(driver).sendKeys(getSearchItem);
        Home_Page.searchField(driver).sendKeys(Keys.ENTER);
        String getSearchResultsText = Search_Result.getSearchResults(driver);
        Assert.assertEquals(getSearchResultsText,"1 SEARCH RESULT");
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