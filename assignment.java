package FirstTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		
		 String chromePath = System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", chromePath);
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.google.com.ar/");
		 
		 
		 driver.findElement(By.partialLinkText("Eng")).click();
		 driver.findElement(By.id("gb_70")).click();
		 driver.findElement(By.xpath("//button[@jsname=\"Cuz2Ue\"]")).click();
		 
		 Thread.sleep(2000);

		String getUrl = driver.getCurrentUrl();
		
		
		  System.out.println(getUrl);
		  System.out.println(getUrl.contains("/signin/v2/forgotemail"));
		 driver.quit();

	}

}
