package javaSelinum;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExWaits01 {
	public void testCase07() {

		System.setProperty("webdriver.chrome.driver", "D:\\Jsumit\\JARS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	//	FluentWait<ChromeDriver> wait = new FluentWait<ChromeDriver>(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(30));
		wait.withMessage("Element didn't appear within 30 seconds");
		wait.ignoring(NoSuchElementException.class);
		driver.findElement(By.xpath("//a[contains(text(), 'Assignments')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Implicit')]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sumit");
		wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button")));
		driver.findElement(By.tagName("button")).click();
		String text = driver.findElement(By.xpath("//div/p")).getText();
		System.out.println("Text:-" + text);
	}

	public static void main(String[] args) {
		new ExWaits01().testCase07();
	}
}
