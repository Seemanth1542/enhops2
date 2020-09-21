package enhops.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uiauto 
{
	WebDriver driver;
	@FindBy(xpath="//*[@id='login']")
	public WebElement id;
	@FindBy(xpath="//*[@id='password']")
	public WebElement psd;
	@FindBy(xpath="(//*[@class='mat-button-wrapper'])[3]")
	public WebElement clk;
	@FindBy(xpath="(//*[@class='mat-tab-label-content'])[3]")
	public WebElement dep;
	public Uiauto(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login(String x)
	{
		id.sendKeys(x);
	}
	public void password(String y)
	{
		psd.sendKeys(y);
	}
	public void signin()
	{
		clk.click();
	}
	public void selectDeparted()
	{
		dep.click();
	}

}
