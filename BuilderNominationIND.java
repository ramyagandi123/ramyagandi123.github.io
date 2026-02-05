package rivirtual;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuilderNominationIND {
	public static void NominationForm() throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Screenshot/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	driver.get("https://rivirtual.in/real-estate-awards");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='opening-close']")).click();
	Thread.sleep(2000);
			Actions action=new Actions(driver);
	WebElement element=driver.findElement(By.xpath("//a[@class=\"cont_an butn_cont nominateBtn\"]"));
	action.moveToElement(element).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class=\"cont_an butn_cont nominateBtn\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("cog-0")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("cog-0-option-Coimbatore")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("cog-input-auto-0")).sendKeys("Lalitha");
	Thread.sleep(2000);
	driver.findElement(By.id("cog-input-auto-1")).sendKeys("Gandi");
	Thread.sleep(2000);
	driver.findElement(By.id("cog-2")).sendKeys("ramya2@rivirtuals.com");
	Thread.sleep(2000);
	driver.findElement(By.id("cog-3")).sendKeys("Sathish");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[1]//span[@class=\"el-radio__label\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("cog-5")).sendKeys("https://rivirtual.in/");
	Thread.sleep(2000);
	driver.findElement(By.id("cog-6")).sendKeys("ramya12@rivirtuals.com");
	Thread.sleep(2000);
	driver.findElement(By.id("cog-7")).sendKeys("9876667898");
	Thread.sleep(2000);
	driver.findElement(By.id("cog-8")).sendKeys("Throughout history and in contemporary times");
	Thread.sleep(2000);
	driver.findElement(By.id("cog-9")).sendKeys("The RiVirtual Real Estate Awards have already set a high standard for honoring innovation, sustainability, and leadership in real estate.");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class=\"cog-button__text\"]")).click();
	StringSelection str= new StringSelection("\"C:\\Users\\Dell\\Downloads\\popup_screenshot (2).png\"");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
	Thread.sleep(2000);
	Robot r=new Robot();
	
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//button[@class=\"el-button cog-button--has-status cog-button--save cog-button--secondary cog-button--navigation el-button--default cog-button\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("ramya3@rivirtuals.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()=\" Send\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class=\"cog-icon cog-i-ex\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class=\"el-button cog-button--has-status cog-button--primary cog-button--navigation cog-button--submit el-button--default cog-button\"]")).click();
	//Thread.sleep(2000);
	
}
}
