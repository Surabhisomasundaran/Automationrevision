package windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandleDemo 
{
	public static void main(String args[]) 
	{
	System.setProperty("Webdriver.chrome.driver","C:\\Tools\\Webdriver_Chrome\\109\\chromedriver_109");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.obsqurazone.com/window-popup.php");
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/a")).click();
	String parent=driver.getWindowHandle();	//handling current window
	System.out.println(parent);//
	Set<String>handles =driver.getWindowHandles();
	for(String y:handles)
	{
		if(!y.equals(parent)) 
		{
			driver.switchTo().window(y);
		System.out.println(y);
		driver.findElement(By.id("email")).sendKeys("surabhiperooli@icloud.com");
		}
	}

	
}
}