package com.mybaseclassnew;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewBaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public String getFbUrl() {
		String url="https://en-gb.facebook.com";
		return url;
		
	}
	public String getadAdactinUrl() {
		String url="http://adactinhotelapp.com/index.php";
		return url;
		
	}
	
	public String getletcodeFormUrl() {
		String url="https://letcode.in/forms";
		return url;
		
	}
	public static void maximizewindow() {
		driver.manage().window().maximize();
	}
	public static void pagewait(int num) {
		driver.manage().timeouts().implicitlyWait(num,TimeUnit.SECONDS);
	}
	public static void fill(WebElement element, String text) {
		element.sendKeys(text);
	}
	public static void cleartextbox(WebElement element) {
		element.clear();	
	}
	public static void dropdownselectbytext(WebElement element1,String value) {
		Select sl=new Select(element1);
		sl.selectByVisibleText(value);
	}
	public static void dropdownselbyindex(WebElement element,int number) {
		Select sl=new Select(element);
		sl.selectByIndex(number);
	}
	public static void pageTitle() {
		String name = driver.getTitle();
		System.out.println("Title:" + name);
	}

	public static void pageUrl() {
		String name1 = driver.getCurrentUrl();
		System.out.println("pageUrl:" + name1);
	}

	public static void Snapshotpage(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destiny = new File("C:\\Users\\hussain\\Pictures\\Screenshots\\snapsot"+filename+".png");
		FileUtils.copyFile(screenshotAs, destiny);
	}
	public static void robotclassFucnction() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void getattributetexts(WebElement element ) {
		String orderno = element.getAttribute("value");
		System.out.println("Room Order No:"+orderno);
	}
	public static void choosefieldsbyvalue(WebElement element2,String text) {
		Select slt=new Select(element2);
		slt.selectByValue(text);
	}

	public static void clickbutton(WebElement element3) {
		element3.click();
	}
	public static void personaldetails(WebElement element,String details) {
		element.sendKeys(details);
	}
	public static void sleeptime() throws InterruptedException {
		Thread.sleep(10000);
	}
	public static void btnclick(WebElement element) {
		element.click();
	}
	public static void closebrowser() {
		driver.close();
	}


}
