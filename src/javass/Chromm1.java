package javass;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chromm1 {
	public void testCase01() {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://testingshastra.com");
	}
	public static void main(String[] args) {
		new Chromm1().testCase01();
	}
}
