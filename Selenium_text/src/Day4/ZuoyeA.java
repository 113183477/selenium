package Day4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ZuoyeA {
	WebDriver driver;
	String urls;
	

	@AfterClass
	public void caozuo8() {
		
	}
	@BeforeClass
	public void caozuo1() throws MalformedURLException {
		//打开浏览器
		/*System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();*/
		DesiredCapabilities a=DesiredCapabilities.chrome();
		driver=new RemoteWebDriver(new URL("http://192.168.1.147:2222/wd/hub"),a);
		urls="http://localhost:8080/Exam_ssh/";
	}

	@Test
	public void caozuo2() {
		//添加考试类型
		driver.get(urls);
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[2]")).click();
		driver.findElement(By.id("name")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();
		driver.findElement(By.id("testName")).sendKeys("物理");
		driver.findElement(By.id("testTime")).sendKeys("2018/12/30");
		driver.findElement(By.className("Sborder")).click();
		
	}
	@Test
	public void caozuo3() {
		//添加试题
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[3]")).click();
		//driver.findElement(By.id("title")).sendKeys("物理");
		driver.findElement(By.id("title")).sendKeys("第三");
		driver.findElement(By.id("choices")).sendKeys("1:");
		driver.findElement(By.id("standardAnswer")).sendKeys("1:2:2:3");
		driver.findElement(By.className("Sborder")).click();
		
		
	}
	@Test
	public void caozuo4() {
		//浏览试卷
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[2]")).click();
		String xxx=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[3]/div")).getText();
		System.out.println(xxx);
	}
	@Test
	public void caozuo5() {
		//添加学生
		
		
		//driver.switchTo().frame("");
		//driver.switchTo().defaultContent();
		
		//driver.switchTo().frame("left");
		driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[2]")).click();
		driver.findElement(By.id("id")).sendKeys("362522200010243622");
		driver.findElement(By.id("realname")).sendKeys("嬴政");
		driver.findElement(By.id("stuNumber")).sendKeys("201800003699");
		driver.findElement(By.id("className")).sendKeys("c");
		driver.findElement(By.id("address")).sendKeys("南昌");
		driver.findElement(By.id("phone")).sendKeys("18936981234");
		driver.findElement(By.id("email")).sendKeys("123456789@qq.com");
		driver.findElement(By.id("humanId")).sendKeys("居民身份证");
		driver.findElement(By.name("submit")).click();
		
}
	@Test
	public void caozuo6() {
		//浏览全部学生并打印
		driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[1]")).click();
		String yyy=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table")).getText();
		System.out.println(yyy);
	}

	

}
