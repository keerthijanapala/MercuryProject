package mercurystepdefinations;


import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@CucumberOptions(
		features= {"src//test//resources//mercuryFeatures"} ,
		glue= {"mercurystepdefinations"} ,
		monochrome=true 
		//dryRun=true
		)

@RunWith(Cucumber.class)
public class mercuryRunner {

}

