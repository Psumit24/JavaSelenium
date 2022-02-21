package javass;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxx {
public void testCase02()  {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Downloads\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://testingshastra.com/pages/Assignments.html");
	
}
public static void main(String[] args) {
	new Firefoxx().testCase02();
}
}
