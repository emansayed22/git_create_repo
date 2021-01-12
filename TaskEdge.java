package Edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TaskEdge {
	public static void main(String[] args) {
		
		
	
		String edgePath =	System.getProperty("user.dir") + "\\Driver\\MicrosoftWebDriver.exe";
	//	System.setProperty(key, value)
		System.setProperty("webdriver.edge.driver", edgePath);
		
		WebDriver driver = new EdgeDriver();
		
		 driver.navigate().to("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.quit();

	}

}

