package parctice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Nitheesha/Desktop/upload.html");
		
		Screen screen=new Screen();
		String path=System.getProperty("user.dir");
		Pattern chooseFile=new Pattern(path+"\\images\\choose.PNG");
		Pattern file=new Pattern(path+"\\images\\File.PNG");
		Pattern open=new Pattern(path+"\\images\\Open.PNG");
		
		screen.click(chooseFile);
		screen.type(file, "C:\\Users\\Nitheesha\\Desktop\\AppiumDoc.txt");
		screen.click(open);
	}

}
