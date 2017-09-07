package pageObject_trivago;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Search_Result
{
    private static WebElement element = null;


    public static String getSearchResults(WebDriver driver)
    {

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".suggested-post-title.center.uppercase")));
        element = driver.findElement(By.cssSelector(".suggested-post-title.center.uppercase"));
        String getSearchResultsText = element.getText();
        return getSearchResultsText;
    }

    public static WebElement clickSearchResults(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".suggested-post-title.center.uppercase")));
        element = driver.findElement(By.cssSelector(".suggested-post-title.center.uppercase"));
        return element;
    }

}
