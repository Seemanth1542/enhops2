package Run;

import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import enhops.com.Uiauto;
import io.cucumber.core.gherkin.Scenario;

public class StepDefination
{
WebDriver driver;
WebDriverWait wait;
Uiauto ui;
Properties pro;
Scenario s;
@Before
public void m1(Scenario s)
{
this.s=s;
pro=new Properties();
System.setProperty("webdriver.chrome.driver", pro.getProperty("cdriver"));
driver.get(pro.getProperty("url"));
driver.manage().window().maximize();
}
@Given("^enter the id as /(.*)/$")
public void m2(String x)
{
ui.login(x);
}
@And("^enter valid password as /(.*)/$")
public void m3(String y)
{
ui.password(y);
}
@Then("^ click on signin $")
public void m4()
{
	ui.signin();
}
@Then("^ click on departed $")
public void clickDep()
{
	ui.selectDeparted();
}
}