package javaSelinum;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	private void webtable() {
		System.setProperty("webdriver.chrome.driver", "D:\\Jsumit\\JARS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.bseindia.com/markets/Equity/equitysensexstream.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> securitylist = driver
				.findElements(By.xpath("//div[@class='col-lg-12 largetable']" + "/descendant::tbody/tr/td[2]"));
		Iterator<WebElement> itr = securitylist.iterator();
		System.out.println("Number of elements.." + securitylist.size());
		int c = 1;
		while (itr.hasNext()) {

			WebElement element = (WebElement) itr.next();
			if (element.getText().equalsIgnoreCase("ASIANPAINT")) {
				System.out.println("Price.." + driver
						.findElement(By.xpath(
								"//div[@class='col-lg-12 largetable']" + "/descendant::tbody/tr[" + c + "]/td[3]"))
						.getText());
				break;
			} else {
				c++;
			}

		}

		driver.quit();
	}

	public static void main(String[] args) {
		new WebTableHandling().webtable();
	}

}
