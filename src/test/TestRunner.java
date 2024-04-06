package worldline_assesment01.worldline_assesment01;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", 
    glue = "worldline_assesment01.worldline_assesment01", 
    plugin = {"pretty", "html:target/cucumber-reports"} 
)
public class TestRunner {

}
