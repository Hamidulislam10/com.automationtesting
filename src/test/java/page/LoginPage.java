package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	 WebDriver driver;
	
	public void launch_url()
	{
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 
	}
	public void enter_user_name() {
		WebElement user=driver.findElement(By.xpath(" //input[@id=\"user-name\"]"));
		user.sendKeys("Hamid");
	}
public void enter_password() 
{
	WebElement  pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));
	pass.sendKeys("Hamid123");
}
public void click_login_button() {
	WebElement click=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
	click.click();
}}

