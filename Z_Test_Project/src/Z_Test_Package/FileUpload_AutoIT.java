package Z_Test_Package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_AutoIT {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/upload");
	WebElement element=driver.findElement(By.xpath("//input[@id='file-upload']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(element).click().perform();
	
	try {
		Runtime.getRuntime().exec("C:\\Users\\PKS-ASUS\\Desktop\\AutoIT\\FileUpload.exe" + " " + "C:\\Users\\PKS-ASUS\\Desktop\\New folder (2)\\FORMS\\Photo_from_Prashant_Singh.jpg");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
