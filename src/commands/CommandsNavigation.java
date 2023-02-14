package commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandsNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "C:\\Tools\\Webdriver_Chrome\\109\\chromedriver_109");
WebDriver driver=new ChromeDriver();
driver.get("https://selenium.obsqurazone.com/index.php");
driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.close();
driver.quit();
	}

}
