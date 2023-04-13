package com.automationtesting.com.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseover {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 driver.manage().window().maximize();
		WebDriver pp= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		 
		 
	 

	} 


}
  