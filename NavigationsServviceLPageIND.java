package rivirtual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsServviceLPageIND {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Screenshot/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rivirtual.in/real-estate-service-awards");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='opening-close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("categorys")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Construction Services\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	}

}
