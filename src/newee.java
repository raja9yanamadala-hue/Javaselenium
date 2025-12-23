import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newee {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gopal\\Downloads\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.in");
	}

}