package allPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class p8 {
    public static void main(String[] args) {
    	//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        Runnable task1 = () -> {
            WebDriver driver = new ChromeDriver();
            driver.get("http://lms.nmit.ac.in/moodle/");
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("LMS Title: " + driver.getTitle());
            driver.quit();
        };

        Runnable task2 = () -> {
            WebDriver driver = new ChromeDriver();
            driver.get("https://github.com/");
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("Github Title: " + driver.getTitle());
            driver.quit();
        };

        // Running tasks in parallel
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}
