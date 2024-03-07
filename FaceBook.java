package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500)); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	//Filling out the Sign-up Form	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("dabo");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("h");
	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("dabon53489@hidelux.com");
	driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("dabon53489@hidelux.com");
	driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Hfgda@22082020");
	
        //Selecting Date of Birth
	WebElement select1 = driver.findElement(By.name("birthday_day"));
	Select DropDay = new Select(select1);
	DropDay.selectByValue("11");
	
	WebElement Select2 = driver.findElement(By.name("birthday_month"));
	Select DropMonth = new Select(Select2);
	DropMonth.selectByValue("5");
	
	WebElement Select3 = driver.findElement(By.name("birthday_year"));
	Select DropYear = new Select(Select3);
	DropYear.selectByValue("1985");
	
        //Clicking on Gender
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[2]/input[1]")).click();
	
        //Submitting the Form
	driver.findElement(By.xpath("//button[contains(@name,'websubmit')]")).click();
	}

}

