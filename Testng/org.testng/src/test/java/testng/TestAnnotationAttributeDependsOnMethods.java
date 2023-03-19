package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAnnotationAttributeDependsOnMethods {
	@Test(priority=1)
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in");
		
	}
	@Test(priority=2,dependsOnMethods= {"openBrowser"})
	public void login()
	{
		System.out.println("do login");
	}

}
