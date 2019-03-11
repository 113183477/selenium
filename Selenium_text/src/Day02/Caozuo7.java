package Day02;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;


public class Caozuo7 {
	@Test
	public void daying() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95%E6%89%80%E6%9C%89%E8%AF%BE%E7%A8%8B/selenium/index.html";
		driver.get(url);
		WebElement x= driver.findElement(By.id("user"));
		Actions y=new Actions(driver);
		//y.contextClick(x).perform();//performÖ´ÐÐ,ÓÒ»÷
		Thread.sleep(2000);
		y.contextClick().perform();//ÔÚ×óÉÏ½ÇÓÒ»÷
	}

}
