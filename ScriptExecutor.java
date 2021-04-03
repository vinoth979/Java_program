package org.javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScriptExecutor {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "./driver./chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Actions mouse=new Actions(driver);
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement loginpage = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	mouse.moveToElement(loginpage).click().build().perform();
	
	
	/*WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('value','devendrandeva');", uname);
	js.executeScript("arguments[0].setAttribute('value','qjjhbaamhb');", pass);
	
	WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
	js.executeScript("arguments[0].click();", login); */
}
}
