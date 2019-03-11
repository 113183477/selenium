package yemian;

import fixation.loginURL;

public class basspage extends loginURL{
	//跳转到左边框架
		public void tzzb() {
			driver.switchTo().frame("menu");
		}
		//先跳转到主页面，后跳转到右边框架
		public void zzzym() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
		}
		

}
