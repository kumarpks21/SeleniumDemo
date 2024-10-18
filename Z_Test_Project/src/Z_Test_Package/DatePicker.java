package Z_Test_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
	
	String expectedDay="2";
	String expectedMonth="January";
	String expectedYear="2025";
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/datepicker/");
	 
	//Switch to iframe
	driver.switchTo().frame(0);
	
	WebElement element=driver.findElement(By.id("datepicker"));
	Actions action=new Actions(driver);
	action.moveToElement(element).click().perform();
	
	while(true) {
		String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if((month.equals(expectedMonth) && (year.equals(expectedYear)))){
		List <WebElement> daysList=	driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement e:daysList) {
			String day=e.getText();
			if(day.equals(expectedDay)) {
				e.click();
				break;
			}
		}
		break;
		}
		else {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();;
		}
	}

	}

}
