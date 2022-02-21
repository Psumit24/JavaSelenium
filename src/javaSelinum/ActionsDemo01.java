package javaSelinum;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

//actions class good for mouse event--work on modifier key shift alt ctrl
//Robot class good keys not mouse
public class ActionsDemo01 {

	public void mouseHover01() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrom\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testingshastra.com");
		Actions actions = new Actions(driver);
		WebElement courses = driver.findElement(By.xpath("//*[contains(text(),'Courses')]"));

		actions.moveToElement(courses);
		actions.perform();// mouse action
		driver.quit();
	}

	public void dragAndDrop1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrom\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.testingshastra.com");
		System.out.println("Tittle>>>" + driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Assignments')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Drag And Drop Assignment')]")).click();
		Actions actions = new Actions(driver);
		actions.clickAndHold();
		actions.moveToElement(null);
		actions.release();
		actions.build();
		actions.perform();

	}

	public void dragandDrop12() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrom\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		System.out.println("Tittle>>>" + driver.getTitle());
		WebElement logo = driver.findElement(By.xpath("//img[@src='img_w3slogo.gif']"));
		// WebElement dest = driver.findElement(By.xpath("//div[@id='div2']"));
		// dest.click();
		// dest.getText();
		Actions actions = new Actions(driver);
		// actions.build(logo);
		// actions.dragAndDrop(logo, dest).perform();
		// Actions actions = new Actions(driver);
		actions.clickAndHold();
		actions.moveToElement(logo, 446, 337);
		actions.release();
		actions.build();
		actions.perform();

	}

	public void dragAndDrop33() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrom\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		ChromeDriver driver = new ChromeDriver(options );
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement logo = driver.findElement(By.xpath("//div[@id='draggable']"));
		System.out.println(logo.getText());
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']/*[text()[contains(.,'Drop here')]]"));
		System.out.println(dest.getText());
		Actions action = new Actions(driver);
		//action.dragAndDrop(logo, dest).perform();
		action.clickAndHold(logo).moveToElement(dest).release().build().perform();
		System.out.println(dest.getText());
	}
	public void dragAndDrop04() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrom\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		ChromeDriver driver = new ChromeDriver(options );
		FluentWait<ChromeDriver> wait = new FluentWait<ChromeDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(10));
		wait.withTimeout(Duration.ofSeconds(1000));
		wait.withMessage("Element didn't appear within 30 seconds");
		wait.ignoring(NoSuchElementException.class);
		driver.manage().window().maximize();
		driver.get("https://testingshastra.com");
		driver.findElement(By.xpath("//a[@href='/assignments']")).click();
		driver.findElement(By.xpath("//*[text()='Drag And Drop Assignment']")).click();
	WebElement	javvva =driver.findElement(By.xpath("//*[text()[contains(.,'Automation testing (Python)')]]"));
	WebElement	javvvb =driver.findElement(By.xpath("//*[text()[contains(.,'Automation testing (java)')]]"));
	WebElement	javvvc =driver.findElement(By.xpath("//*[text()[contains(.,'Java full stack Development')]]"));
	WebElement	javvvd =driver.findElement(By.xpath("//*[text()[contains(.,'MERN full Stack Development')]]"));
	WebElement destt = driver.findElement(By.xpath("//*[text()[contains(.,'Add Course')]]"));
	Actions action = new Actions(driver);
	action.clickAndHold(javvva).moveToElement(destt).release().perform();
	wait.until(ExpectedConditions.elementToBeSelected((By.xpath("//*[text()[contains(.,'Automation testing (java)')]]"))));
	action.clickAndHold(javvvb).moveToElement(destt).release().perform();
	action.clickAndHold(javvvc).moveToElement(destt).release().perform();
	action.clickAndHold(javvvd).moveToElement(destt).release().perform();
	
	
	}

	public static void main(String[] args) {
		// new ActionsDemo01().mouseHover01();
		// new ActionsDemo01().dragAndDrop1();
		// new ActionsDemo01().dragandDrop12();
		//new ActionsDemo01().dragAndDrop33();
		new  ActionsDemo01().dragAndDrop04();
	}
}
