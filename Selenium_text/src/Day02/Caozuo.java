package Day02;

import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Caozuo {
	@Test
	public void caozuo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="file:///E:/389863294/%E8%85%BE%E8%AE%AFQQ%E6%96%87%E4%BB%B6/index.html";
		driver.get(url);
		driver.findElement(By.id("user")).sendKeys("123");//WebElement类型
		WebElement s=driver.findElement(By.id("moreSelect"));
		Select s1=new Select(s);//将s1变成下拉框变量select类型
		s1.selectByIndex(3);//方法1,索引元素selectByIndex从0开始，选择第4个元素
		//Thread.sleep(6000);
		s1.selectByValue("huawei");//方法2,selectByValue，value查找
		//Thread.sleep(6000);
		s1.selectByVisibleText("xiaomi");//方法3,selectByVisibleText,可见值查找
		WebElement x=driver.findElement(By.className("Audi"));
		System.out.println(x.isSelected());
		x.click();
		System.out.println(x.isSelected());//x.isSelected验证单选框是否被选择
		WebElement x1=driver.findElement(By.name("checkbox1"));
		if(!x1.isSelected()) {
			x1.click();
			
		}
		WebElement x2=driver.findElement(By.name("checkbox2"));
		x2.click();
		
		WebElement buttons=driver.findElement(By.name("buttonhtml"));
		System.out.println(buttons.isEnabled());//buttons.isEnabled()检查按钮是否可用
		//assertTrue("false",buttons.isEnabled());以后再用
		WebElement y=driver.findElement(By.className("alert"));
		y.click();
		Alert alert=driver.switchTo().alert();//从浏览器跳转到alert()弹出框上面去//Alert适用于单个按
		alert.accept();//accept()确定
		
		/*WebElement k=driver.findElement(By.className("confirm"));
		k.click();
		Thread.sleep(6000);
		Alert con=driver.switchTo().alert();
		//con.accept();
		con.dismiss();//取消按钮
		Thread.sleep(6000);
		con.accept();*/
		
		/*WebElement pro=driver.findElement(By.className("promap"));
		pro.click();
		Alert pros=driver.switchTo().alert();
		//Thread.sleep(2000);
		pros.sendKeys("123");
		String a=pros.getText();
		System.out.println(a);
		Thread.sleep(2000);
		pros.accept();*/
		
		//driver.close();
		
	
		
		
		
	}

}
