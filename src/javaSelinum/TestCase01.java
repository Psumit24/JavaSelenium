package javaSelinum;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase01 {
	public void testIE() {
		
		System.setProperty("webdriver.ie.driver","D:\\Jsumit\\JARS\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		//driver.get("http://testingshastra.com");
		driver.get("http://testingshastra.com/pages/Assignments.html");
		
	}
	public static void main(String[] args) {
		new TestCase01().testIE();
	}
}
