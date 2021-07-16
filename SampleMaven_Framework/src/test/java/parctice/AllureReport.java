package parctice;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class AllureReport {
	
	@Epic("VTIG-1 creat login")
	@Story("VTIG -11 test login")
	@Severity(value = SeverityLevel.BLOCKER)
	@Test
	public void loginTest() {
		
		System.out.println("login");
		Assert.assertTrue(false);
	}
	
	@Epic("VTIG-2 buy product")
	@Story("VTIG -12 add product to cart and buy")
	@Severity(value = SeverityLevel.MINOR)

	@Test
	public void productCartTest() {
		System.out.println("login");
	}

}
