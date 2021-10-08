package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thanga\\eclipse-workspace\\Project2\\lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
		
		WebElement fbr = driver.findElement(By.name("username"));
		fbr.click();
		fbr.sendKeys("8072589140");
		
		WebElement ybr = driver.findElement(By.name("password"));
		ybr.sendKeys("232434");
		
		//driver.findElement(By.onclick("return fLogon();"));
		
	}

}
