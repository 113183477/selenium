package Day03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A1 {
	@Test
	public void openkkkl() {
		
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95%E6%89%80%E6%9C%89%E8%AF%BE%E7%A8%8B/selenium/dragAndDrop.html";
		driver.get(url);
		WebElement xx=driver.findElement(By.id("drag"));
		//Actions aa=new Actions(driver);
		//aa.doubleClick(xx).perform();
		WebElement yy=driver.findElement(By.xpath("/html/body/h1"));
		Actions kkk=new Actions(driver);
		//kkk.clickAndHold(xx).moveToElement(yy).release(xx).perform();
		//(new Actions(driver)).dragAndDrop(xx,yy).perform();
		kkk.dragAndDropBy(xx,-200,-30).perform();//将xx拖动到指定的坐标位置
	}

}
