package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import atu.testrecorder.ATUTestRecorder;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Vediorecording
{
public static void main(String[] args) throws Exception
{
	ATUTestRecorder rec= new ATUTestRecorder("recording",false);
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver= new ChromeDriver();
	rec.start();
	driver.get("https://www.google.co.in");
	driver.close();
	rec.stop();
}
}
