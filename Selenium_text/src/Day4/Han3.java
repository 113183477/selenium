package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Han3 {
	WebDriver driver;
	String url;
	@BeforeClass
	public void caozuo5() {
		/*打开浏览器*/
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		url="http://localhost:8080/shop1/index.jsp";
	}
	@AfterClass
	public void caozuo6() {
		//driver.close();
		
	}
	
	
	@Test
	public void caozuo1(){
		/*登录*/
		driver.get(url);
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
	}
	@Test
	public void caozuo2(){
		/*进入意见反馈*/
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/table/tbody/tr[4]/td/span/a")).click();
		
	}
	@Test
	public void caozuo3() {
		/*发表意见*/
		driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[5]/td[2]/textarea")).sendKeys("什么垃圾东西");
		driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]")).click();
	}

}
