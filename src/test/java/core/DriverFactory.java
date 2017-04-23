package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by romil on 23/04/2017.
 */
public class DriverFactory {


    public static WebDriver getDriver(){
        return getChromeDriver();
        //getDriverFromConfiguration();
    }

    public static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/romil/IdeaProjects/cucumberFramework/src/test/resource/chromedriver");
        return new ChromeDriver();
    }

    public static WebDriver getFirefoxDriver(){

        return new FirefoxDriver();
    }
}
