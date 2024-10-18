package Z_Test_Package;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nested_Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/nested-iframes-example/");
		Thread.sleep(20000);
		
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kumarsani981111@gmail.com");
		
//		FluentWait <WebDriver> Wait1 =new FluentWait <WebDriver> (driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class);
		
//		WebElement element1=Wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("close")));
//		element1.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;   // scroll the page
		js.executeScript("window.scrollBy(0,300)");
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.findElement(By.cssSelector("button.close[aria-label='Close']")).click();
		
		//driver.switchTo().alert().dismiss();
		
		driver.switchTo().frame("parent_iframe");   // parent frame
		driver.switchTo().frame("iframe1");            // child frame
		Thread.sleep(2000);
		driver.findElement(By.id("u_5_6")).click();
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("u_5_5")).click();Thread.sleep(2000);
		
		driver.switchTo().defaultContent();  // return to main page out of frame
		
		Actions action=new Actions(driver);
		for(int i=0;i<=15;i++) {
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		}
		WebDriverWait wait=new WebDriverWait(driver,10); 
		WebElement element=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Selenium WebDriver with Java")));
		element.click();
		
		driver.close();

	}

}
