import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pojo.LaunchBrowser;

public class Demo{
	static Logger log = Logger.getLogger(Demo.class.getName());
	
@Test
public void test() {
	LaunchBrowser.LaunchChrome("https://www.javatpoint.com/log4j-example");

	log.info("Browser Launced succesfully");
	//POM.login();
	log.info("User logged in successfuylly");
	System.out.println("Checking git");	
}
@Test
public void LoginTest() {
	LaunchBrowser.LaunchChrome("");
}


}
