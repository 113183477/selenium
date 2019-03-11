package Day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Han4 {
	
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
			driver.findElement(By.xpath("/html/body/center[6]/table/tbody/tr/td/a")).click();
			driver.findElement(By.name("a_name")).sendKeys("admin");
			driver.findElement(By.name("a_pass")).sendKeys("admin");
			driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
			
		}
		@Test
		public void caozuo2() {
			//driver.switchTo().defaultContent();
			//System.out.println(driver.getTitle());
			/*添加一个商品主分类*/
			driver.switchTo().frame(0);
			driver.switchTo().frame("Left");
			WebElement k=driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td/span/a"));
			k.click();
			k.click();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("Rigth");
			//driver.switchTo().frame("Rigth");
			//k.click();
			//driver.findElement(By.xpath("/html/body/table/tbody/tr[13]/td/span/a")).click();
			driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[2]/input")).sendKeys("手机");
			driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();
		
		}

}
