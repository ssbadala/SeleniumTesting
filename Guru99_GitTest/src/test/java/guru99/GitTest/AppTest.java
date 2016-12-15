package guru99.GitTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class AppTest {
	protected WebDriver driver;
	@Test
	
	public void guru99tutorials(){
	WebDriver driver1 = new FirefoxDriver();
	String eTitle = "Meet Guru99";
	String aTitle = " ";
	driver1.get("http://www.guru99.com/");
	driver1.manage().window().maximize();
	aTitle = driver1.getTitle();
	if (aTitle.contentEquals(eTitle)){
		System.out.println("Test Passed");
	}
	else {
		System.out.println("Test Failed");
	}
	
	driver1.close();
		
	
	}
	
}
