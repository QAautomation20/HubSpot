package testPage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.SignUpPage;
import page.TestBasePage;
import utilPage.WindowHandles;

public class LoginTest extends TestBasePage {

	SignUpPage signUp;
	public LoginTest(){
		super();// called super constructor to initialize properties file (Inheriting)
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		 signUp = new SignUpPage();
	}

	@Test
	public  void goToCreateAccount() {
		String title = signUp.validateSignUpPage();
		Assert.assertEquals(title, "HubSpot | Inbound Marketing, Sales, and Service Software");
		signUp.createAccount();
		signUp.getAccount();
	}
	@AfterMethod
	public void closeEverything() {
		driver.close();
	}
}
