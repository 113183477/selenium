package Day02;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caozuo4 {
	@Test
	public void opensd() {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95%E6%89%80%E6%9C%89%E8%AF%BE%E7%A8%8B/selenium/index.html";
		driver.get(url);
		String qqq=driver.getWindowHandle();//获取当前页面句柄
		
		WebElement y=driver.findElement(By.linkText("Open new window"));
		y.click();
		y.click();
		Set<String>w=driver.getWindowHandles();
		for(String handle:w) {
			driver.switchTo().window(handle);
			String title=driver.getTitle();
			if("UIAutomation iFrame".equals(title)) {
				driver.findElement(By.id("user")).sendKeys("123");
			}
			
		}
		WebElement yy=driver.findElement(By.className("baidu"));
		yy.click();
		
		Set<String>k=driver.getWindowHandles();
		for(String handle:k) {
			driver.switchTo().window(handle);
			String pp=driver.getTitle();
			System.out.println(pp);
			if("百度一下，你就知道".equals(pp)) {
				driver.findElement(By.id("kw")).sendKeys("张秃驴");
			}
		}
		driver.switchTo().window(qqq);
		driver.findElement(By.id("user")).sendKeys("123");
	}

}
