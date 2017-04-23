package cucumberTest;

/**
 * Created by romil on 23/04/2017.
 */
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/feature"
        ,glue={"stepDefinition"}
        , tags = {"@test"}
)

public class TestRunner {

}

