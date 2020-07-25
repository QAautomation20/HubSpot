package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends TestBasePage {

	public CreateAccountPage() {
		super();
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "uid-firstName-5")
	WebElement FirstName;
	@FindBy(how = How.ID, using = "uid-lastName-6")
	WebElement LastName;
	@FindBy(how = How.ID, using = "uid-email-7")
	WebElement Email;
	@FindBy(how = How.XPATH, using = "//span[@class='private-loading-button__content private-button--internal-spacing']")
	WebElement Next;

	public void fillUpAccountDetails(String firstname, String lastname, String email) {
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		Email.sendKeys(email);
		Next.click();

	}

}
