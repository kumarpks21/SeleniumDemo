package Z_Test_Package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Step 1: Convert WebDriver object to Interface
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		
		//Step 2: call getScreenshotAs() method to create image file
	    File scr=	screenshot.getScreenshotAs(OutputType.FILE);
	    
	    File dest=new File("F:\\Aprilbatch\\Z_Test_Project\\ScreenShot\\facebook_Home1.png");
	    
	    //Step 3: copy image file to destination
	    FileUtils.copyFile(scr, dest);
	        
	}

}
