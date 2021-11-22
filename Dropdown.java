package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\sara\\Mani\\chrom\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement mail=driver.findElement(By.xpath("//input[@type='text']"));
	mail.sendKeys("manikandan");
	WebElement pass=driver.findElement(By.id("passContainer"));
	pass.sendKeys("hello");
	
}
}
