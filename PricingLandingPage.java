package rivirtual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PricingLandingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Screenshot/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rivirtual.net/usa/pricing");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='opening-close']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@type=\"radio\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()=\"Continue\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//label[2]//*[@type=\"checkbox\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[3]//button[text()=\"Continue\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class=\"np-input\"]")).sendKeys("Edward");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class=\"np-input legal\"]")).sendKeys("9876545678");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[3]//input[@class=\"np-input\"]")).sendKeys("ramya10@rivirtuals.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class=\"agree-checkbox\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[4]//button[@class=\"np-continue\"]")).click();;
	    Thread.sleep(2000);
	}

}
