package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Han2 {
	
	WebDriver driver;
	String url;
	@BeforeClass
	public void caozuo5() {
		/*´ò¿ªä¯ÀÀÆ÷*/
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		url="http://localhost:8080/shop1/index.jsp";
	}
	@AfterClass
	public void caozuo6() {
		driver.close();
		
	}
	
	
	@Test
	public void caozuo1(){
		/*µÇÂ¼*/
		driver.get(url);
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
	}
	@Test
	public void caozuo2(){	
		/*¹ºÂò*/
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[2]/table[2]/tbody/tr[1]/td[2]/p[3]/input")).click();
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td/form/table[2]/tbody/tr[1]/td/font/input[1]")).click();
		WebElement x=driver.findElement(By.name("pay_fangshi"));
		Select y=new Select(x);
		y.selectByIndex(2);
		driver.findElement(By.name("pay_address")).sendKeys("aaaaaa");
		driver.findElement(By.name("pay_email")).sendKeys("aaaaaa@qq.com");
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/table/tbody/tr[7]/td/input[1]")).click();
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[11]/td/table/tbody/tr[4]/td/input[1]")).click();
		
		//driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/table/tbody/tr[4]/td/span/a")).click();
	}
		

}
