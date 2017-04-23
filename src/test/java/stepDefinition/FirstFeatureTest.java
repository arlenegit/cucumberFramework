package stepDefinition;

import core.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageActions.GoogleResultsPage;
import pageActions.GoogleSearchPage;

/**
 * Created by romil on 23/04/2017.
 */
public class FirstFeatureTest {

    private WebDriver _driver;
    private GoogleSearchPage _googleSearchPage;
    private GoogleResultsPage _googleResultsPage;

    public FirstFeatureTest(){
        _driver=DriverFactory.getDriver();
        _googleSearchPage = new GoogleSearchPage(_driver);
        _googleResultsPage = new GoogleResultsPage(_driver);


    }

    @Given("^I open Google search page$")
    public void i_open_Google_search_page() throws Throwable {
        _googleSearchPage.openGoogle();
    }

    @When("^I search for cucumber$")
    public void i_search_for_cucumber() throws Throwable {
        _googleSearchPage.searchText("cucumber");
    }

    @Then("^I should see some results$")
    public void i_should_see_some_results() throws Throwable {
        _googleResultsPage.countResults();
    }
}
