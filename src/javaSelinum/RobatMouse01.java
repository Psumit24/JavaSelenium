package javaSelinum;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RobatMouse01 {
	public void robatMos01() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrom\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testingshastra.com");
		Robot robot = new Robot();
		Thread.sleep(5000);
		robot.mouseMove(700, 275);
		robot.mouseMove(700, 300);
		driver.quit();
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		new RobatMouse01().robatMos01();
	}
}
