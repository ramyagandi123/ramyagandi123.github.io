package rivirtual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BusinessCardLandingPage {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://rivirtual.net/preview/cash-reward");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='opening-close']")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("f_name")).sendKeys("Ganesh");
    Thread.sleep(2000);
    driver.findElement(By.name("l_name")).sendKeys("Vavilala");
    Thread.sleep(2000);
    driver.findElement(By.name("email")).sendKeys("ramya10@rivirtuals.com");
    Thread.sleep(2000);
    driver.findElement(By.name("phone")).sendKeys("9876789876");
    Thread.sleep(2000);
    driver.findElement(By.id("description")).sendKeys("Understand market trends and how to analyze them effectively.");
    Thread.sleep(2000);
    driver.findElement(By.id("newCashbtn")).click();
    Thread.sleep(2000);
    driver.close();
    

	}

}
