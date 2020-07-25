package page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class SignUpPage extends TestBasePage {
	
	@FindBy(how = How.LINK_TEXT, using = "Get HubSpot free")WebElement GetHub;
	@FindBy(how = How.LINK_TEXT, using = "Get free CRM")WebElement GetAccount;

	//Initializing the page objects
	public SignUpPage() {
		PageFactory.initElements(driver, this);//this = same as SignUpPage.class 
	}
	//Actions
	public String validateSignUpPage() {
		return driver.getTitle();
		
	}

	public void createAccount() {
		GetHub.click();
	}
	public void getAccount() {
		GetAccount.click();
		
	}
}