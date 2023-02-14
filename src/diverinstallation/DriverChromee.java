package diverinstallation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChromee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Tools\\Webdriver_Chrome\\109\\chromedriver_109");
		WebDriver driver=new ChromeDriver();
	}

}
