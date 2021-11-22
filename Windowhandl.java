package org.test;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windowhandl {
      public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saranya R.S\\eclipse-workspace\\sara\\Mani\\chrom\\chromedriver.exe");
        WebDriver driver =new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		WebElement texsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		texsearch.sendKeys("iphone 11");
		WebElement serchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		serchbtn.click();
		WebElement iphone11btn = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		iphone11btn.click();
		String par = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String x : all) {
			if (!par.equals(x)) {
				driver.switchTo().window(x);
			}
		}
		WebElement blackprice = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		String blkprice = blackprice.getText();
		System.out.println(blkprice);
		driver.switchTo().window(par);
		WebElement yelbtn = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		yelbtn.click();
		Set<String> all2 = driver.getWindowHandles();
		int count =0;
		for (String x : all2) {
			if (count==2) {
				driver.switchTo().window(x);
			}count++;
		}
		
		WebElement textyellowprice = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		String yelprice = textyellowprice.getText();
		System.out.println(yelprice);
		driver.switchTo().window(par);
		WebElement blc128btn = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[8]"));
		blc128btn.click();
		Set<String> all3 = driver.getWindowHandles();
		int count1 =0;
		for (String x : all3) {
			if (count1==3) {
				driver.switchTo().window(x);
			}count1++;
		}
		WebElement blc128txt = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		String blc128price = blc128txt.getText();
		System.out.println(blc128price);
		driver.switchTo().window(par);
		WebElement newappiphonebtn = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[12]"));
		newappiphonebtn.click();
		Set<String> all4 = driver.getWindowHandles();
		int count2=0;
		for (String x : all4) {
			if (count2==4) {
				driver.switchTo().window(x);
				}
		}
		WebElement newappiphoneprice = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		String iphone512price = newappiphoneprice.getText();
		System.out.println(iphone512price);
      }
}
