package commands;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsselectAndClickCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Tools\\Webdriver_Chrome\\109\\chromedriver_109.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		//driver.findElement(By.className("form-check-label")).click();
	WebElement x=driver.findElement(By.xpath("//*[@id=\"gridCheck\"]"));//select the x path of te
	x.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(x.isSelected());
		
	}

}
