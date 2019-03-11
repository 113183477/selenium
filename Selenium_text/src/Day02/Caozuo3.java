package Day02;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Caozuo3 {
	@Test
	public void open() {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95%E6%89%80%E6%9C%89%E8%AF%BE%E7%A8%8B/selenium/index.html";
		driver.get(url);
		/*
		 * 切换到小页面的两种方式：
		 * 1.属性的方式
		 * driver.switchTo().frame("id或者name属性");
		 * driver.findElement(By.id("id"));
		 * 2.索引的方式
		 * driver.switchTo().frame(0);
		 * driver.findElement(By.id("user")).sendKeys("信息");
		 * 
		 * 
		 * 
		 * 
		 */
		//driver.switchTo().frame("aa");
		driver.switchTo().frame(0);
		driver.findElement(By.id("user")).sendKeys("信息");
		/*跳回到主页面
		 * 两种方法:
		 * 跳回到父类页面
		 * 主页面--iframe--iframe
		 * 1.driver.switchTo().parentFrame();逐级跳回
		 * 2.driver.switchTo().defaultContent();直接跳回到父类页面
		 * */
		driver.switchTo().parentFrame();
		driver.findElement(By.id("user")).sendKeys("信息");
		
		
		
	}

}
