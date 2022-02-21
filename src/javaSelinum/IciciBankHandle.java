package javaSelinum;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBankHandle {
	public void iciciTest01() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Jsumit\\JARS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.icicibank.com");
		driver.findElement(By.xpath(
				"//div[@class='push-popup desktop-only']/div[@id='push-modal-content']/div[contains(text(), 'Later')]"))
				.click();
		WebElement ic = driver.findElement(By.className("sf-search-input-text"));
		ic.click();
		driver.findElement(By.className("close-popup")).click();
		ic.click();
		WebElement icc = driver.findElement(By.xpath("//input[@type=' ']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		icc.sendKeys("saving accounts");
// driver.switchTo().alert().accept();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='sf-panel']/div"));
		System.out.println("Total number of suggestions:->" + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("Purpose and tax implications of a Savings Account")) {
				list.get(i).click();
				break;
			}
		}

//driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		new IciciBankHandle().iciciTest01();
	}
}
