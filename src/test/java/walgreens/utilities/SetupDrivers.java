package walgreens.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	public static WebDriver driver;							//initializing driver
	
	public static void setupDriver(){
//		System.setProperty("webdriver.chrome.driver", "C:\\UpSkillSoftware\\chromeDriver\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();			//getting the chrome driver from cloud	
		ChromeOptions options = new ChromeOptions();		//initializing chrome options
		options.addArguments("--start-maximized");			//add argument to maximize browser
		options.addArguments("--disable-notifications");	//add argument to diable notifications

//		options.addArguments("--headless");	
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.setExperimentalOption("useAutomationExtension", false);//headless execution

//		options.addArguments("--headless");					//headless execution
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.setExperimentalOption("useAutomationExtension", false);

		driver = new ChromeDriver(options);					//initializing chrome driver
		driver.get("https://www.walgreens.com");				//loading the page
	}
	
	public static WebDriver getDriver(){
		return driver;										//return driver to call
	}
	
	public static void tearDownDriver(){
		driver.close();										//closing current driver
		driver.quit();										//closing all driver
	}
}