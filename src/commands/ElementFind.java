package commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", "C:\\Tools\\Webdriver_Chrome\\109\\chromedriver_109");
WebDriver driver=new ChromeDriver();
driver.get("https://selenium.obsqurazone.com/index.php");
WebElement x=driver.findElement(By.tagName("h3"));
System.out.println(x.getText());
List<WebElement> y=driver.findElements(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul"));
for (WebElement element:y)
{
	System.out.println(element.getText());
	
}
driver.get("https://selenium.obsqurazone.com/table-pagination.php");
List<WebElement>z=driver.findElements(By.xpath("/html/body/section/div/div/div[1]/div/div"));

//for(WebElement element:z)
//{
	//System.out.println(element.getText());
//}
for(int i=0;i<z.size();i++)
{
	System.out.println(z.get(i).getText());
}

	}

}
