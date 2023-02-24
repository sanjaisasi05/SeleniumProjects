package com.addactinsignup;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Day2.BaseClass;

public class AddactinSignUpPage extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		browserLaunch("chrome");
		getUrl("https://adactinhotelapp.com/Register.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rohith07");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("rohith2000");
		driver.findElement(By.xpath("//input[@name='re_password']")).sendKeys("rohith2000");
		driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("rohithsurya07");
		driver.findElement(By.xpath("//input[@name='email_add']")).sendKeys("rohithsurya07@gmail.com");
		Scanner sc = new Scanner (System.in);
		WebElement captcha = driver.findElement(By.xpath("//input[@id='captcha-form']"));
		System.out.println("Enter Your Captcha:");
		Thread.sleep(10000);
		String input = sc.nextLine();
		Thread.sleep(5000);
		String.valueOf(input);
		captcha.sendKeys(input);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='tnc_box']")).click();
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
