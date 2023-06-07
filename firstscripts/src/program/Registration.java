package program;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");

        
        WebDriver d = (WebDriver) new ChromeDriver();
        d.manage().window().maximize();
        
        
        d.get("https://shop.tetonelectronics.com/login");

        WebElement registerButton = d.findElement(By.xpath("[/html/body/main/div/div/main/section/div/div[3]/p[2], 'register')]"));
        registerButton.click();

       
        WebElement firstNameField = d.findElement(By.id("name"));
        firstNameField.sendKeys("Mortuja");

        WebElement emailField = d.findElement(By.xpath("[/html/body/main/div/div/main/section/div/div[2]/form/div[2]/div/input]"));
        emailField.sendKeys("mortuja@gmail.com");

        WebElement passwordField = d.findElement(By.id("mobile"));
        passwordField.sendKeys("01710000000");
        
        WebElement passwordField = d.findElement(By.id("password"));
        passwordField.sendKeys("abc123@");

        
        WebElement termsCheckbox = d.findElement(By.id("checkbox-signin"));
        termsCheckbox.click();

      
        WebElement submitButton = d.findElement(By.xpath("[/html/body/main/div/div/main/section/div/div[2]/form/div[6]/button, 'REGISTER')]"));
        submitButton.click();

       
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

     
        if (d.getPageSource().contains("Thank you for registering!")) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed!");
        }

        d.close();
    }
}