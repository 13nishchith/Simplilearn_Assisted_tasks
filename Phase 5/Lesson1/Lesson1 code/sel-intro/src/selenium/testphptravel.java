package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class testphptravel {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\browser drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Dell\\Desktop\\browser drivers\\edgedriver_win32\\msedgedriver.exe");
//		WebDriver driver1 = new EdgeDriver();
//		
		loginFlow(driver);
		
		Thread.sleep(100);
		
		testWalletBalance(driver);
//		
//		testWalletBalanceByCSSSelector(driver);
//		
//		testTotalBookingsIsAtleast500(driver);
		
//	driver.quit();
	}
	
	public static void loginFlow(WebDriver driver) throws InterruptedException {
		driver.get("https://www.phptravels.net");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(500);
		driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		driver.findElement(By.cssSelector("button[type='']")).click();
	}
	
	public static void testWalletBalance(WebDriver driver) {
		String walletText = driver.findElement(By.xpath("//div[contains(@class,'user_wallet')]/div/div/div[2]/h4")).getText();
		System.out.println(walletText);
		String walletCurrency = walletText.split(" ")[0];
		String walletAmount = walletText.split(" ")[1];
		Assert.assertEquals("USD", walletCurrency);
		Assert.assertEquals("1500", walletAmount);
	}
//	
//	public static void testWalletBalanceByCSSSelector(WebDriver driver) {
//		String walletText = driver.findElement(By.cssSelector("div[class*='user_wallet'] div div div h4")).getText();
//		System.out.println(walletText);
//		String walletCurrency = walletText.split(" ")[0];
//		String walletAmount = walletText.split(" ")[1];
//		Assert.assertEquals("USD", walletCurrency);
//		Assert.assertEquals("1500", walletAmount);
//	}
//	
//	public static void testTotalBookingsIsAtleast500(WebDriver driver) {
//		String totalBookings = driver.findElement(By.xpath("//div[contains(@class,'user_wallet')]/following-sibling::div[1]/div/div/div/h4")).getText();
//		System.out.println(totalBookings);		
//		Assert.assertTrue(Integer.parseInt(totalBookings) > 500, "Total Bookings less than 500");
//	}
	
	

}