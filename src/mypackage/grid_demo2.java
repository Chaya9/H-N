//Day 8   16-7-2016  Linked to testng2.xml
//with creating the object of DesiredCapabilities. And object helps in writing code for giving conditions like required browser, required platform, required version. Basically creating object is not required in Grid-IP address concept. It is required in Hub concept.ince in Grid-IP address we already know in which machine in which platorm/version we are running code. But in hub node concept we have to specify explicitly because we dont have any control on nodes
package mypackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class grid_demo2 {
	@Test
	public void function1(XmlTest t) throws MalformedURLException{
	String browser = t.getParameter("browser");
	Reporter.log("browser",true);
	URL remoteAddress = new URL("http://10.10.4.87:4460/wd/hub");
	DesiredCapabilities capability = new DesiredCapabilities();
	capability.setBrowserName(browser);
	//capability.setPlatform(Platform.LINUX);
	//capability.setVersion("51");
	WebDriver driver = new RemoteWebDriver(remoteAddress,capability);
	driver.get("https://www.gmail.com");
	driver.close();
	}

}
