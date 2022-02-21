package javaSelinum;

//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selinum4B {
	public void testcase05() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Jsumit\\JARS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shutterfly.com/");
	//	String text=driver.findElement(
	//			(By.xpath("//span[contains(@class,'orangecontent')]"))
	//			.below((By.xpath("//a[@data-link-id='Photo Books']")))).getText();
	//	System.out.println("Text:- "+text);
	}
	public static void main(String[] args) {
		new Selinum4B().testcase05();
	}
	}
