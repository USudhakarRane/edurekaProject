package utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserUitl {
	
	public static void quitDriver(RemoteWebDriver driver) {
		driver.quit();
	}
	
	public static RemoteWebDriver getDriver() {
		
		String browser=System.getProperty("browser");
		System.out.println("Browser value:="+browser);
		if(browser==null) {
			browser="firefox";
		}
		
		RemoteWebDriver driver;
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}


}
