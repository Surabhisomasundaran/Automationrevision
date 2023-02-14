package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo 
{
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("Webdriver.chrome.driver", "C:\\Tools\\Webdriver_Chrome\\109\\chromedriver_109");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
	//simple alert
	driver.findElement(By.className("btn-success")).click();
	Alert X=driver.switchTo() .alert();//simple alert so just  printing the text so creating an alert instance
	System.out.println(X.getText());
	Thread.sleep(5000);//for 5 sec delay
	X.accept();
	Thread.sleep(5000);
	
	//conformation alert
	driver.findElement(By.className("btn-warning")).click();
	Alert y=driver.switchTo() .alert();
	System.out.println(y.getText());
	Thread.sleep(5000);//for 5 sec delay
	y.accept();//if we want to dismiss use dismiss instead of accept
	Thread.sleep(5000);
	//driver.close();
	
	//prompt alert
	driver.findElement(By.className("btn-danger")).click();
	Alert z=driver.switchTo() .alert();
	System.out.println(z.getText());
	
	z.sendKeys("surabhi");
	Thread.sleep(5000);
	z.accept();
	Thread.sleep(5000);
	//driver.close();
	
	
	
}


}
