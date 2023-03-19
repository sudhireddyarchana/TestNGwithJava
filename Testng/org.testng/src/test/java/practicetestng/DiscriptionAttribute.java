package practicetestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiscriptionAttribute
{
@Test(description="open browser")
public void method1()
{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver= new ChromeDriver();
	driver.close();
	
}
}
