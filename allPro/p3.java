package allPro;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class p3 {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("NMIT");
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		searchButton.click();
		
		Thread.sleep(20000);
		WebElement firstResult = driver.findElement(By.xpath("(//h3)[1]"));
        firstResult.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		}
	}