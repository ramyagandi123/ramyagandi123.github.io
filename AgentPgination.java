package rivirtual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgentPgination {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src\\main\\resources\\httpswww.zomato.com.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://rivirtual.net/preview/empower/login");
	      Thread.sleep(2000);
	      driver.findElement(By.name("email")).sendKeys("info@rivirtual.net");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("admin");
        Thread.sleep(2000);
	      driver.findElement(By.name("remember")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("// button [text() ='Log In']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.name("otp")).sendKeys("523902");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("// button [text() ='Log In']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[text()=\" Manage Property\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@Class=\"btn btn-sm btn-success\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@value='Approve Selected Property']")).click();
	      Thread.sleep(2000);
	      int page=1;
	      for(int page1=1;page1<=12;page1++)
	      {
	    	  if(page1==12)
	    	  {
	    		  driver.findElement(By.xpath("//*[@Class=\"btn btn-sm btn-success\"]")).click();
	    	      Thread.sleep(2000);
	    	      driver.findElement(By.xpath("//a[text()=\"116\"]")).click();
	    	      Thread.sleep(2000);
	    	      driver.findElement(By.xpath("//*[@value='Approve Selected Property']")).click();
	    	      Thread.sleep(2000);
	    	  }
	    	  page1++;

	      }
	}
}


