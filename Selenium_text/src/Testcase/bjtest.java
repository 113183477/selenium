package Testcase;

import org.testng.annotations.Test;

import yewu.bjyw;

public class bjtest {
	@Test
	public void bjtests() throws InterruptedException {
		logindl xxxx=new logindl();
		bjyw yyyy=new bjyw();
		xxxx.login();
		Thread.sleep(6000);
		yyyy.bjywss();
	}

}
