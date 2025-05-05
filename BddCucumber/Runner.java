package SD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 @RunWith(Cucumber.class)
 @CucumberOptions(features = "src\\test\\resources\\FF", glue = { "SD" },
 
		 monochrome= true,
		 plugin= {"pretty", "html:target/HTMLReports.html"}
		 
				// tags={"@smoke"}
 
       // plugin= {"pretty", "json:target/JSONReports.json"}
      // plugin= {"pretty", "junit:target/JUNITReports.xml"}
				
		 )

public class Runner {

}
