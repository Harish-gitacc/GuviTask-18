package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();                //WebDriver Initialization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500)); 
		driver.get("https://jqueryui.com/droppable/");                        
		driver.manage().window().maximize();
		
		WebElement wd = driver.findElement(By.className("demo-frame"));   //Switching to Frame
		driver.switchTo().frame(wd)
;		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));  //Locating Drag and Drop Elements
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
                String x =drop.getCssValue("background-color");   //getcssvalue is used to read the css attribute(to get the colour) 
		if(x.equals("rgba(255, 250, 144, 1)"))
		{
			System.out.println("Successfully dropped");
		}
		else
		{
			System.out.println("Dropped is failed");
		}
		String actualtext = driver.findElement(By.xpath("(//p[normalize-space()='Dropped!'])[1]")).getText();
		String expectedtext ="Dropped!";          //Verifying Drop
		
		
		if(actualtext.equalsIgnoreCase(expectedtext))      //Verification and Output
		{
			System.out.println("Frame is successfully dropped");
		}
		else
		{
			System.out.println("Frame is failed to dropp");
		}

	}

}

output:
Frame is successfully dropped
