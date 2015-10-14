package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SigninPage {
	WebDriver driver;

	public SigninPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By usernameTextbox = By.xpath("//*[@id='Email']");
	By nextButton = By.xpath("//*[@id='next']");
	By emailValidation = By.id("errormsg_0_Email");
	By passwordTextbox= By.xpath("//*[@id='Passwd']");
	By signinButton = By.xpath("//*[@id='signIn']");
	By starred=By.linkText("Starred");
	
	public void typeUsernameTextbox(String username){
		driver.findElement(usernameTextbox).sendKeys(username);
	}
	
	public void clickNextButton(){
		driver.findElement(nextButton).click();
	}
	
	public void typePasswordTextbox(String password){
		driver.findElement(passwordTextbox).sendKeys(password);
	}
	
	public void clickSignInButton(){
		driver.findElement(signinButton).click();
	}
	
	public String getEmailValidationText(){
		return driver.findElement(emailValidation).getText();
	}
	
	public String getStarredText(){
		return driver.findElement(starred).getText();
	}
	

	public void validSignIn(String username, String password){
		typeUsernameTextbox(username);
		clickNextButton();
		
		typePasswordTextbox(password);
		clickSignInButton();
		String actual = getStarredText();
		Assert.assertEquals(actual, "Starred");
	}

}
