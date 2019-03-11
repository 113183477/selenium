package Day03;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import fixation.Afterclass;
//import fixation.Beforclass;

public class xinxi {
	@Test
	
	public void caozuo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://localhost:8080/examsys/login.thtml";
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys("hujianming");
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		WebElement x=driver.findElement(By.name("usertype"));
		Select y=new Select(x);
		y.selectByIndex(2);
		Thread.sleep(6000);
		WebElement k=driver.findElement(By.className("tm_btn"));
		k.click();
		
		Thread.sleep(6000);
		System.out.println(driver.getTitle());
		driver.switchTo().frame("main");
		WebElement kkk=driver.findElement(By.xpath("/html/body/div/div[1]/ul/li"));
		String xxx=kkk.getText();
		System.out.println(xxx);
		if("Ê×Ò³".equals(xxx)) {
			System.out.println(xxx+"µÇÂ¼³É¹¦");
		}
		else {
			System.out.println("µÇÂ¼Ê§°Ü");
		}
		
	}

}
