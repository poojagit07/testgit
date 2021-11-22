package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Printalloptions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\sara\\Mani\\chrom\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("http://demo.automationtesting.in/Register.html");
     driver.manage().window().maximize();
     WebElement skill = driver.findElement(By.id("Skills"));
     Select select=new Select(skill);
     List<WebElement> options = select.getOptions();
     
}
}