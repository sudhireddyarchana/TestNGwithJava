package practicetestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeOutAttribute
{
@Test(description="open browser",timeOut=100000)
public void method2()
{
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver= new ChromeDriver();
	driver.get("https://www.gmail.com");
	driver.close();
}
}
