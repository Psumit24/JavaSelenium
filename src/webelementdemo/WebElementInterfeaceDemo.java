package webelementdemo;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementInterfeaceDemo {
	public void testcase04() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/Jsumit/Daisyz/HTML/Formdemo.html");
		String text = driver.findElement(By.xpath("//input[@name='male']")).getText();
		System.out.println("text = " +text);
		//driver.findElement(By.xpath("//input[@name='male']")).click();
		//boolean isMaleSelected=driver.findElement(By.xpath("//input[@name='male']")).isSelected();
		//System.out.println("is Male Selected:-"+isMaleSelected);
		//boolean isFemaleSelected=driver.findElement(By.xpath("//input[@name='female']")).isSelected();
	//	System.out.println("is FeMale Selected:-"+isFemaleSelected);
		//driver.findElement(By.xpath("//input[@id='fname']")).getAttribute("value");
		//driver.findElement(By.xpath("//input[@id='lname']")).getAttribute("value");
		//driver.findElement(By.xpath("//input[@id='fname']")).clear();
		//driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Sumit");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id='lname']")).clear();
		//driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Pakhare",Keys.CONTROL,Keys.TAB);
		//driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Pakhare",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		new WebElementInterfeaceDemo().testcase04();

	}
}