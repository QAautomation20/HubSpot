package utilPage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import page.TestBasePage;

public class WindowHandles extends TestBasePage {

	// Reason for creating same class constructor is since constructor from
	// parent class is inherited default constructor must be created java no longer
	// provide one.
	public WindowHandles() throws IOException {
		super();
	}

	public static String parentWindow;
	public static String childWindow;
	public void getWindows() {
		
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> it = windowId.iterator();
		parentWindow = it.next();
		System.out.println("Parent window is" + driver.getTitle());
		childWindow = it.next();
		System.out.println("Child window is" + childWindow);
		
	}

}
