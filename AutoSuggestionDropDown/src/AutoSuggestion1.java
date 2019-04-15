import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;
public class AutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\stuff\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("indi");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		//String str=driver.findElement(By.xpath("//input[@id='autocomplete']")).getText();
		//System.out.println(str);
		int i=0;
		JavascriptExecutor js= (JavascriptExecutor)driver;
	     String script= "return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(script);
		//System.out.println(text);
		
		while(!text.equalsIgnoreCase("India"))
		{
			i++;
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			script="return document.getElementById(\"autocomplete\").value;";
			text=(String) js.executeScript(script);
			
			if(i>2) {
				break;
			}				
			
		}
		System.out.println(text);
		
		
		
		
	}

}
