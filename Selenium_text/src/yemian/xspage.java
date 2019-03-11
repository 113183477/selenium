package yemian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import fixation.loginURL;

public class xspage extends loginURL{
	public void xsgl() {
		basspage pagess=new basspage();
		pagess.tzzb();
		driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[1]/a")).click();
		pagess.zzzym();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
		driver.findElement(By.name("u_username")).sendKeys("a123456");
		driver.findElement(By.name("u_userpass")).sendKeys("123456");
		WebElement xxx=driver.findElement(By.name("u_branchid"));
		Select yyy=new Select(xxx);
		yyy.selectByIndex(4);
		WebElement ppp=driver.findElement(By.name("u_positionid"));
		Select mmm=new Select(ppp);
		mmm.selectByIndex(2);
		driver.findElement(By.name("u_realname")).sendKeys("¿Ì¬€");
		driver.findElement(By.name("u_score")).sendKeys("100");
		driver.findElement(By.xpath("//*[@id=\"form_user_add\"]/table/tfoot/tr/td/button[1]")).click();
		
	}

}
