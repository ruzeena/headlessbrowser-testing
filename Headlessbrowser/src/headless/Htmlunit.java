package headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Htmlunit {
	WebDriver driver;
	
	@Test
	public void method(){
		
		driver =new HtmlUnitDriver();
		driver.get("http://www.facebook.com");
		String title= driver.getTitle();
		System.out.println(title);
		
		
		
	}

}
