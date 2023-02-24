package com.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		WebElement multiple = driver.findElement(By.xpath("//select[@multiple='owc']"));
        Select s = new Select(multiple);
        List<WebElement> options = s.getOptions();
        System.out.println(options);
        
        for (WebElement webElement : options) {
        	System.out.println(webElement.getText());
        	
        	s.selectByIndex(0);
        	s.selectByValue("option 1");
        	s.selectByVisibleText("Option 2");
        	
        	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
            System.out.println(allSelectedOptions);
            System.out.println("+++++++++++++++++++++++");
            
            for (WebElement webElements : allSelectedOptions) {
            	System.out.println(webElements.getText());
            	
            	s.deselectByIndex(3);
            	boolean multiple2 = s.isMultiple();
            	System.out.println(multiple2);
            }
            
        }
	}

}
