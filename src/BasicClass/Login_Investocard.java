package BasicClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Investocard 
{
	public static void main (String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.investosquare.com/mutual_funds");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("bswati46@gmail.com");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Setup@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);


	}
	

}
