package parctice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotImage {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/search?q=iphone");
		File src=driver.findElement(By.xpath("//img[@alt='APPLE iPhone SE (Black, 64 GB)']"))
		.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Iphone.PNG");
		Files.copy(src, dest);
		driver.close();
	}

}
