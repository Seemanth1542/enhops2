package Run;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@CucumberOptions(feature= {"E:\\Zest IOT workspace 2\\Enhops123\\src\\test\\resources\\Resource\\testcase.feature"},glue{}monochrome=true)
@RunWith(Cucumber.class)
public class Runner
{
}
