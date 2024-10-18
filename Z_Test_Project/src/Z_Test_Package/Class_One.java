package Z_Test_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class_One {
    public static void main(String[] args) {
        // Set the path to the GeckoDriver executable
    	
        System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");

        // Initialize the FirefoxDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.facebook.com");
       driver.manage().window().maximize();
       System.out.println("Hello world");
    }
}
