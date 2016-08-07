//Day8  16-7-2016  Linked to testng3.xml
//To run on both browsers(chrome, firefox) using same script
package mypackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class grid_demo3 {
	@Test
	public void function1(XmlTest t) throws MalformedURLException{
	String browser = t.getParameter("browser");
	String ip = t.getParameter("URL");
	Reporter.log("browser",true);
	URL remoteAddress = new URL(ip);
	DesiredCapabilities capability = new DesiredCapabilities();
	capability.setBrowserName(browser);
	WebDriver driver = new RemoteWebDriver(remoteAddress,capability);
	driver.get("https://www.gmail.com");
	driver.close();
	}

}
