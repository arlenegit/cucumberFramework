package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by romil on 23/04/2017.
 */
public class GoogleSearchPage extends BasePageActions {


//    public GoogleSearchPage(WebDriver driver) {
//        super(driver);
//    }


    public void openGoogle(){
        driver.navigate().to("https://www.google.co.uk/");
    }

    public void searchText(String text){

    }
}
