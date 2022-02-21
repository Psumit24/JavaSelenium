package javass;

import java.time.Duration;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetE {
public void testca03() {
	System.setProperty("webdriver.ie.driver", "D:\\Jsumit\\JARS\\IEDriverServer.exe");
InternetExplorerDriver driver = new InternetExplorerDriver();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.icicibank.com");

System.out.println("Tittle>>>"+driver.getTitle());
}
public static void main(String[] args) {
	new InternetE().testca03();
}
}
