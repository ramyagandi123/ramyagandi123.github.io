package rivirtual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Screenshot/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rivirtual.in/real-estate-service-awards");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='opening-close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"cont_an butn_cont nominateBtn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cog-0")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@aria-activedescendant=\"cog-0-option-Hyderabad\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class=\"cog-field cog-field--18 cog-col cog-col--12 cog-text cog-text--singleline\"]"));
		
		driver.findElement(By.id("cog-1")).sendKeys("Ram");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"el-radio__inner\"]")).click();//sendKeys("Throughout history and in contemporary times, several architects have consistently garnered acclaim and influenced the course of architecture.");
		Thread.sleep(2000);
		driver.findElement(By.id("cog-4")).sendKeys("https://rivirtual.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("cog-input-auto-0")).sendKeys("Sathya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title=\"Last\"]")).sendKeys("Gandi");
		Thread.sleep(2000);
		driver.findElement(By.id("cog-6")).sendKeys("ramya2@rivirtuals.com");
		Thread.sleep(2000);
		driver.findElement(By.id("cog-7")).sendKeys("9876767675");
		Thread.sleep(2000);
		//string filepath="";// TODO Auto-generated method stub

	}

}
