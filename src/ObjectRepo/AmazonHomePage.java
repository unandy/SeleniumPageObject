package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	WebDriver driver;

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchbox = By.id("twotabsearchtextbox");
	
	public WebElement Search(){
		return driver.findElement(searchbox);
	}

}
