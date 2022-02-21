package javaSelinum;

//Implicit wait 
//it waits to presence of WebElement.it doesn't wait for particular state of the element.
//it waits WebElements only.it applies for lifetime of WebDriver instance.
//it defines a max  using Duration. cannot define pooling time
//dom-document object model
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IxWaits01 {
	public void testcase06() {

		System.setProperty("webdriver.chrome.driver", "D:\\Jsumit\\JARS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(), 'Assignments')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Implicit')]")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sumit");
		driver.findElement(By.tagName("button")).click();
		String text = driver.findElement(By.xpath("//p[@id='Demo']")).getText();
		System.out.println("Text:-" + text);
	}

	public static void main(String[] args) {
		new IxWaits01().testcase06();
	}
}