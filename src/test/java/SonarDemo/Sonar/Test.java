package SonarDemo.Sonar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://gmail.com");
		
		String title= driver.getTitle();
		
		if(title.equalsIgnoreCase("Gmail")) {
			System.out.println("Test case is passed");
		}
		
		driver.close();
	
		

	}

}
