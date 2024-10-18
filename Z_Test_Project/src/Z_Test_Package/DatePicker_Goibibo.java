package Z_Test_Package;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker_Goibibo {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
	
	String expectedDay="21";
	String expectedMonthYear="November 2024";
	
	String expectedDay1="21";
	String expectedMonthYear1="January 2025";
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.goibibo.com/");Thread.sleep(3000);
	
	WebElement element=driver.findElement(By.xpath("//span[@role='presentation']"));
	Actions action=new Actions(driver);
	action.moveToElement(element).click().perform();Thread.sleep(3000);
	
	driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();Thread.sleep(2000);   // alert close
	
	driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("New Delhi"); Thread.sleep(2000);   // From 
	action.sendKeys(Keys.ENTER).build().perform();
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Varanasi"); Thread.sleep(2000);   // To
	action.sendKeys(Keys.ENTER).build().perform();
	
	driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();Thread.sleep(2000);  // date pop-up open
	
	while(true) {
	String MonthYear=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
	if(MonthYear.equals(expectedMonthYear)) {
//	List <WebElement> element1=	driver.findElements(By.xpath("//p[@class='fsw__date']"));
	
//		for(WebElement e:element1) {
//			String Day=e.getText();
//			if(Day.equals(expectedDay)) {
//				e.click();
//				break;
//			}
//		}
//		break;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@class='fsw__date'][normalize-space()='"+expectedDay+"']")).click();  
		break;// Second method
	}
	else {
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();Thread.sleep(1000);
	}
	}
	WebElement el=driver.findElement(By.xpath("//p[@class='sc-12foipm-9 hInlKv']"));   //// Return date choose
	action.moveToElement(el).doubleClick().build().perform();
	
	while(true) {
		String MonthYear1=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
		if(MonthYear1.equals(expectedMonthYear1)) {
//		List <WebElement> element3=	driver.findElements(By.xpath("//p[@class='fsw__date']"));
		
//			for(WebElement e1:element3) {
//				String Day=e1.getText();
//				if(Day.equals(expectedDay1)) {
//					e.click();
//					break;
//				}
//			}
//			break;
			Thread.sleep(1000);
			driver.findElement(By.xpath("//p[@class='fsw__date'][normalize-space()='"+expectedDay1+"']")).click();  
			break;// Second method
		}
		else {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();Thread.sleep(1000);
		}
		}
	driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow fswDownArrowTraveller']")).click();Thread.sleep(1000);
	WebElement el1=driver.findElement(By.xpath("//li[normalize-space()='first class']"));
	action.moveToElement(el1).click().build().perform();Thread.sleep(2000);
	
	driver.findElement(By.linkText("Done")).click(); Thread.sleep(1000);
	
	driver.findElement(By.xpath("//span[@class='sc-12foipm-72 ezNmSh']")).click();
	}

}
