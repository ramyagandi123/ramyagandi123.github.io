package rivirtual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Screenshot/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://rivirtual.net/preview/");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@class='opening-close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()=\" Residential \"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("l_name")).sendKeys("Gandi");
        Thread.sleep(2000);
        
	}

}
