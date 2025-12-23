import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class latestautomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopal\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
        WebElement search = driver.findElement(By.name("search_query"));						
        search.sendKeys("kalki");
        Thread.sleep(2000);
        driver.findElement(By.id("search-icon-legacy")).click();
        driver
		
	}
}

