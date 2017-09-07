package pageObject_trivago;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Menu_Options
{
    private static WebElement element = null;

    public static WebElement inspirationByBudget(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[2]/li[2]/a"));
        return element;
    }

    public static WebElement inspirationByFamily(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[2]/li[4]/a"));
        return element;
    }

    public static WebElement inspirationBySummerTrends(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[2]/li[6]/a"));
        return element;
    }

    public static WebElement inspirationByCouples(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[2]/li[3]/a"));
        return element;
    }
    public static WebElement inspirationByWeekendGetaway(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[2]/li[5]/a"));
        return element;
    }
    public static WebElement inspirationByAllThemes(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[2]/li[7]/a"));
        return element;
    }

    public static WebElement destinationInUsa(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[1]/li[2]/a"));
        return element;
    }
    public static WebElement destinationInSouthEast(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[1]/li[4]/a"));
        return element;
    }
    public static WebElement destinationInMidWest(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[1]/li[6]/a"));
        return element;
    }

    public static WebElement destinationInNorthEast(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[1]/li[3]/a"));
        return element;
    }
    public static WebElement destinationInWest(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[1]/li[5]/a"));
        return element;
    }
    public static WebElement destinationInSouthWest(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/header/div[2]/nav/ul/ul[1]/li[7]/a"));
        return element;
    }

}
