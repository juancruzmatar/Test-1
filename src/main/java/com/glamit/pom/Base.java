package com.glamit.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

private WebDriver driver;
public Base (WebDriver driver) {
	this.driver=driver;
}


public WebElement findElement (By locator){
	return driver.findElement(locator);
	
}

public String getText (WebElement Element) {
	return Element.getText();
}

public void click (By locator) {
	
	driver.findElement(locator).click();
	
}

public void Visit (String url) {
	driver.get(url);
}

}


