package yemian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import fixation.loginURL;

public class tikupage extends loginURL {
	
	//跳转到左边框架
	public void tzzb() {
		driver.switchTo().frame("menu");
		
	}
	//点击题库管理
	public void tkgl() {
		driver.findElement(By.className("tmc_menu_qdb")).click();
	}
	//点击新增题库
	public void xztk() {
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
	}
	//先跳转到主页面，后跳转到右边框架
	public void zzzym() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		
	}
	//输入题库名称
	public void srtk(String name) {
		driver.findElement(By.name("d_name")).sendKeys(name);
	}
	//点击提交按钮
	public void djqd() {
		WebElement ok=driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]"));
		ok.click();
		driver.findElement(By.xpath("//*[@id=\"tm_lnk_back\"]")).click();
	}

}
