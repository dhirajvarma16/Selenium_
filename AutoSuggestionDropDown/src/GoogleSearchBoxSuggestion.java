import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchBoxSuggestion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\stuff\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Indi");
		
	List<WebElement> list=	driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
    Thread.sleep(5000);
	System.out.println("The number of auto suggestion are" + list.size());
	
	for(int i=1;i<list.size();i++)
	{
	System.out.println(list.get(i).getText());	
	if(list.get(i).getText().contains("india world cup squad")) {
		list.get(i).click();
		break;
	}
	
	}
	
	}

}
