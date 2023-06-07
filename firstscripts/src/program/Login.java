package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		WebDriver d = (WebDriver) new ChromeDriver();
		d.get("https://shop.tetonelectronics.com/login");
		d.findElement(By.id("name")).sendKeys("mortuja@gmail.com");
		d.findElement(By.id("password")).sendKeys("abc123@");
		d.findElement(By.xpath("/html/body/main/div/div/main/section/div/div[2]/form/div[4]/button")).click();
		String u = d.getCurrentUrl();
		
		if(u.equals("https://www.linkedin.com/feed/"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case falied");
		}
		
		d.close();

	}

}
