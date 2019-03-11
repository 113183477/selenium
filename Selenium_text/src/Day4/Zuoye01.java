package Day4;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Zuoye01 {
	WebDriver driver;
	String url;
	

	
	@BeforeClass
	public void caozuo2() throws MalformedURLException {
		/*System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();*/
		DesiredCapabilities a=DesiredCapabilities.chrome();
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.206.1:6666/wd/hub"),a);
		url="http://localhost:8080/Banksys_ssh/loginValidate.action";
	}
	@AfterClass
	public void caozuo3() {
		
	}
	@Test
	public void login() {
		driver.get(url);
		driver.findElement(By.id("loginValidate_userNO")).sendKeys("1545631766597");
		driver.findElement(By.id("loginValidate_password")).sendKeys("123456");
		driver.findElement(By.id("loginValidate_0")).click();
	}
	@Test(dependsOnMethods= {"login"})
	@Parameters("data1")
	public void caozuo4(String data1) {
		driver.switchTo().frame("leftFrame");
		WebElement x=driver.findElement(By.xpath("/html/body/p[2]/a/img"));
		x.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.xpath("//*[@id=\"smoneyValidate_money\"]")).sendKeys(data1);
		driver.findElement(By.id("smoneyValidate_0")).click();
		String kkk=driver.findElement(By.xpath("/html/body/center")).getText();
		System.out.println(kkk);
		
	}
	@Test(dependsOnMethods= {"caozuo4"})
	public void caozuo1(){
		driver.switchTo().defaultContent();
		driver.switchTo().frame("leftFrame");
		WebElement xx=driver.findElement(By.xpath("/html/body/p[4]/a/img"));
		xx.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		String ppp=driver.findElement(By.xpath("/html/body/center")).getText();
		System.out.println(ppp);		
			
		/*driver.switchTo().frame("leftFrame");
		WebElement x=driver.findElement(By.xpath("/html/body/p[2]/a/img"));
		x.click();
		driver.switchTo().frame("mainFrame");
		String titles=driver.getTitle();
		System.out.println(titles);
		driver.findElement(By.id("smoneyValidate_money")).sendKeys("100");*/
		
		
	
		
			
		
						
		}
	}


