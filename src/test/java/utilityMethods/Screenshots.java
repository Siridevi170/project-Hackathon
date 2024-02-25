package utilityMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	
	public static void ErrorMessage(WebDriver driver) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File homeSRC = ts.getScreenshotAs(OutputType.FILE);
		File homePageLOC = new File(System.getProperty("user.dir") + "//ScreenShots//ErrorMessage.png");
		try {

			FileUtils.copyFile(homeSRC, homePageLOC);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
	
