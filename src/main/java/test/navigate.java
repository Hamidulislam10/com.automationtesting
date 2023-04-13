package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigate {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.naukri.com/mnjuser/homepage");
		 driver.manage().window().maximize();
	driver.navigate().back();	 
		 

	}

}
