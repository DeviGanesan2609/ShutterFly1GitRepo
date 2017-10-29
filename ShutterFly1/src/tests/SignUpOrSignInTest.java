package tests;

import org.testng.annotations.Test;

import pages.SignUpOrSignInPage;

public class SignUpOrSignInTest extends SignUpOrSignInPage
{
	@Test
	public static void verifySignUp()
	{
		signUp();
	}
	
}
