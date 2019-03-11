package Day01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dengl {
	@Test
	public void register() {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/mobile_mysql/index.jsp";
		driver.get(url);
		driver.findElement(By.name("name")).sendKeys("sele");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.className("input1")).click();
		
		
		
	}

}
