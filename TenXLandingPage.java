package rivirtual;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class TenXLandingPage {
	
	@Test
	public static void Tenx() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	     
	      driver.manage().window().maximize();
	      driver.get("https://rivirtual.net/preview/10x");
	      //Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@class='opening-close']")).click();
          //Thread.sleep(2000);
          driver.findElement(By.name("f_name")).sendKeys("Raghu");
          //Thread.sleep(2000);
          driver.findElement(By.name("l_name")).sendKeys("Gandi");
          //Thread.sleep(2000);
          driver.findElement(By.name("email")).sendKeys("ramya12@rivirtuals.com");
          //Thread.sleep(2000);
          driver.findElement(By.name("phone")).sendKeys("9876543298");
          //Thread.sleep(2000);
          driver.findElement(By.id("description")).sendKeys("Understand market trends and how to analyze them effectively.");
          //Thread.sleep(2000);
          driver.findElement(By.id("newCashbtn")).click();
          {
        	  System.out.print(driver.getTitle());
          }
          
          Thread.sleep(2000);
          driver.quit();
          
	      }
@Test
	public static void Reward() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./src/main/resources/Screenshot/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://rivirtual.net/preview/cash-reward");
    //Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='opening-close']")).click();
    //Thread.sleep(2000);
    driver.findElement(By.name("f_name")).sendKeys("Ganesh");
    //Thread.sleep(2000);
    driver.findElement(By.name("l_name")).sendKeys("Vavilala");
    //Thread.sleep(2000);
    driver.findElement(By.name("email")).sendKeys("ramya10@rivirtuals.com");
    //Thread.sleep(2000);
    driver.findElement(By.name("phone")).sendKeys("9876789876");
    //Thread.sleep(2000);
    driver.findElement(By.id("description")).sendKeys("Understand market trends and how to analyze them effectively.");
    //Thread.sleep(2000);
    driver.findElement(By.id("newCashbtn")).click();
    {
    	System.out.print(driver.getTitle());
    }
    Thread.sleep(2000);
    driver.close();
    
}
}
