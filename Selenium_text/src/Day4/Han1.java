package Day4;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Han1 {
	WebDriver driver;
	String url;
	@BeforeClass
	public void caozuo5() {
		/*打开浏览器*/
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		url="http://flight.qunar.com";
	}
	@AfterClass
	public void caozuo6() {
		//driver.close();
		
	}
	
	@Test
	public void caozuo1(){
		
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"searchTypeSng\"]")).click();
		//driver.findElement(By.name("fromCity")).sendKeys("北京");
		//WebElement k=driver.findElement(By.name("toCity"));
		//k.sendKeys("上海");
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd"); 
		//Calendar getInstance() 使用默认时区和语言环境这种方法获得一个日历。
		Calendar calendar = Calendar.getInstance();
		//在当前日期下+7天
		calendar.add(calendar.DATE, 7);
		//将时间结果获取到
		String date=df.format(calendar.getTime());
		System.out.println(date);
		WebElement x=driver.findElement(By.name("fromDate"));
		x.sendKeys(Keys.chord(Keys.CONTROL, "a"),date);
		WebElement y=driver.findElement(By.className("btn_search"));
		y.click();
		driver.findElement(By.className("btn_book js-wrlist-btn")).click();
		driver.switchTo().frame("Left");
		

        
	}
	
	

}
