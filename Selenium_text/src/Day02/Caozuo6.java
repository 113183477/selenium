package Day02;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Caozuo6 {
	
	
	@Test
	public void daying() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95%E6%89%80%E6%9C%89%E8%AF%BE%E7%A8%8B/selenium/index.html";
		driver.get(url);
		WebElement x=driver.findElement(By.className("wait"));
		x.click();
		x.click();
		/*等待
		* Thread.sleep(3000);线程等待
		* driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);全局等待
		* new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By));显示等待
		*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String y=driver.findElement(By.className("red")).getText();
		System.out.println(y);
	}

}
