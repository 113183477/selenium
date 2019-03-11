package Day4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Han5 {
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
		//driver.close();
		
	}
	
	
	@Test
	public void caozuo1(){
		/*µÇÂ¼*/
		driver.get(url);
		driver.findElement(By.xpath("/html/body/center[6]/table/tbody/tr/td/a")).click();
		driver.findElement(By.name("a_name")).sendKeys("admin");
		driver.findElement(By.name("a_pass")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
		
		
	}
	@Test
	public void caozuo2() {
		/*É¾³ý¶©µ¥*/
		driver.switchTo().frame(0);
		driver.switchTo().frame("Left");
		WebElement kkk=driver.findElement(By.xpath("/html/body/table/tbody/tr[9]/td/span/a"));
		kkk.click();
		kkk.click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("Rigth");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[6]/span/a")).click();
		
	}
	

}
