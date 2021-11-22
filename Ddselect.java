package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ddselect {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\sara\\Mani\\chrom\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("http://demo.automationtesting.in/Register.html");
         driver.manage().window().maximize();
         WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
         name.sendKeys("mani");
         WebElement skill = driver.findElement(By.id("Skills"));
         Select select=new Select(skill);
         select.selectByVisibleText("Android");
         List<WebElement> options = select.getOptions();
         int size = options.size();
         System.out.println(size);
         WebElement element = options.get(10);
         String text = element.getText();
         System.out.println(text);
         
}
}		
