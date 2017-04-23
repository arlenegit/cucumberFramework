package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by romil on 23/04/2017.
 */
public class GoogleResultsPage extends BasePageActions {

public GoogleResultsPage(WebDriver d){
    super(d);
}

    public int countResults(){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(5, SECONDS)
                .pollingEvery(1, SECONDS)
                .ignoring(NoSuchElementException.class);

        //wait until the div that contains results is present, puppee pupee
        WebElement foo = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='res']")));
        //withTimeoutOf(5, SECONDS).waitForPresenceOf(By.cssSelector("#elements option"));
        List<WebElement> allResults;
        // now the results are present, read them and do puppee
        allResults = driver.findElements(By.xpath(".//*[@id='rso']/div/div/div/div/div/h3/a"));

        for(WebElement e : allResults) {
            System.out.println(e.getText());
        }

        return allResults.size();
    }
}
