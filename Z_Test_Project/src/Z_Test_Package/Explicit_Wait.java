package Z_Test_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://export.ebay.com/in/");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        // Wait until the button is visible and clickable
        WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
        
        // Click on the button
        acceptButton.click();

        // Optionally, close the driver
        driver.quit();
    }
}
