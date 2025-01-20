package allPro;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions; 
import java.time.Duration;

public class p4 {

  public static void main(String[] args) {
      // Initialize the WebDriver (Chrome)
	  //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
      WebDriver driver = new ChromeDriver();
      
      try {
          // Navigate to the form page
          driver.get("https://www.jotform.com/build/242983020566458?s=templates2");
          
          // Fill in text fields
          driver.findElement(By.id("first_4")).sendKeys("shivadarshan");
          driver.findElement(By.id("middle_4")).sendKeys(".");
          driver.findElement(By.id("last_4")).sendKeys("M");
          
          Thread.sleep(3000);
          
          // Select checkboxes
          driver.findElement(By.id("label_input_10_0")).click();
          driver.findElement(By.id("label_input_10_1")).click();
          driver.findElement(By.id("label_input_10_2")).click();
          driver.findElement(By.id("label_input_10_3")).click();
          driver.findElement(By.id("label_input_11_0")).click();
          
          Thread.sleep(3000);
          
          // Wait for the page to update and click on the next checkboxes
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          wait.until(ExpectedConditions.elementToBeClickable(By.id("label_input_11_1"))).click();
          wait.until(ExpectedConditions.elementToBeClickable(By.id("label_input_11_2"))).click();
          
          Thread.sleep(3000);
          
          // Selecting values from drop-down menus (radio buttons or select options)
          WebElement genderSelect = driver.findElement(By.id("input_3"));
          Select gender = new Select(genderSelect);
          gender.selectByValue("Male");  // Assuming "Male" is a valid value
          
          Thread.sleep(3000);
          
          // Fill in additional fields
          driver.findElement(By.id("input_6")).sendKeys("dhananjaynr10@gmail.com");
          driver.findElement(By.id("input_5")).sendKeys("27626");
          
          
          Thread.sleep(3000);
          
          // Select a course from the drop-down menu
          WebElement courseSelect = driver.findElement(By.id("input_7"));
          Select course = new Select(courseSelect);
          course.selectByValue("Math 101");  // Assuming "Math 101" is a valid value
          Thread.sleep(3000);
          
          // Submit the form
          driver.findElement(By.id("input_9")).submit();
          
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
          // Close the browser at the end of the test
          driver.quit();
      }
  }
}
