package allPro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class p6 {
  public static void main(String[] args) {
      //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
      WebDriver driver = new ChromeDriver();

      try {
          // Navigate to Facebook's login page
          driver.get("https://www.facebook.com/");
          
          // Maximize the browser window
          driver.manage().window().maximize();
          
          // Initialize WebDriverWait with Duration
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          
          // Locate the email field using a stable attribute or dynamic XPath
          WebElement emailField = wait.until(ExpectedConditions.presenceOfElementLocated(
              By.xpath("//input[@name='email']"))); // Dynamic element based on name attribute
          emailField.sendKeys("your-email@example.com");
          
          // Locate the password field using another stable identifier
          WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(
              By.xpath("//input[@name='pass']"))); // XPath for dynamic password field
          passwordField.sendKeys("your-password");

          // Locate and click the Login button
          WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(
              By.xpath("//button[@name='login']"))); // XPath for the login button
          loginButton.click();

          // Additional validation or further steps can be added here

      } catch (Exception e) {
          System.out.println("Error: " + e.getMessage());
      } 
      driver.quit();
         
  }
  
}