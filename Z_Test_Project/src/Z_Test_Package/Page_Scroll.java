package Z_Test_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_Scroll {
Page_Scroll() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/");Thread.sleep(2000);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	
	Thread.sleep(2000);
	driver.close();
}

Page_Scroll(int a) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.get("https://www.calculator.net/"); Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver1,10);
	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sales Tax Calculator")));
//	WebElement element=driver1.findElement(By.linkText("Sales Tax Calculator"));
	JavascriptExecutor js1=(JavascriptExecutor)driver1;
	js1.executeScript("arguments[0].scrollIntoView();", element);Thread.sleep(2000);
	driver1.close();
	
}
public static void main(String [] args) throws InterruptedException {
	Page_Scroll sc=new Page_Scroll();
	Page_Scroll sc1=new Page_Scroll(10);
    BottomScroll sc2=new BottomScroll();
    sc2.scroll();
	
}
}
 class BottomScroll{
	 void scroll() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.calculator.net/"); Thread.sleep(3000);
		JavascriptExecutor js2=(JavascriptExecutor)d;
		js2.executeScript("window.scrollTo(0,document.body.scrollHeight)");Thread.sleep(2000);
		d.close();
	}
}
