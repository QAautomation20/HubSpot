package testPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.CreateAccountPage;
import page.SignUpPage;
import page.TestBasePage;

public class CreateAccountTest extends TestBasePage {
	CreateAccountPage createAccount;
	SignUpPage signUp;

	public CreateAccountTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		 signUp = new SignUpPage();
		String title = signUp.validateSignUpPage();
		Assert.assertEquals(title, "HubSpot | Inbound Marketing, Sales, and Service Software");
		signUp.createAccount();
		signUp.getAccount();
	}

	@Test
	public void createAccountTest() {
		createAccount = new CreateAccountPage();
		createAccount.fillUpAccountDetails(prop.getProperty("firstname"), prop.getProperty("lastname"),
				prop.getProperty("email"));
	}
	@AfterMethod
	public void closeEverything() {
		driver.close();
	}
}
