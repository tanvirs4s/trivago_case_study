package pageObject_trivago;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public static WebElement scrollDownWindowToContact(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/footer/div/div/div[2]/div/ul/li[2]/a"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",element);
        return null;
    }

    public static WebElement scrollDownWindowToInspireMe(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/section/div/div[11]/div/div"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",element);
        return null;
    }

    public static WebElement scrollUpWindowToInspiration(WebDriver driver)
    {
        element = driver.findElement(By.id("inspiration"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",element);
        return null;
    }

    public static WebElement checkCheckBoxForInspireMe(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("etn_conf_checkbox_de")));
        element = driver.findElement(By.id("etn_conf_checkbox_de"));
        return element;
    }
    public static WebElement emailForInspireMe(WebDriver driver)
    {
        element = driver.findElement(By.id("etn_email"));
        return element;
    }

    public static WebElement inspireMeButton(WebDriver driver)
    {
        element = driver.findElement(By.cssSelector(".etn__submit"));
        return element;
    }

    public static String confirmationMsgForInspire(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body/section/div/div[11]/div/div/div/div[1]/p")));
        WebElement confMessage = driver.findElement(By.xpath("html/body/section/div/div[11]/div/div/div/div[1]/p"));
        String confMessageTxt = confMessage.getText();
        return confMessageTxt;
    }

}
