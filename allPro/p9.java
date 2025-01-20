package allPro;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class p9 {
	    public static void main(String[] args) {
	    	//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        
	        try {
	         
	            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            
	         
	            WebElement alertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
	            alertButton.click();
	            
	            
	            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	            alert.accept();
	            
	        
	            WebElement resultText = driver.findElement(By.id("result"));
	            if (resultText.getText().equals("You successfully clicked an alert")) {
	                System.out.println("Simple alert handled successfully");
	            } else {
	                System.out.println("Simple alert handling failed");
	            }
	        
	            WebElement confirmButton = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
	            confirmButton.click();
	            
	           
	            alert = wait.until(ExpectedConditions.alertIsPresent());
	            alert.dismiss();
	            
	          
	            WebElement resultText1 = driver.findElement(By.id("result"));
	            if (resultText1.getText().equals("You clicked: Cancel")) {
	                System.out.println("Confirmation alert handled successfully");
	            } else {
	                System.out.println("Confirmation alert handling failed");
	            }
	            
	           
	            WebElement promptButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
	            promptButton.click();
	            
	            alert = wait.until(ExpectedConditions.alertIsPresent());
	            alert.sendKeys("Hello, Selenium!");
	            alert.accept();
	            
	          
	            WebElement resultText2 = driver.findElement(By.id("result"));
	            if (resultText2.getText().equals("You entered: Hello, Selenium!")) {
	                System.out.println("Prompt alert handled successfully");
	            } else {
	                System.out.println("Prompt alert handling failed");
	            }
	        } catch (Exception e) {
	            
	            e.printStackTrace();
	        } finally {
	            
	            driver.quit();
	        }
	    }
	}