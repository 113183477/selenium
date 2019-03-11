package Day03;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;




public class A2 {
	@Test
	public void opensdl() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///F:/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95/%E8%BD%AF%E4%BB%B6%E6%B5%8B%E8%AF%95%E6%89%80%E6%9C%89%E8%AF%BE%E7%A8%8B/selenium/index.html";
		driver.get(url);
		/*
		 * 键盘事件:
		 * 1.通过sendkeys实现
		 * */
		Actions kk=new Actions(driver);
		WebElement x=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
		List<WebElement> options=x.findElements(By.tagName("option"));
		Action ppp=kk.keyDown(Keys.CONTROL)
				.click(options.get(1))
				.click(options.get(2))
				.build();
		ppp.perform();
		
		WebElement m=driver.findElement(By.id("user"));
		Robot a=new Robot();
		a.keyPress(KeyEvent.VK_CONTROL);//点击ctrl
		a.keyPress(KeyEvent.VK_S);//点击s
		a.keyRelease(KeyEvent.VK_S);//释放s
		a.keyRelease(KeyEvent.VK_CONTROL);//释放ctrl
		Thread.sleep(2000);
		a.keyPress(KeyEvent.VK_ESCAPE);//点击esc
		
	    a.keyRelease(KeyEvent.VK_ESCAPE);//释放esc
	    Thread.sleep(2000);
		//a.keyRelease(KeyEvent.VK_ESCAPE);
	    a.keyPress(KeyEvent.VK_ALT);
	    a.keyPress(KeyEvent.VK_F4);
	    a.keyRelease(KeyEvent.VK_F4);
	    a.keyRelease(KeyEvent.VK_ALT);
	    
	   
		
	}

}
