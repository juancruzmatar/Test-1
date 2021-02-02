package com.glamit.pom;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.glamit.pom.Base;

public class Clasecuatro extends Base{


	
	public Clasecuatro(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public WebDriver driver; 
	
	// Lista de localizadores 
	By BotonM=By.cssSelector("#cat-sale > a");
	// Categorias
	By Bermudas= By.cssSelector("#cat-1603 > a");
	By Pantalones= By.cssSelector("#cat-1604 > a");
	By RemerasPolo= By.cssSelector("#cat-1605 > a");
	By Camisas= By.cssSelector("#cat-1606 > a");
	
	@Before
	
	public void setUp () throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.levi.com.ar/");
	}
	@Test
	
	public void TestClass3 ()throws Exception {
		Visit ("https://www.levi.com.ar/e-shop/mujeres.html");
		
	}

	
}
