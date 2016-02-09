package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ObjectRepo.AmazonLoginPage;

public class Login {

	@Test
	public void Login(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com/");
		AmazonLoginPage al = new AmazonLoginPage(driver);
		al.SignInLink().click();
		al.EmailId().sendKeys("testmail02015@gmail.com");
		al.Passwd().sendKeys("ganesha123");
		al.Submit().click();	

	}

}
