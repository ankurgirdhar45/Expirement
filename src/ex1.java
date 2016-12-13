import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ex1 {

	@Test
	public void ru()
	{
		WebDriver d = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "chrmedriver.exe");
		d.get("https://www.facebook.com");
		
	}

}
