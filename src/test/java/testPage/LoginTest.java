package testPage;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.SignUpPage;
import page.TestBasePage;
import utilPage.WindowHandles;


public class LoginTest extends TestBasePage{

	public LoginTest() throws IOException {
	super();//called super constructor to initialize properties file (Inheriting)
	}

	SignUpPage signUp= PageFactory.initElements(driver, SignUpPage.class);
	WindowHandles winHandle = PageFactory.initElements(driver, WindowHandles.class);


	@BeforeMethod
	public void loginTest() {
		intialization();
	}
	@Test
	public void SignUp() throws InterruptedException {
//		Thread.sleep(5000);
//		winHandle.getWindows();
//		if (WindowHandles.parentWindow != WindowHandles.childWindow) {
//		driver.close();
//		driver.switchTo().window(WindowHandles.parentWindow);
		
		//}
		signUp.signUp();
		
	}
	
	
}
