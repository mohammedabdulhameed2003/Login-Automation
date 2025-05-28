import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Open Chrome
        WebDriver driver = new ChromeDriver();

        // Open the login page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // === Test 1: Positive Login ===

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        if (driver.getCurrentUrl().contains("logged-in-successfully")) {
            System.out.println("✅ Test 1 Passed: Login successful!");
        } else {
            System.out.println("❌ Test 1 Failed");
        }

        Thread.sleep(5000);
        driver.quit();

        // === Test 2: Negative Username ===


        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys("wrongUser");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        WebElement error1 = driver.findElement(By.id("error"));
        if (error1.isDisplayed() && error1.getText().equals("Your username is invalid!")) {
            System.out.println("✅ Test 2 Passed: Wrong username handled!");
        } else {
            System.out.println("❌ Test 2 Failed");
        }

        driver.quit();

        // === Test 3: Negative Password ===


        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("wrongPass");
        driver.findElement(By.id("submit")).click();

        WebElement error2 = driver.findElement(By.id("error"));
        if (error2.isDisplayed() && error2.getText().equals("Your password is invalid!")) {
            System.out.println("✅ Test 3 Passed: Wrong password handled!");
        } else {
            System.out.println("❌ Test 3 Failed");
        }

        driver.quit();
    }
}
