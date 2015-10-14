package testcases;

import org.testng.annotations.Test;

import pages.SignOutPage;
import base.TestBase;

public class SignOutTestCase extends TestBase{
		
		@Test
		public void SignInTest() {

		SignOutPage obj = new SignOutPage(driver);
		obj.SignOut("maulik190@gmail.com");

	}
}


