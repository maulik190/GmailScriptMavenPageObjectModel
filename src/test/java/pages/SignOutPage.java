package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignOutPage {


		WebDriver driver;
		String username="";

		public SignOutPage(WebDriver driver) {
			this.driver = driver;
		}
		
		By profileButton = By.linkText(username);
		By signoutButton = By.xpath("//*[@id='gb_71']");
		By signinButton = By.xpath("//*[@id='signIn']");
		
		public void clickProfileButton(){
			driver.findElement(profileButton).click();
		}
		
		public void clickSignOutButton(){
			driver.findElement(signoutButton).click();
		}
		
		public String getSigninText(){
			return driver.findElement(signinButton).getText();
		}
		
		public void SignOut(String username){
			this.username = "maulik190@gmail.com";
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickProfileButton();
			clickSignOutButton();
			String actual = getSigninText();
			Assert.assertEquals(actual, "Sign in");
		}
		
		
}
