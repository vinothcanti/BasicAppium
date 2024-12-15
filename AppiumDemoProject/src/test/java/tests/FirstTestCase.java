package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class FirstTestCase extends BaseClass{

	@Test
	public void testRun() {
		driver.get("");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).sendKeys(Keys.ENTER);
		
		System.out.println("Completed test one");
		
	}
}
