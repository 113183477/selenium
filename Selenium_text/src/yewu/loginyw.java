package yewu;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import fixation.loginURL;
import yemian.loginpage;
import yemian.tikupage;

public class loginyw{
	
	public void loginb() throws InterruptedException {
		loginURL kkk=new loginURL();
		loginpage page=new loginpage();
		try {
			kkk.caozuo();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.setusername();
		page.setpassword();
		page.setlx();
		page.tiao();
		page.clickloin();
		/*
		tikupage tk=new tikupage();
		page.tiao();
		tk.tzzb();
		tk.tkgl();
		tk.xztk();
		tk.zzzym();
		tk.srtk();
		tk.djqd();*/
	}
	

}
