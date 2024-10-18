package Z_Test_Package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException, IOException {
		  // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "F:\\Aprilbatch\\Z_Test_Project\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");Thread.sleep(2000);
        
        WebDriverWait wait=new WebDriverWait(driver, 10);
      WebElement element=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-testid='open-registration-form-button']")));
//      WebElement element=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#u_0_0_RO")));
      element.click();
      Thread.sleep(1000);
      // First_Name and Last_Name
       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kumar");Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");Thread.sleep(1000);
       
       //Day of Birth
     WebElement e1=  driver.findElement(By.id("day"));
     Select dd1=new Select(e1);
     dd1.selectByValue("21");Thread.sleep(1000);
     
     //month of Birth
     WebElement e2=driver.findElement(By.id("month"));
     Select dd2=new Select(e2);
     dd2.selectByIndex(10);Thread.sleep(1000);
     
     //year of Birth
     WebElement e3=driver.findElement(By.id("year"));
     Select dd3=new Select(e3);
    dd3.selectByVisibleText("1994");Thread.sleep(1000);
    
    //Select sex of member
//    driver.findElement(By.xpath("//input[@value='2']")).click();
    Actions action=new Actions(driver);
    action.sendKeys(Keys.TAB).perform();Thread.sleep(1000);
    action.sendKeys(Keys.TAB).perform();Thread.sleep(1000);
    action.sendKeys(Keys.ARROW_RIGHT).perform();Thread.sleep(1000);
    
    //Enter mobile or email
    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("useforspotify1994@gmail.com");Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ABCD@gmail.com");Thread.sleep(1000);
    action.sendKeys(Keys.ENTER).build().perform();Thread.sleep(25000);
    
    
    //ScreenShot on login page
    TakesScreenshot sc=(TakesScreenshot)driver;
   File source= sc.getScreenshotAs(OutputType.FILE);
   File dest=new File("F:\\Aprilbatch\\Z_Test_Project\\ScreenShot\\FacebookPage\\login.png");
   FileUtils.copyFile(source, dest);
   
      //Logout the facebook
//   WebElement logout= driver.findElement(By.xpath("//i[@class='x1b0d499 xep6ejk']]"));
//   action.moveToElement(logout).click().build().perform();
    for(int i=1;i<=3;i++) {
       action.sendKeys(Keys.TAB).build().perform();Thread.sleep(2000);
    }
    action.sendKeys(Keys.ENTER).build().perform();
    for(int i=1;i<=3;i++) {
        action.sendKeys(Keys.TAB).build().perform();Thread.sleep(2000);
     }
     action.sendKeys(Keys.ENTER).build().perform();
     
     WebElement Final=  driver.findElement(By.xpath("//span[contains(text(),'Log out')]"));
//     WebElement Final=  driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'][@xpath='1']"));
     action.moveToElement(Final).click().build().perform();
//     for(int i=1;i<=1;i++) {
//         action.sendKeys(Keys.TAB).build().perform();Thread.sleep(2000);
//      }
//      action.sendKeys(Keys.ENTER).build().perform();
//        driver.quit();

	}

}
