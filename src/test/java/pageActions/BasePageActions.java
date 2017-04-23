package pageActions;

import core.DriverFactory;
import org.openqa.selenium.WebDriver;

/**
 * Created by romil on 23/04/2017.
 */
public class BasePageActions {
    protected WebDriver driver;



    BasePageActions(){
        driver = DriverFactory.getDriver();
    }

    BasePageActions(WebDriver d){
        this.driver = d;
    }
}
