package Day01;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Register {
	@Test
	public void registers() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/mobile_mysql/index.jsp";
		driver.get(url);
		
		driver.findElement(By.name("name")).sendKeys("kkkkk");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.className("input1")).click();
		String url2="http://localhost:8080/mobile_mysql/goodsAction.do?action=16&id=4";
		driver.get(url2);
		driver.findElement(By.name("Submit")).click();
		Alert con=driver.switchTo().alert();
		con.accept();
		driver.navigate().back();
		//Thread.sleep(2000);
		driver.navigate().back();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("购物车")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("去收银台结账")).click();
		driver.findElement(By.name("address")).sendKeys("南昌");
		driver.findElement(By.name("tel")).sendKeys("10086");
		WebElement x1=driver.findElement(By.name("setMoney"));
		Select x=new Select(x1);
		x.selectByIndex(1);
		WebElement y1=driver.findElement(By.name("post"));
		Select y=new Select(y1);
		y.selectByIndex(2);
		driver.findElement(By.name("Submit2")).click();
		Alert con1=driver.switchTo().alert();
		con1.accept();
		con1.accept();	
	}
}
