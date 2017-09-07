package pageObject_trivago;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contact_Page
{
    private static WebElement element = null;

    public static WebElement contactMessage(WebDriver driver)
    {
        element = driver.findElement(By.id("message"));
        return element;
    }
    public static WebElement contactFullName(WebDriver driver)
    {
        element = driver.findElement(By.id("full_name"));
        return element;
    }

    public static WebElement contactEmailAddress(WebDriver driver)
    {
        element = driver.findElement(By.id("email"));
        return element;
    }

    public static String messageContent()
    {
        String messageBody = "This is a test message content";
        return messageBody;
    }
    public static WebElement submitButton(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("contactform-submit")));
        element = driver.findElement(By.id("contactform-submit"));
        return element;
    }

    public static String confirmationMessage(WebDriver driver)
    {
        element = driver.findElement(By.xpath("html/body/section/div/div[2]/div/div/div"));
        String confirmationText = element.getText();
        return confirmationText;
    }

}
