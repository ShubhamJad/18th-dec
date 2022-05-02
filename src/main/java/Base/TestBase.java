package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

	 public static WebDriver driver;
     public static Properties p;
   
    
	public  void initalization() throws IOException  {
		ChromeOptions a = new ChromeOptions();
		a.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\eclipse-workspace\\Framework\\chromedriver.exe");
	    driver = new ChromeDriver(a);
	    p=new Properties();
	    FileInputStream fs=new FileInputStream("C:\\Users\\Shubham\\eclipse-workspace\\Framework\\Credential\\Cr1.properties");
	    p.load(fs);
	    driver.get(p.getProperty("URL"));
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	}
}