package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ObjectRepo.AmazonHomePage;
import ObjectRepo.AmazonLoginPage;

public class Login {
	WebDriver driver = new FirefoxDriver();
	
	@BeforeClass
	public void beforeclass(){
	driver.get("http://www.amazon.com/");
	}
	
	@Test
	public void Login(){
		
		AmazonLoginPage al = new AmazonLoginPage(driver);
		al.SignInLink().click();
		al.EmailId().sendKeys("testmail02015@gmail.com");
		al.Passwd().sendKeys("india1947");
		al.Submit().click();	
	}
	
	@Test
	public void SearchBox(){
		AmazonHomePage ah = new AmazonHomePage(driver);
		ah.Search().sendKeys("Star");
		ah.Search().sendKeys(Keys.DOWN);
		ah.Search().sendKeys(Keys.DOWN);
		ah.Search().sendKeys(Keys.ENTER);
	}

}
