package rivirtual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactus {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Screenshot/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://rivirtual.net/preview/");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@class='opening-close']")).click();
          Thread.sleep(2000);
	      driver.findElement(By.name("Contact")).click();
          Thread.sleep(2000);
          //driver.findElement(By.name("f_name")).sendKeys("Raghu");
          //Thread.sleep(2000);
          //driver.findElement(By.name("l_name")).sendKeys("Gandi");
          //Thread.sleep(2000);
}
}
