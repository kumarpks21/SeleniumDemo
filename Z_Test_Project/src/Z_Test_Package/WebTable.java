package Z_Test_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor; // Correct import

public class WebTable {

    public static void main(String[] args) {
        
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Cast the driver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        // Optionally, wait to observe the scroll effect
        try {
            Thread.sleep(2000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the driver
        driver.quit();
    }
}
