package Day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Caozuo2 {
	@Test
	public void caozuo() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///C:/Users/%E5%BD%AD%E4%BA%AE/Desktop/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95%E6%89%80%E6%9C%89%E8%AF%BE%E7%A8%8B/selenium/autotest.html";
		driver.get(url);
		WebElement a=driver.findElement(By.id("accountID"));
		a.sendKeys("xxx");
		driver.findElement(By.id("passwordID")).sendKeys("123456");
		WebElement b=driver.findElement(By.id("areaID"));
		Select b1=new Select(b);
		b1.selectByIndex(2);
		WebElement k=driver.findElement(By.id("sexID2"));
		k.click();
		driver.findElement(By.id("u2")).click();
		driver.findElement(By.id("u3")).click();
		driver.findElement(By.id("u4")).click();
		String wen="C:\\Users\\ÅíÁÁ\\Desktop\\òþÉßµÄìø×Ú.txt";
		WebElement p=driver.findElement(By.name("file"));
		p.sendKeys(wen);
		driver.findElement(By.className("u16")).click();
		Alert con=driver.switchTo().alert();
		con.accept();
	}

}
