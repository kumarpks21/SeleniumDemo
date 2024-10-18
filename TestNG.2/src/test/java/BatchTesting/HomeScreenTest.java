package BatchTesting;   // Declaring the package

import org.testng.annotations.Test;   // Importing TestNG's @Test annotation

public class HomeScreenTest {
    
    // Test to launch the application
    @Test
    public void LaunchApplication() {
        System.out.println("Application is launched successfully  .........");
    }

    // Test to verify the logo
    @Test
    public void VerifyLogo() {
        System.out.println("Logo is verified successfully ...........");
    }

    // Test to verify the title
    @Test
    public void VerifyTitle() {
        System.out.println("Title is verified successfully.............");
    }
}
