package Day4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Junit01 {
	@DataProvider(name="datas")
	public Object[][] data(){
		return new Object[][] {
			{"20","40"},{"40","60"},{"70","80"}
		};
	}
	@Test(dataProvider="datas")
	public void add(String data2,String data3) throws InterruptedException {
		int a=Integer.decode(data2);
		int b=Integer.decode(data3);
		Thread.sleep(3000);
		System.out.println(data2+"+"+data3+"="+(a+b));
		
	}
	@Test(dataProvider="datas")
	public void sub(String a,String b) {
		int x=Integer.decode(a);
		int y=Integer.decode(b);
		
		System.out.println(a+"-"+b+"="+(x-y));
		
	}
	@Test(dataProvider="datas")
	public void ride(String a,String b) {
		int x=Integer.decode(a);
		int y=Integer.decode(b);
		System.out.println(a+"*"+b+"="+(x*y));
		
	}
	@Test(dataProvider="datas")
	public void divide(String a,String b) {
		int x=Integer.decode(a);
		int y=Integer.decode(b);
		System.out.println(a+"/"+b+"="+(x/y));
	}
	
	
	/*@Before
	public void cc() {
		System.out.println("µÇÂ¼");
	}
	@Test
	public void aa() {
		System.out.println("¹ºÂòÁ÷³Ì");
	}
	@Test
	public void bb() {
		System.out.println("¹Ø±Õä¯ÀÀÆ÷");
	}
	@After
	public void dd() {
		System.out.println("ÕâÊÇ@After");
	}
	@BeforeClass
	public static void ee() {
		System.out.println("´ò¿ªä¯ÀÀÆ÷Êä³öÍøÕ¾");
	}*/

}
