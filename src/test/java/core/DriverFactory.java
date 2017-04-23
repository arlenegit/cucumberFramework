package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by romil on 23/04/2017.
 */
public class DriverFactory {


    public static WebDriver getDriver(){
        return getFirefoxDriver();
        //getDriverFromConfiguration();
    }

    private static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resource/chromedriver.exe");
        return new ChromeDriver();
    }

    private static WebDriver getFirefoxDriver(){
        return new FirefoxDriver();
    }
}
