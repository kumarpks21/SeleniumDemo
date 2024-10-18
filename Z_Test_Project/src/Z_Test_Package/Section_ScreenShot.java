package Z_Test_Package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section_ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.xpath("//button[@name='login']"));
		File src= element.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Aprilbatch\\Z_Test_Project\\ScreenShot\\form_page.png");
		FileUtils.copyFile(src, dest);

	}

}
