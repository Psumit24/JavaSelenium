package webdriverIdemo;
//Search context Interface-WebDriver(I)11methods-Remote WebDriver()class

import org.openqa.selenium.chrome.ChromeDriver;

public class New01 {
	public void testCase01() {

		System.setProperty("webdriver.chrome.driver", "D:\\Jsumit\\JARS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com");
		// String pageSource = driver.getPageSource();
		// System.out.println("PageSource:-" +pageSource);
		// String Url = driver.getCurrentUrl();
		// System.out.println("Current Url:-" +Url);
		String Title = driver.getTitle();
		System.out.println("Title:-" + Title);
		// driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		new New01().testCase01();
	}
}
