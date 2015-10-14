package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.SigninPage;

public class SignInTestCase extends TestBase{
	
	@Test
	public void SignInTest() {

	SigninPage obj = new SigninPage(driver);
	obj.validSignIn("maulik190@gmail.com", "9426981398");

}
}
