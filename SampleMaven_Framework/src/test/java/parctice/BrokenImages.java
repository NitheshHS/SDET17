package parctice;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImages {
public static void main(String[] args) throws Throwable {
	WebDriverManager.firefoxdriver().setup();

	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://facebook.com");
	System.out.println(driver.getTitle());
	List<WebElement> images=driver.findElements(By.tagName("img"));
	for(WebElement image:images) {
		
		String getImage=image.getAttribute("src");
		
		HttpClient client=HttpClientBuilder.create().build();
		
		HttpGet http=new HttpGet(getImage);
		HttpResponse res = client.execute(http);
		int rescode=res.getCode();
		if(rescode>=400) {
			System.out.println("Broken image:-)"+getImage);
		}
		else {
			System.out.println("Valid image:-)"+getImage);
		}
	}
	driver.close();
}
}
