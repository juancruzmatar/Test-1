package automation;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testgoogle {
private WebDriver driver;
@Before	
public void setup() {
	
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
}
	
@Test
public void TestGoogle() {
	WebElement searchbox= driver.findElement(By.name("q"));
	searchbox.clear();
	searchbox.sendKeys("glamit");
	searchbox.submit();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	assertEquals("glamit- buscar con Google",driver.getTitle());
}



public void tearDown() {
	driver.quit();
}}