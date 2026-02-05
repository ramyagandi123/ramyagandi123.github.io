package rivirtual;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Agent {

	public static void main(string[]args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
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
	      driver.findElement(By.name("otp")).sendKeys("320329");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("// button [text() ='Log In']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[text()=\" Manage Property\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@Class=\"btn btn-sm btn-success\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@value='Approve Selected Property']")).click();
	      Thread.sleep(2000);
	      try {
	            
	            driver.get("https://rivirtual.net/preview/empower/manage-realtors"); // Replace with your actual URL

	            // 3.  Find the pagination container.  This helps scope our search and makes it more robust.
	            WebElement paginationContainer = driver.findElement(By.xpath("//ul[contains(@class,\"pagination\")]"));  //  Adjust the xpath as needed.

	            // 4.  Determine the last page number (Dynamic)
	            int lastPage = getLastPageNumber(driver, paginationContainer);
	            if (lastPage == 0) {
	                System.out.println("Pagination not found or an error occurred.  Exiting.");
	                return;
	            }

	            // 5. Loop through the pages
	            for (int page = 1; page <= lastPage; page++) {
	                System.out.println("Navigating to page: " + page);

	                // a. Click the page number
	                // *Important*:  Adapt this XPath to match your Tailwind pagination structure *within* the container.
	                String pageXPath = ".//li/a[text()='" + page + "']";  //  Relative XPath to the container
	                WebElement pageLink = paginationContainer.findElement(By.xpath(pageXPath));
	                pageLink.click();

	                // 6. Wait for the page to load (Use a robust waiting strategy)
	                //   * Use a combination of waits to handle different loading scenarios.
	                waitForPageLoad(driver);

	                // b. Verify the page loaded correctly
	                //   *Important*:  Add your verification logic here.  This is crucial!
	                if (isPageLoaded(driver, page)) {
	                    System.out.println("Page " + page + " loaded successfully.");
	                } else {
	                    System.out.println("Page " + page + " load failed.");
	                }


	                // 7. Do your processing here (e.g., extract data)
	                //  Add your code to extract data from the current page.
	                //  Example:
	                // List<WebElement> items = driver.findElements(By.cssSelector(".product-item"));
	                // for (WebElement item : items) {
	                //     String productName = item.findElement(By.cssSelector(".product-name")).getText();
	                //     System.out.println("Product Name: " + productName);
	                // }
	            }

	            System.out.println("Finished processing all pages.");

	        } catch (Exception e) {
	            System.err.println("Error: " + e.getMessage());
	        } finally {
	            
	            driver.quit();
	        }
	    }

	private static int getLastPageNumber(WebDriver driver, WebElement paginationContainer) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void waitForPageLoad(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	private static boolean isPageLoaded(WebDriver driver, int page) {
		// TODO Auto-generated method stub
		return false;
	}

	    

	    //driver.close();

	
}


