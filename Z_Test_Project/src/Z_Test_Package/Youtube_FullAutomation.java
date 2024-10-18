package Z_Test_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Youtube_FullAutomation {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");Thread.sleep(2000);
	
//	//Click on sign-in button
//    WebElement element=driver.findElement(By.xpath("//a[@aria-label='Sign in']"));
    Actions action=new Actions(driver);
//    action.moveToElement(element).click().build().perform();Thread.sleep(2000);
//    
//    driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("9350697216");
//    driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();Thread.sleep(2000);
//    
//    //navigate to home page
//    driver.navigate().back();driver.navigate().back();Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kaun disha mein leke chala re batohiya");Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
    
    //Page scroll
    Thread.sleep(5000);
    JavascriptExecutor js = (JavascriptExecutor) driver;
//    js.executeScript("window.scrollBy(0, 5000)");
    WebElement e1=driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']"));
    action.moveToElement(e1).click().build().perform(); Thread.sleep(1000);
    
   WebDriverWait wait =new WebDriverWait(driver, 10);
 WebElement e2=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Subscribe to Bollywood Classics.']")));
//	js.executeScript("argument[0].scrollIntoView()", e2);
 Thread.sleep(1000);
	action.moveToElement(e2).click().build().perform();
    
    

	}

}
