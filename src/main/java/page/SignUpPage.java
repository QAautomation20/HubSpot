package page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utilPage.WindowHandles;

public class SignUpPage extends TestBasePage {

	public SignUpPage() throws IOException {
		super();
		
	}
	@FindBy(how = How.LINK_TEXT, using = "Get HubSpot free")WebElement signUp;
	@FindBy(how = How.LINK_TEXT, using = "Get free CRM")WebElement GetAccount;


	public void signUp() {
		signUp.click();
	}
	public void getAccount() {
		GetAccount.click();
	}
}