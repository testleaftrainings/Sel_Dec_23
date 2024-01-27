package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features={"src/test/java/features"},
                  glue={"steps"},
                  monochrome=true,
                  publish=true,
                  tags="@Functional" )// executes only smoke scenarios
                  // tags = "not @Smoke")
                 // tags = "@Smoke or @Functional")
                  //tags="@Functional and @Regression")
public class CucumberRunner extends BaseClass{
	
}
