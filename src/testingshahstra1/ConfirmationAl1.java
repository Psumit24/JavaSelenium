package testingshahstra1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationAl1 {
public void testa01() {
	System.setProperty("webdriver.gecko.driver", "D:\\Jsumit\\JARS\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://testingshastra.com");
	System.out.println("Tittle>>>"+driver.getTitle());
	driver.findElement(By.xpath("//a[contains(text(),'Assignments')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'confirmation alert')]")).click();
	driver.findElement(By.tagName("button")).click();
	Alert alert= driver.switchTo().alert();
	String msg= alert.getText();
	System.out.println("Message>>>" +msg);
	alert.accept();
	
	
//driver.close();
}
public static void main(String[] args) {
	new ConfirmationAl1().testa01();
}
}
