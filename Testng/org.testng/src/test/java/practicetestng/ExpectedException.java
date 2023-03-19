package practicetestng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpectedException 
{
@Test(description="open browser",timeOut=1000,expectedExceptions={Exception.class})
public void method3()
{
WebDriverManager.chromedriver().setup();
RemoteWebDriver driver= new ChromeDriver();
driver.get("https://www.gmail.com");
driver.close();
}
}
