package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectsRepo {

	private static WebElement element = null;

	public static WebElement SearchButton(WebDriver driver){
		element =  driver.findElement(By.id("searchBtn"));
		return element;
	}
	
	public static WebElement AlertMessage(WebDriver driver){
		element =  driver.findElement(By.cssSelector("div.infoContainer.alertDialog > div.content > h3"));
		return element;
	}
	
	public static WebElement CloseButton(WebDriver driver){
		element =  driver.findElement(By.linkText("Close"));
		return element;
	}
	
	public static WebElement SearchBox(WebDriver driver){
		element =  driver.findElement(By.id("searchBox-1"));
		return element;
	}
	
	public static WebElement SearchResult(WebDriver driver){
		element =  driver.findElement(By.cssSelector("h1"));
		return element;
	}

}


