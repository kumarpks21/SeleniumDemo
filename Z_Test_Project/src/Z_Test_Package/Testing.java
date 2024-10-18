package Z_Test_Package;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");

        String expectedDay = "21";
        String expectedMonthYear = "November 2024";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.goibibo.com/");
        
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            // Open the date picker
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@role='presentation']")));
            element.click();

            // Close any alert
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']"))).click();

            // Enter From city
            driver.findElement(By.xpath("//div[@class='sc-12foipm-22 kGtxGm']")).click();
            WebElement fromInput = driver.findElement(By.xpath("//input[@type='text']"));
            fromInput.sendKeys("New Delhi");
            fromInput.sendKeys(Keys.ENTER);

            // Enter To city
            fromInput = driver.findElement(By.xpath("//input[@type='text']"));
            fromInput.sendKeys("Varanasi");
            fromInput.sendKeys(Keys.ENTER);

            // Open date picker
            driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();

            // Date selection loop
            while (true) {
                String monthYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
                if (monthYear.equals(expectedMonthYear)) {
                    List<WebElement> days = driver.findElements(By.xpath("//p[@class='fsw__date']"));
                    for (WebElement day : days) {
                        if (day.getText().equals(expectedDay)) {
                            day.click();
                            break;
                        }
                    }
                    break; // Break out of the while loop once the date is selected
                } else {
                    driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit(); // Ensure driver quits after execution
        }
    }
}
