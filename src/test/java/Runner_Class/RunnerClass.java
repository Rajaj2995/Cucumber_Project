package Runner_Class;
import org.junit.AfterClass;



import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber_Project\\src\\test\\java\\features\\adatin.feature",
		glue="stepdefinition")


public class RunnerClass {
public static WebDriver driver;
	
	@BeforeClass
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\Cucumber_Project\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}

	
	
}
