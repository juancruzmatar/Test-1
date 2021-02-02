package automation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LevisAR {

private WebDriver driver;

@Before
public void setUp () throws Exception {
	
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.levi.com.ar/");
	
}

@Test 
public void TestLevis () throws Exception {
	
	driver.findElement(By.cssSelector("#cat-sale > a")).click();
	driver.findElement(By.cssSelector("#cat-1496 > a")).click();


}
}
