package Day4;

import java.util.Set;


//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Zuoye02 {
	WebDriver driver;
	String url;
	@AfterClass
	public void guan() {
		
	}
	
	@BeforeClass
	public void tetup() {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		url="http://localhost:8080/Banksys_ssh/loginValidate.action";
	}
	
	//登录
	/*1.打开网址
	 * 2.输入用户名
	 * 3.输入密码
	 * 4.点击登陆
	 * 
	 */
	
	@Test
	@Parameters("data5")
	public void caozuo12(String data5){
		
		/*System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/Banksys_ssh/loginValidate.action";*/
		driver.get(url);
		driver.findElement(By.id("loginValidate_userNO")).sendKeys("1545631766597");
		driver.findElement(By.id("loginValidate_password")).sendKeys("123456");
		driver.findElement(By.id("loginValidate_0")).click();
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		driver.switchTo().defaultContent();	
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.id("fmoneyValidate_money")).sendKeys(data5);
		driver.findElement(By.id("fmoneyValidate_0")).click();
		String ksk=driver.findElement(By.xpath("/html/body/center")).getText();
		System.out.println(ksk);
		
	}
	

}
