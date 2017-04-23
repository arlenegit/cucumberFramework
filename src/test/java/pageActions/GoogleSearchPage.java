package pageActions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by romil on 23/04/2017.
 */
public class GoogleSearchPage extends BasePageActions {

    public GoogleSearchPage(WebDriver d){
        super(d);
    }

    public void openGoogle(){
        driver.navigate().to("https://www.google.co.uk/");
    }

    public void searchText(String text){

        Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
                .withTimeout(5, SECONDS)
                .pollingEvery(1, SECONDS)
                .ignoring(NoSuchElementException.class);

        //wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("gs_htif0")));

        driver.findElement(By.id("gs_htif0")).sendKeys(text);
        driver.findElement(By.id("gs_htif0")).sendKeys(Keys.ENTER);

    }


}
