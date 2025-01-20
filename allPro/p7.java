package allPro;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class p7 {
	public static void main(String[] args) throws Exception{
		//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
			        WebDriver driver=new ChromeDriver();
			        try { 
			        	
			        	driver.get("https://the-internet.herokuapp.com/upload");
			        	Thread.sleep(2000);
			        	driver.manage().window().maximize();
			        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			        	WebElement fileInput =driver.findElement(By.id("file-upload"));
			        	fileInput.sendKeys("C:\\Users\\shiva\\Desktop\\demo.pdf");
			        	Thread.sleep(3000);
			        	WebElement uploadButton =driver.findElement(By.id("file-submit"));
			        	uploadButton.click();
			        	WebElement successMessage = driver.findElement(By.id("uploaded-files"));
			        	if(successMessage.getText().equals("DATA_PREPROCESSING.pdf")) {
			        		System.out.println("file upload failed");
			        	}else {
			        		System.out.println("file upload successful.");
			        	}
			        }
			        finally {
			        	driver.quit();
			        }
			}
	}
