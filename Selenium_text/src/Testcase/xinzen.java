package Testcase;

import org.testng.annotations.Test;

import yewu.xsyw;

public class xinzen {
	@Test
	public void xinzenxs() throws InterruptedException {
		logindl xxx=new logindl();
		xsyw vvv=new xsyw();
		xxx.login();
		Thread.sleep(6000);
		vvv.xsywss();
	}

}
