package enhops.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://avileap.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).sendKeys("anantgmr@zestiot.io");
		
		driver.findElement(By.id("password")).sendKeys("zestiot@123");
		
		
		
		
		
		
		

	}

}
