package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLoginPage {
	WebDriver driver;
	
	public AmazonLoginPage(WebDriver driver){
		this.driver = driver;	
	}
	
		By signin = By.id("nav-link-yourAccount");
		By email = By.id("ap_email");
		By password = By.id("ap_password");
		By go = By.id("signInSubmit");
		
	public WebElement SignInLink(){
			return driver.findElement(signin);
		}
		
	public WebElement EmailId(){
		return driver.findElement(email);
	}
	
	public WebElement Passwd(){
		return driver.findElement(password);
	}
	
	public WebElement Submit(){
		return driver.findElement(go);
	}

	

}
