package yemian;

import org.openqa.selenium.By;

import fixation.loginURL;

public class bjpage extends loginURL{
	public void xsgl() {
		basspage pagess=new basspage();
		pagess.tzzb();
		driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();
		pagess.zzzym();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
		driver.findElement(By.name("b_name")).sendKeys("170307");
		driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"tm_lnk_back\"]")).click();
	}

}
