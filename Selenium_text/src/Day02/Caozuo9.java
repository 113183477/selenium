package Day02;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Caozuo9 {
	@Test
	public void dayings() throws InterruptedException {
		int y;
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://www.baidu.com";
		driver.get(url); 
		WebElement x=driver.findElement(By.id("kw"));
		Actions kk=new Actions(driver);
		kk.contextClick(x).perform();
		Thread.sleep(3000);
		File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(jietu, new File("D:/test3.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		WebElement g=driver.findElement(By.name("tj_briicon"));
		Actions mm=new Actions(driver);
		mm.moveToElement(g).perform();
		driver.findElement(By.className("bdbriimgitem_1")).click();
		
		
		
	
	}

}
