package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\browser drivers\\chromedriver_win32\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\Desktop\\browser drivers\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		
		
//		driver.get("http://localhost:4200/");
		
		driver1.get("http://simplilearn.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
//		 To quit the browser
//		driver.quit();
	}

}
