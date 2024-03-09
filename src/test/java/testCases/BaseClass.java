package testCases;

import org.testng.annotations.AfterTest;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static WebDriver driver;
	public static Logger logger;
	public Properties p;
	public static TakesScreenshot takesScreenshot;
	
	
	@BeforeTest(groups= {"smoke Test one","regression Test One","smoke Test Two","regression Test Two","smoke Test Three","regression Test Three"})
	@Parameters({"os","browser"})
    public  void setup(String os,String br) throws IOException
	
	{
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		 p=new Properties();
		 p.load(file);
	
		logger=LogManager.getLogger(this.getClass());//Log4j
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
	 	{	
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		//os
		if(os.equalsIgnoreCase("windows"))
		{
			capabilities.setPlatform(Platform.WIN11);
		}
		else if(os.equalsIgnoreCase("mac"))
		{
			capabilities.setPlatform(Platform.MAC);
		}
		else
		{
			System.out.println("No matching os..");
			return;
		}
		
		//browser
		switch(br.toLowerCase())
		{
		case "chrome" : capabilities.setBrowserName("chrome");
		
		break;
		case "edge" : capabilities.setBrowserName("MicrosoftEdge");
		
		
		break;
		default: System.out.println("No matching browser.."); return;
		}
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		takesScreenshot = (TakesScreenshot) driver;
		
	    }
		else if(p.getProperty("execution_env").equalsIgnoreCase("local")) {
			if(br.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get("https://www.policybazaar.com/");
				}
				else if(br.equalsIgnoreCase("edge")) {
					driver = new EdgeDriver();
					driver.manage().deleteAllCookies();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.manage().window().maximize();
					driver.get("https://www.policybazaar.com/");
				}
			
			takesScreenshot = (TakesScreenshot) driver;
			
		}
		
		
//		driver=new ChromeDriver(); //break;
//	
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//		driver.get("https://www.policybazaar.com/");
//		driver.manage().window().maximize();
		
		
	}
	
	
	
	@AfterTest(groups= {"smoke Test one","regression Test One","smoke Test Two","regression Test Two","smoke Test Three","regression Test Three"})
	public void tearDown() {
	
		driver.close();
	}

}