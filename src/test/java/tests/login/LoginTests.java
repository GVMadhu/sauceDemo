package tests.login;

import org.testng.annotations.Test;
import org.testng.Assert;
import sauceDemo.BaseTest;

public class LoginTests extends BaseTest {
	
	@Test
	public void testLoginErrorMessage() {
		loginPage.setUsername("standard_user");
		loginPage.setPassword("GVM2225");
		loginPage.clickLoginButton();
		String actualMessage=loginPage.getErrormessage();
		
		Assert.assertTrue(actualMessage.contains("Epic sadface"));
	}

}
