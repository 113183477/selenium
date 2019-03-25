

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class baidu {
	WebDriver driver;
	String url;
	@BeforeClass
	public void caozuo5() {
		/*´ò¿ªä¯ÀÀÆ÷*/
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		url="https://baidu.com";
	}
	@AfterClass
	public void caozuo6() {
		//driver.close();
		
	}
	
	@Test
	public void caozuo1(){
		
		driver.get(url);
		driver.findElement(By.id("kw")).sendKeys("qq");
		driver.findElement(By.id("su")).click();
		
		
		
	
}}
