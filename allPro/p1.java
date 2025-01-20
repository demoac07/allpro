package allPro;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

public class p1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://lms.nmit.ac.in/moodle/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("username")).sendKeys("27592");
		driver.findElement(By.name("password")).sendKeys("Darshan@18");
		driver.findElement(By.id("loginbtn")).submit();
		

	}

}