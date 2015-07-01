package IE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IEBrowser {
	public static  WebDriver driver=null;
	@Test
	
	public void launchIE()
	{
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\InternetExplorerDriver\\IEDriverServer.exe");
		
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(
		    InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
		    true);
		WebDriver driver = new InternetExplorerDriver(caps);
		
		
	
	}


}
