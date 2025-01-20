package allPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class p10x {
    public static void main(String[] args) {
        // Set up WebDriver paths (only needed if WebDrivers are NOT in PATH)
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        // System.setProperty("webdriver.edge.driver", "path/to/msedgedriver");
        // System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Open URL in Chrome
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://google.com");
        System.out.println("Chrome - Page Title: " + chromeDriver.getTitle());
        chromeDriver.quit(); 

        
        WebDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://bing.com");
        System.out.println("Edge - Page Title: " + edgeDriver.getTitle());
        edgeDriver.quit(); 

        // Open URL in Firefox
        /*WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://yahoo.com");
        System.out.println("Firefox - Page Title: " + firefoxDriver.getTitle());
        firefoxDriver.quit(); // Close Firefox*/
    }
}