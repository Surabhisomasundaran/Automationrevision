package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpart1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\Tools\\Webdriver_Chrome\\109\\chromedriver_109");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		WebElement a=driver.findElement(By.xpath("//a[@class='nav-link']"));//home
		System.out.println(a.getText());
		WebElement b=driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));//input form
		System.out.println(b.getText());

	}
	

}
