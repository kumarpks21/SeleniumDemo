package Z_Test_Package;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame("moneyiframe");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     // implicit wait
		String nseindex=driver.findElement(By.xpath("//span[@id='nseindex']")).getText();
		System.out.println(nseindex);
		driver.switchTo().defaultContent();
//		WebDriverWait wait=new WebDriverWait(driver,10);   // Explicit wait
//		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='mailicon']")));
//		element.click();
		
		driver.findElement(By.className("mailicon")).click();

		driver.quit();
	}

}
