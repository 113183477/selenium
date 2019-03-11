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

public class Caozuo8 {
	@Test
	public void dayings() throws InterruptedException {
		int y;
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95%E6%89%80%E6%9C%89%E8%AF%BE%E7%A8%8B/selenium/index.html";
		driver.get(url); 
		/*WebElement x=driver.findElement(By.className("wait"));
		Actions aa=new Actions(driver);
		for(y=0;y<10;y++) {
			aa.doubleClick(x).perform();//Ë«»÷
		}*/
		WebElement k=driver.findElement(By.className("over"));
		Actions aa=new Actions(driver);
		aa.moveToElement(k).perform();
		aa.moveToElement(k).perform();
		String pp=driver.findElement(By.id("over")).getText();
		System.out.println(pp);
		
		
	}
}
