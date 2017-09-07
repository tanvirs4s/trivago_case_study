package pageObject_trivago;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page
{
    private static WebElement element = null;

    public static WebElement searchButton(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[1]/div/div[1]/span"));
        return element;
    }

    public static String getSearchItem(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/section/div/div[2]/div[1]/div/div[2]/a/h1"));
        String searchItem = element.getText();
        return searchItem;
    }

    public static WebElement searchField(WebDriver driver)
    {
        element = driver.findElement(By.id("ajax-search-input"));
        return element;
    }

    public static WebElement menuOption(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[1]/div/div[3]"));
        return element;
    }
    public static WebElement linkContactUs(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/footer/div/div/div[2]/div/ul/li[2]/a"));
        return element;
    }


}
