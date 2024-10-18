package Z_Test_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Window_Tab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("FIrst TAB : " +driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);

	}

}

