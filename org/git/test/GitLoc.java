package org.git.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitLoc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN7i\\eclipse-workspace\\Git\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		searchbox.sendKeys("iphone6");
		
		Thread.sleep(2000);
		
		WebElement searchicon=driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		searchicon.click();
		
		WebElement clickicon=driver.findElement(By.xpath("//p[text()='Apple iPhone 6S Bumper Cases BIGZOOK - Rose Gold']"));
		clickicon.click();
		
		String par=driver.getWindowHandle();
		Set<String> All=driver.getWindowHandles();
		
		for(String x:All){
			if(!x.equals(par)) {
				
				driver.switchTo().window(x);
			}
		}
		
		WebElement addtocard=driver.findElement(By.xpath("//span[text()='add to cart']"));
		addtocard.click();
			}
			
		
		
		
		
		
		
		
		
	}


