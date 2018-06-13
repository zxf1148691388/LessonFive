package PageObject.LessonFive;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BrowerOpen {
	WebDriver driver;
	@DataProvider(name = "browser")
	public Object[][] data1(){
		return new Object[][] {
			{"chrome"},{"firefox"}
		};
	}
	
	@Test(dataProvider = "browser")
	public void TestDemo1(String BrowserName) throws InterruptedException{
		if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getenv("DRIVER_HOME")+"\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			driver = new FirefoxDriver();
		}
		driver.get("https://www.baidu.com");
		Thread.sleep(3000);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
