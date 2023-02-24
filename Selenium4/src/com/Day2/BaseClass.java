package com.Day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;
public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\chromedriver.exe");
				 driver = new ChromeDriver();
			return driver;
}else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\msedgedriver.exe");
			 driver = new EdgeDriver();
			
			return driver;
			
}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
}
			return driver;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void getCurrentUrl(String Url) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void backward() {
		driver.navigate().back();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	
	public static void quitt() {
		driver.quit();
	}
	
	public static void enaBled(WebElement element) {
		element.isEnabled();
	}
	
	public static void displayed(WebElement element) {
		element.isDisplayed();
	}
	
	public static void selected(WebElement element) {
		element.isSelected();
	}
	
	public static void mouseOver(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).release();
	}
	
	public static void rightClick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick().perform();
	}
	
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void selectByMutiple(WebElement element,String text,String Select) {
	 Select s = new Select(element);
     List<WebElement> options = s.getOptions();
     System.out.println(options);
     
     for (WebElement webElement : options) {
     	System.out.println(webElement.getText());
     	
     	s.selectByIndex(0);
     	s.selectByValue(Select);
     	s.selectByVisibleText(Select);

	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
    System.out.println(allSelectedOptions);
    System.out.println("+++++++++++++++++++++++");
    
    for (WebElement webElements : allSelectedOptions) {
    	System.out.println(webElements.getText());
    	
    	s.deselectByIndex(3);
    	boolean multiple2 = s.isMultiple();
    	System.out.println(multiple2);
    }
	}}
	
	public static void simpleAlert() {
		driver.switchTo().alert().accept();
	}
	
	public static void confirmAlert(String ok, String cancel) {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		}else if (cancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();	
		}	
	}
	
	public static void promptAlert(String ok, String cancel,String value) {
		if (ok.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().accept();
		}else if (cancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().sendKeys(value);
			driver.switchTo().alert().dismiss();	
		}	
	}
	public static void actionMethod(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick().build().perform();
	}
	public static void movetoElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}	
	
	public static void dragAndDrop(WebElement element,WebElement element1) {
	  Actions ac = new Actions(driver);
	  ac.dragAndDrop(element,element1).build().perform();
	}  
	
	public static void screenShot(String fileName) throws IOException{
		File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium4\\Snaps\\"+ fileName+ ".png");
		Files.copy(ts, destination);
	}
	
	public static void robot() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void frameMethod(String option,String value,WebElement element) {
		try {
			if (option.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				driver.switchTo().frame(index);
			}else if (option.equalsIgnoreCase("byElement")) {
				driver.switchTo().frame(value);
			}else {
				System.out.println("Invalid Selection");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	public void elementClear(WebElement element) {
		element.clear();
	}
	
	public static void windowHandles(WebElement element) {
		Set<String> element1 = driver.getWindowHandles();
	  for (String s : element1) {
		  driver.switchTo().window(s).getTitle();
		  
		  System.out.println("Title");	
	}
		}
	
	public static void clickByScroll(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguement[0].click();",element);
	}
		
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguement[0].scrollIntoView();",element);
	}
	
	public static void scrollPageTillBottom(WebElement element) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");			
	}
	public static void scrollByTopToBottomPixels() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,4500)","");			
	}
	
	public static void scrollByTopToBottomPixels1() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,1000)","");			
	}
	

	public static void scrollByTopToBottomPixels2() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,300)","");			
	}
	
	public static void scrollByBottomToTopPixels() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,-1000)","");			
	}
	
	public static void scrollByBottomToTopPixels1() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,-500)","");			
	}
	
	public static void scrollByBottomToTopPixels2() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,-300)","");			
	}
	
	public static void dropDown(WebElement element, String options, String value) {
		Select sc = new Select(element);
		if (options.equalsIgnoreCase("byValue")) {
			sc.selectByValue(value);	
		}
		else if (options.equalsIgnoreCase("byVisibleText")) {
			sc.selectByVisibleText(value);
		}
		else if (options.equalsIgnoreCase("byIndex")) {
			int parseInt = Integer.parseInt(value);
			sc.selectByIndex(parseInt);
			
		}
	}
}
	
		
	
	
