package com.automationtesting.com.automationtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waitdem {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();
WebElement user=driver.findElement(By.xpath("(//input[@class=\"input_error form_input\"])[1]"));
user.sendKeys("standard_user");
WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
password.sendKeys("secret_sauce");
WebElement login=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
login.click();
WebElement clk=driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
clk.click();
 

 
 
	}}



