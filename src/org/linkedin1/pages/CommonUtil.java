package org.linkedin1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtil {
	
	WebDriver driver = null;
	WebDriverWait wait = null;
	
public CommonUtil (String URL, String waitingtime, String browser){
	
	if (browser.equalsIgnoreCase("chrome"))
	{
		driver= new ChromeDriver();
	}
	
	else if (browser.equalsIgnoreCase("internet explorer"))
	{
		driver = new InternetExplorerDriver();
	}
	else if (browser.equalsIgnoreCase("FireFox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\swaroop\\Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	else 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\swaroop\\Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("no other browser selected, Firefox initiated");
	}

	wait = new WebDriverWait(driver, Integer.parseInt(waitingtime));
	driver.get(URL);
	
	}

public void clickurl(String xpath)
{

	WebElement element = driver.findElement(By.xpath(xpath));
	element.click();
}

public void navigateback()

{
	driver.navigate().back();
}

public void txtField(String xpath, String text)
{
	WebElement element = driver.findElement(By.xpath(xpath));
	element.sendKeys(text);
	
}



}


