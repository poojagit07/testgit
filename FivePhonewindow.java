package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FivePhonewindow {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\sara\\Mani\\chrom\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
WebElement searchbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
searchbox.sendKeys("iphone 11");
WebElement searchbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
searchbtn.click();
WebElement iphonebtn = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
iphonebtn.click();
String par = driver.getWindowHandle(); //parent window
Set<String> all = driver.getWindowHandles();
for (String x : all) {
	if (!par.equals(x)) {
       driver.switchTo().window(x);		
	}
}
WebElement pricetxt = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
String price = pricetxt.getText();
System.out.println(price);
}
}