package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Imp {
	WebDriver driver();
 static {
	 FileInputStream file= new FileInputStream("/home/hamidul/eclipse-workspace/com.automationtesting/Data/file");
		 Properties prop= new Properties();
		 prop.load(file);
 }
