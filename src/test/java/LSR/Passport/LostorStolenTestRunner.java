package LSR.Passport;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		snippets = SnippetType.CAMELCASE,
		features = "src/test/java/resources/LostPassport.feature",
		glue = "LSR.Passport",
				format = { "html:target/cucumber-html-report","json:target/GUIChecksTests.json"}

		)

public class LostorStolenTestRunner {



}