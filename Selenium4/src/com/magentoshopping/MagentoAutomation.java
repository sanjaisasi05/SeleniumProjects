package com.magentoshopping;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.Day2.BaseClass;

public class MagentoAutomation extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		browserLaunch("chrome");
		getUrl("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		scrollByBottomToTopPixels1();
		Thread.sleep(1000);
		WebElement argusAll = driver.findElement(By.xpath("//a[@title='Argus All-Weather Tank']"));
		argusAll.click();
		Thread.sleep(1000);
		scrollByBottomToTopPixels();
		Thread.sleep(1000);
		WebElement chooseSize = driver.findElement(By.xpath("//div[@id='option-label-size-143-item-168']"));
		chooseSize.click();
		Thread.sleep(1000);
		WebElement chooseColor = driver.findElement(By.xpath("//div[@class='swatch-option color']"));
		chooseColor.click();
		Thread.sleep(1000);
		WebElement addToCart = driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
		addToCart.click();
		Thread.sleep(1000);
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		scrollByBottomToTopPixels1();
		Thread.sleep(1000);
		WebElement bagPack = driver.findElement(By.xpath("//a[@title='Fusion Backpack']"));
		bagPack.click();
		Thread.sleep(1000);
		WebElement chooseQty = driver.findElement(By.xpath("//input[@id='qty']"));
		chooseQty.clear();
		Thread.sleep(1000);
		chooseQty.sendKeys("5");
		Thread.sleep(1000);
		WebElement addToCartBag = driver.findElement(By.xpath("//button[@id='product-addtocart-button']"));
		addToCartBag.click();
		Thread.sleep(1000);
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		Thread.sleep(1000);
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='search']"));
		searchBar.sendKeys("watch"+Keys.ENTER);
		scrollByBottomToTopPixels2();
		Thread.sleep(1000);
		WebElement analogWatch = driver.findElement(By.xpath("(//a[@class='product-item-link'])[2]"));
		analogWatch.click();
		Thread.sleep(1000);
		WebElement watchQty = driver.findElement(By.xpath("//input[@id='qty']"));
		watchQty.clear();
		Thread.sleep(1000);
		watchQty.sendKeys("3");
		Thread.sleep(1000);
		WebElement watchCart = driver.findElement(By.xpath("//button[@title='Add to Cart']"));
		watchCart.click();
		Thread.sleep(1000);
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		Thread.sleep(1000);		
		WebElement cartIcon = driver.findElement(By.xpath("//a[@class='action showcart']"));
		cartIcon.click();
		Thread.sleep(3000);
		WebElement proceedToCheck = driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"));
		proceedToCheck.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[1]/fieldset/div/div/input")).sendKeys("sanjaisasi05@gmail.com");
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("(//input[@class='input-text'])[4]"));
		firstName.sendKeys("Rohith");
		Thread.sleep(2000);
		WebElement lastName = driver.findElement(By.xpath("(//input[@class='input-text'])[5]"));
		lastName.sendKeys("surya");
		Thread.sleep(2000);
		WebElement companyName = driver.findElement(By.xpath("(//input[@class='input-text'])[6]"));
		companyName.sendKeys("VSR Shopping");
		Thread.sleep(1000);
		WebElement streetAddress = driver.findElement(By.xpath("(//input[@class='input-text'])[7]"));
		streetAddress.sendKeys("2/33 Mosque Lane");
		Thread.sleep(1000);
		WebElement streetAddress1 = driver.findElement(By.xpath("(//input[@class='input-text'])[8]"));
		streetAddress1.sendKeys("West Saidapet");
		Thread.sleep(1000);
		WebElement streetAddress2 = driver.findElement(By.xpath("(//input[@class='input-text'])[9]"));
		streetAddress2.sendKeys("Chennai 600015");
		Thread.sleep(1000);
		WebElement chooseCity = driver.findElement(By.xpath("(//input[@class='input-text'])[10]"));
		chooseCity.sendKeys("Chennai");
		Thread.sleep(1000);
		WebElement chooseState = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select"));
		chooseState.click();	
		dropDown(chooseState, "byVisibleText", "California");
		Thread.sleep(1000);
		scrollByBottomToTopPixels2();
		Thread.sleep(1000);
		WebElement postalCode = driver.findElement(By.xpath("(//input[@class='input-text'])[12]"));
		postalCode.sendKeys("600015");
		Thread.sleep(1000);
		WebElement phNo = driver.findElement(By.xpath("(//input[@class='input-text'])[13]"));
		phNo.sendKeys("8608680160");
		Thread.sleep(1000);
		WebElement flatRate = driver.findElement(By.xpath("//input[@name='ko_unique_6']"));
		flatRate.click();
		Thread.sleep(1000);
		WebElement nxtButton = driver.findElement(By.xpath("//button[@class='button action continue primary']"));
		nxtButton.click();
		Thread.sleep(4000);
		WebElement placeOrder = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
        placeOrder.click();
        

	}

}
