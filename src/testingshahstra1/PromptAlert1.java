package testingshahstra1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlert1 {
	public void testa02() {
		System.setProperty("webdriver.gecko.driver", "D:\\Jsumit\\JARS\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testingshastra.com");
		System.out.println("Tittle>>>" + driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Assignments')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),' prompt alert')]")).click();
		WebElement fc = driver.findElement(By.tagName("button"));
		fc.click();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("Message>>>" + msg);
		alert.sendKeys("Sumit");
		alert.accept();
		String msssg = alert.getText();
		System.out.println("Message>>>" + msssg);
		alert.sendKeys("31");

		alert.accept();
		WebElement p = driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(p.getText());
		driver.close();
	}

	public static void main(String[] args) {
		new PromptAlert1().testa02();
	}

}
