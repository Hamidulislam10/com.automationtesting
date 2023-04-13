
package com.automationtesting.com.automationtesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationtest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vuse.com/gb/en/customer/account/create/");
		driver.manage().window().maximize();
		WebElement cookies=driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]"));
		cookies.click();
		
		WebElement age_rest_btn=driver.findElement(By.xpath("//button[@id=\"btn-entry-age-allow\"]"));
		age_rest_btn.click();
		
		create_account(driver);
		
				
    }
	
	public static void create_account(WebDriver driver) {
		WebElement f_name=driver.findElement(By.xpath("(//input[@id=\"firstname\"])[1]"));
		f_name.sendKeys("Rahul");
		
		WebElement l_name=driver.findElement(By.xpath("(//input[@id=\"lastname\"])[1]"));
		l_name.sendKeys("Dubey");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
		email.sendKeys("rahul_dubey@gmail.com");
		
		WebElement dob=driver.findElement(By.xpath("//*[@id=\"dob\"]"));
		dob.sendKeys("18/08/1998");
		
		WebElement gender=driver.findElement(By.xpath("//select[@id=\"gender\"]"));
		//we will use select class if the dropdown tag is <select> else we will use bootstrap method
		Select dd=new Select(gender);
		dd.selectByValue("1");
		
		
		WebElement addr=driver.findElement(By.xpath("//*[@id=\"address-search\"]"));
		addr.sendKeys("Dwarka nagar, Bangalore");
		
		WebElement phone=driver.findElement(By.xpath("(//*[@id=\"telephone\"])[1]"));
		phone.sendKeys("+918638337625");
		
		WebElement terms_cond_cb=driver.findElement(By.xpath("//label[@for=\"mobile_text_required\"]"));
//		terms_cond_cb.click();
		
		WebElement create_pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		create_pass.sendKeys("password");
		
		WebElement confirm_pass=driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]"));
		confirm_pass.sendKeys("password");
	}
	
}

//[11:42 pm, 14/03/2023] Manish Quality Analyst: package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		
             options.addArguments("--incognito");

	WebDriver driver = new ChromeDriver(options);

		// WebDriver ---------------Interface
		// ChromeDriver--------------Class

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert----- accept dismiss, sendkeys
		
		
		 
//	WebElement jsButton=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	  
	 //jsButton.click();
		
//	WebElement btn2=	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
	
	//  btn2.click();
		
		WebElement btn3= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
[11:44 pm, 14/03/2023] Manish Quality Analyst: JavascriptExecutor js= (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();",btn3);
	 
		Alert alert  = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
		
	   
     String text=alert.getText();
     
     System.out.println(text);
     
      alert.sendKeys("Manish");
      alert.accept();
	    
	    
	    
	 

	}

}
//[11:42 pm, 14/03/2023] Manish Quality Analyst: package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		
             options.addArguments("--incognito");

	WebDriver driver = new ChromeDriver(options);

		// WebDriver ---------------Interface
		// ChromeDriver--------------Class

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert----- accept dismiss, sendkeys
		
		
		 
//	WebElement jsButton=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	  
	 //jsButton.click();
		
//	WebElement btn2=	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
	
	//  btn2.click();
		
		WebElement btn3= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
[11:44 pm, 14/03/2023] Manish Quality Analyst: JavascriptExecutor js= (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();",btn3);
	 
		Alert alert  = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
		
	   
     String text=alert.getText();
     
     System.out.println(text);
     
      alert.sendKeys("Manish");
      alert.accept();
	    
	    
	    
	 

	}

}[11:42 pm, 14/03/2023] Manish Quality Analyst: package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions(); options.addArguments("--remote-allow-origins=*");
		
             options.addArguments("--incognito");

	WebDriver driver = new ChromeDriver(options);

		// WebDriver ---------------Interface
		// ChromeDriver--------------Class

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert----- accept dismiss, sendkeys
		
		
		 
//	WebElement jsButton=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
	  
	 //jsButton.click();
		
//	WebElement btn2=	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
	
	//  btn2.click();
		
		WebElement btn3= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
[11:44 pm, 14/03/2023] Manish Quality Analyst: JavascriptExecutor js= (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();",btn3);
	 
		Alert alert  = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
		
	   
     String text=alert.getText();
     
     System.out.println(text);
     
      alert.sendKeys("Manish");
      alert.accept();
	    
	    
	    
	 

	}

}
