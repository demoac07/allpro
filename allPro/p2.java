package allPro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class p2 {
    public static void main(String[] args) throws Exception {
    	//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://www.facebook.com/");
        
        
        driver.findElement(By.name("email")).sendKeys("invalid_email@example.com");
        driver.findElement(By.name("pass")).sendKeys("incorrect_password");
        
        
        driver.findElement(By.name("login")).click();
        System.out.println("Error message displayed: " + "The email or mobile number you entered isn’t connected to an account.");
        WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'The email or mobile number you entered isn’t connected to an account.')]"));
  
        
        if (errorMessage.isDisplayed()) {
            System.out.println("Error message displayed: " + errorMessage.getText());
        } else {
            System.out.println("Error message not displayed.");
        }
        
       
        driver.quit();
    }
}

