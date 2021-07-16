package parctice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * status code 404 503
 */
public class BrokenLink {
	public static void main(String[] args) throws Throwable, IOException {
		WebDriverManager.firefoxdriver().setup();

		ChromeOptions op = new ChromeOptions();
		op.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		System.out.println(driver.getTitle());
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//HashMap<Integer, Integer> map=new HashMap<String, String>();
		
		
		for(WebElement link:links) {
			String url=link.getAttribute("href");
			HttpURLConnection httpCon = (HttpURLConnection)new URL(url).openConnection();
			httpCon.connect();
			
			int rescode=httpCon.getResponseCode();
			if(rescode>=400) {
				System.out.println("Broken link:-)"+ url+"=>"+ rescode);
			}
			else
			{
				System.out.println("valid:-)"+ url+"=>"+ rescode);	
			}
		}

		driver.close();
	}

}
