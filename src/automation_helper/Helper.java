package automation_helper;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class Helper
{
    private static WebElement element = null;
    public static int getResponseCode(String urlString) throws MalformedURLException, IOException
    {
        URL u = new URL(urlString);
        HttpURLConnection huc = (HttpURLConnection) u.openConnection();
        huc.setRequestMethod("GET");
        huc.connect();
        return huc.getResponseCode();
    }

    public static String generateAutomaticEmail()
    {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String email = "tanvir.ahmed3016+"+ randomInt +"@gmail.com";
        return email;
    }
    public static String generateFullNeme()
    {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String email = "Tanvir"+ randomInt + "Ahmed";
        return email;
    }

}
