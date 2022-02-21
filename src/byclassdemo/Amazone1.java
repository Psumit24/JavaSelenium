package byclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone1 {
	public void testcase08() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Jsumit\\JARS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// driver.findElement(By.partialLinkText("All")).click();
//driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2']"))
//.click();
		// WebElement skillsList = driver
		// .findElement(By.xpath("//select
		// [@aria-describedby='searchDropdownDescription']"));
		// Select select = new Select(skillsList);
		// select.selectByVisibleText("Deals");
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("//div[@class='nav-fill']/div/input[@type='text']"));
		Thread.sleep(2000);
		from.click();
		from.sendKeys("Bolt");
		Thread.sleep(2000);
		from.sendKeys(Keys.SPACE);
		Thread.sleep(5000);
		from.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN);
		Thread.sleep(1000);
		from.sendKeys(Keys.ENTER);
	}

	public static void main(String[] args) throws InterruptedException {

		new Amazone1().testcase08();
	}
}