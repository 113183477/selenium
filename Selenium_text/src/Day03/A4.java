package Day03;






import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class A4 {
	@Test
	public void opensd() throws IOException {
		FileHandler.createDir(new File("D:\\date1"));
		FileHandler.createDir(new File("D:\\date2"));
		//FileHandler.copy(new File("D:\\date2"),new File("D:\\date1"));
		//FileHandler.copy(new File("D:\\date2"),new File("D:\\date1"),".php");
		FileHandler.copy(new File("D:\\date2\\m2.php"),new File("D:\\date1\\m2.php"),"m2.php");
		FileHandler.delete(new File("D:\\date1"));
		String file=FileHandler.readAsString(new File("D:\\date2\\新建文本文档.txt"));
		System.out.println(file);
	}
}
