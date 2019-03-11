package Day01;



import org.junit.Test;
import org.openqa.selenium.Dimension;//设置浏览器大小
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openliu {
	@Test
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\tools\\chromedriver.exe");
		WebDriver driver=(WebDriver) new ChromeDriver();
		String url="https://baidu.com";
		String url1="https://taobao.com";
		driver.get(url);//打开网址方法1
		driver.navigate().to(url1);//打开网址方法2
		Thread.sleep(6000);//暂停6秒
		driver.navigate().back();//浏览器后退一步
		String a=driver.getTitle();
		System.out.println(a);
		driver.navigate().forward();//浏览器前进一步
		String b=driver.getTitle();//获取当前页面的标题
		System.out.println(b);//打印标题
		driver.navigate().refresh();//刷新浏览器
		driver.manage().window().maximize();//浏览器最大化
		Dimension dimension=new Dimension(600,600);//设置浏览器代销
		driver.manage().window().setSize(dimension);
		String urls=driver.getCurrentUrl();
		System.out.println(urls);
		driver.close();
		
	}
	

}
