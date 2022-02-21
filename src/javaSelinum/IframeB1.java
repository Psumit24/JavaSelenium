package javaSelinum;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeB1 {
public void iframec() throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\Jsumit\\JARS\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
    driver.switchTo().frame("iframeResult");
    driver.findElement(By.xpath("/html/body/button")).click();
    Alert art = driver.switchTo().alert();
    Thread.sleep(5000);
  art.accept();
  Thread.sleep(5000);
  driver.quit();
  
}
public static void main(String[] args) throws InterruptedException {
	new IframeB1().iframec();
}
}
