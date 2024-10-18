package Z_Test_Package;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://export.ebay.com/in/");
		
		FluentWait <WebDriver> wait=new FluentWait <WebDriver>(driver).withTimeout(10,TimeUnit.SECONDS)
				.pollingEvery(2,TimeUnit.SECONDS).withMessage("Hello everyone").ignoring(NoSuchElementException.class);
		
	WebElement element=	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
	element.click();

	}

}