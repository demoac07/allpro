package allPro;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;
public class p10 {
	public static void main(String[] args) {
      //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
      WebDriver driver = new ChromeDriver();
      //open first URL
      driver.get("https://google.com/");
      System.out.println("Title of First Window: "+ driver.getTitle());
      String originalWindow = driver.getWindowHandle();
      
      //OPEN SECOND URL IN NEW WINDOW
      ((ChromeDriver) driver).executeScript("window.open('https://www.bing.com','_blank');");
       switchToNewWindow(driver);
       System.out.println("Title of Second Window: "+ driver.getTitle());
       
      //OPEN THIRD URL IN ANOTHER NEW WINDOW
       ((ChromeDriver) driver).executeScript("window.open('https://www.yahoo.com','_blank');");
        switchToNewWindow(driver);
        System.out.println("Title of Third Window: "+ driver.getTitle());
      
        //switch back to original window
      driver.switchTo().window(originalWindow);
      System.out.println(" Back to First Window: "+ driver.getTitle());
      
      driver.quit();
	}

	private static void switchToNewWindow(WebDriver driver) {
		// TODO Auto-generated method stub
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handle : windowHandles) {
			driver.switchTo().window(handle);
		}
	}
}
