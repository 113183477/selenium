package fixation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class loginURL {
	public static WebDriver driver;
	public static String url;
	@BeforeClass 
	public void caozuo() throws InterruptedException, MalformedURLException {
		/*System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();*/
		url="http://localhost:8080/examsys/login.thtml";
		
		DesiredCapabilities a=DesiredCapabilities.chrome();
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.206.1:5555/wd/hub"),a);
		driver.get(url);
	}
	@AfterClass
	public void guanbi() {
		//driver.quit();
	}
}
