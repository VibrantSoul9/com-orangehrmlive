import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHrm {
    static String baseUrl =  "https://opensource-demo.orangehrmlive.com/";
    public static void main(String[] args) throws InterruptedException {

        //1. set up chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        //2. open URL
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is : " + title );

        //4, Print the current url
        System.out.println(driver.getCurrentUrl());

        //5. Print the page source

        System.out.println(driver.getPageSource());
        Thread.sleep(2000);

        // 6. Click on Forgot your password link

        WebElement forgotpassword = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgotpassword.click();
        Thread.sleep(2000);

        //7. Print the current url
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

        // 8. Navigate back to the login page
        driver.navigate().back();

        // 9. Refresh the page
        driver.navigate().refresh();

        // 10. Enter the email into email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");
        Thread.sleep(3000);


        // 11. Enter the password into password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        Thread.sleep(3000);

        //12. Click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(3000);

        // 13. Close the browser
        driver.quit();

    }
}
