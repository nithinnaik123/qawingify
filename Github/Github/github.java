package Github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class github {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		WebElement usernametextfiled = driver.findElement(By.id("username"));
		usernametextfiled.sendKeys("Nithinnaik");
		WebElement passwordtextfield = driver.findElement(By.id("password"));
		passwordtextfield.sendKeys("NITHIN123");
		WebElement loginbutton = driver.findElement(By.id("log-in"));
		loginbutton.click();
		WebElement amountheader = driver.findElement(By.xpath("//table[@id='transactionsTable']//tr[1]/th[5]"));
		amountheader.click();
		driver.manage().window().minimize();
		driver.quit();
	}

}
