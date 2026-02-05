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
import org.testng.annotations.Test;

public class BuilderAwardsLandingPageIND {

	

	@Test
public static void MouseHover() throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/Screenshot/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rivirtual.in/real-estate-awards");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='opening-close']")).click();
		Thread.sleep(2000);
		//Mouse hover effects
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//a[@class=\"cont_an butn_cont nominateBtn\"]"));
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.xpath("//*[@type=\"submit\"]"));
		action.moveToElement(element1).perform();

		Thread.sleep(2000);
		WebElement element2=driver.findElement(By.xpath("//a[text()=\"Mumbai\"]"));
		action.moveToElement(element2).perform();
		Thread.sleep(2000);
		WebElement element3=driver.findElement(By.xpath("//a[text()=\"Delhi\"]"));
		action.moveToElement(element3).perform();
		Thread.sleep(2000);
		WebElement element4=driver.findElement(By.xpath("//a[text()=\"Chennai\"]"));
		action.moveToElement(element4).perform();
		Thread.sleep(2000);
		WebElement element5=driver.findElement(By.xpath("//a[text()=\"Pune\"]"));
		action.moveToElement(element5).perform();
		Thread.sleep(2000);
		WebElement element6=driver.findElement(By.xpath("//a[text()=\"Kolkata\"]"));
		action.moveToElement(element6).perform();
		Thread.sleep(2000);
		WebElement element7=driver.findElement(By.xpath("//a[text()=\"Hyderabad\"]"));
		action.moveToElement(element7).perform();
		Thread.sleep(2000);
		WebElement element8=driver.findElement(By.xpath("//a[text()=\"Bangalore\"]"));
		action.moveToElement(element8).perform();
		Thread.sleep(2000);
		WebElement element9=driver.findElement(By.xpath("/html//body//div[1]//div[2]//a[text()=\"Nominate Now \"]"));
		action.moveToElement(element9).perform();
		Thread.sleep(2000);
		WebElement element10=driver.findElement(By.xpath("/html//body//div[2]//div[2]//a[text()=\"Nominate Now \"]"));
		action.moveToElement(element10).perform();
		Thread.sleep(2000);
		WebElement element11=driver.findElement(By.xpath("/html//body//div[2]//div[3]//a[text()=\"Nominate Now \"]"));
		action.moveToElement(element11).perform();
		Thread.sleep(2000);
		WebElement element12=driver.findElement(By.xpath("/html//body//div[2]//div[4]//a[text()=\"Nominate Now \"]"));
		action.moveToElement(element12).perform();
		Thread.sleep(2000);
		WebElement element13=driver.findElement(By.xpath("/html//body//div[2]//div[5]//a[text()=\"Nominate Now \"]"));
		action.moveToElement(element13).perform();
		Thread.sleep(2000);
		WebElement element14=driver.findElement(By.xpath("/html//body//div[2]//div[6]//a[text()=\"Nominate Now \"]"));
		action.moveToElement(element14).perform();
		Thread.sleep(2000);
		WebElement element15=driver.findElement(By.xpath("//button[@class=\"el-button cog-button--secondary cog-upload__upload-button el-button--default cog-button\"]"));
		action.moveToElement(element15).perform();
		Thread.sleep(2000);
		WebElement element16=driver.findElement(By.xpath("//button[@class=\"el-button cog-button--has-status cog-button--save cog-button--secondary cog-button--navigation el-button--default cog-button\"]"));
		action.moveToElement(element16).perform();
		Thread.sleep(2000);
		WebElement element17=driver.findElement(By.xpath("//button[@class=\"el-button cog-button--has-status cog-button--primary cog-button--navigation cog-button--submit el-button--default cog-button\"]"));
		action.moveToElement(element17).perform();
		Thread.sleep(2000);
		{
	      	  System.out.print(driver.getTitle());
	        }
	        
	        Thread.sleep(2000);
	        driver.	quit();
	        
		}
	
		//Nomination form
		@Test
		
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
		driver.findElement(By.id("cog-3")).sendKeys("Ganesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@role=\"radio\"]")).click();
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
		driver.findElement(By.xpath("//button[@class=\"el-button cog-button--secondary cog-upload__upload-button el-button--default cog-button\"]")).click();
		Thread.sleep(2000);
		StringSelection str= new StringSelection("\"C:\\Users\\Dell\\OneDrive\\Pictures\\Screenshots\\Screenshot 2025-05-22 153027.png\"");
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
		
		{
      	  System.out.print(driver.getTitle());
        }
        
        Thread.sleep(2000);
        driver.	quit();
        
	}

		//Functionality*****************
@Test
		public static  void Dropdown()throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","./src/main/resources/Screenshot/chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.get("https://rivirtual.in/real-estate-awards");
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//button[@class='opening-close']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("categorys")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[text()=\"Realtors\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	      Thread.sleep(2000);
	      {
        	  System.out.print(driver.getTitle());
          }
          
          Thread.sleep(2000);
          driver.quit();
          
	      }
	}
