//Day 8    16-7-2016  Linked to testng1.xml
//without creating the object of DesiredCapabilities
package mypackage;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class grid_demo1 {
	@Test
	public void function1() throws MalformedURLException{
	URL remoteAddress = new URL("http://10.10.4.87:4450/wd/hub");
	WebDriver driver = new RemoteWebDriver(remoteAddress,DesiredCapabilities.firefox());
	driver.get("https://www.gmail.com");
	driver.close();

		}
	}

