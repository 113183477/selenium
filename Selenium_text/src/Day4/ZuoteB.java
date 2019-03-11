package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ZuoteB {
	public class ZuoyeA {
		WebDriver driver;
		String url;
		

		@AfterClass
		public void caozuo8() {
			driver.close();
			
		}
		@BeforeClass
		public void caozuo1() {
			/*登录*/
			System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
			driver=new ChromeDriver();
			url="http://localhost:8080/Exam_ssh/";
			driver.get(url);
		}
		@Test
		public void caozuo2() {
			/*进行第一次考试*/
			driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[1]")).click();
			driver.findElement(By.name("stuNumber")).sendKeys("201800003699");
			driver.findElement(By.name("stuName")).sendKeys("嬴政");
			driver.findElement(By.name("B1")).click();
			WebElement x=driver.findElement(By.name("examType"));
			Select xx=new Select(x);
			xx.selectByIndex(0);
			driver.findElement(By.name("start_b")).click();
			driver.findElement(By.name("questionOption")).click();
			//driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
			
		}
		
}
}
