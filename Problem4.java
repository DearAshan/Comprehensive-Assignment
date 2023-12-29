package seleniumProblem4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Problem4 {

	public static WebDriver driver;

	@BeforeClass
	public static void systemSetup() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashan\\Desktop\\Cucumber\\com.virtusa.maven.cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Script Start Execution");
		driver.get("https://www.automationanywhere.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='onetrust-button-group']//button[@id='onetrust-accept-btn-handler']"))
				.click();

	}
   @AfterClass
	public static void driverClose() throws Exception {

		driver.quit();
		Thread.sleep(1000);
		System.out.println("Script End Execution");

	}
   @Test(priority = 1,enabled=true,timeOut=7000)
	public static void productsValidation() throws Exception {

		WebElement buttonPresent = driver.findElement(By.xpath("//a[@href='/products']"));

		if (buttonPresent.isDisplayed()) {

			System.out.println("Products Label Present in Home Page");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

			buttonPresent.click();

			String expectedUrl = "https://www.automationanywhere.com/products";
			String actualUrl = driver.getCurrentUrl();

			Assert.assertEquals(actualUrl, expectedUrl);
			System.out.println("Succesfully Navigate to Products Page");
		}

		else {

			System.out.println("Couldn't Locate Products Label");
		}

	}
   @Test(priority = 2,enabled=true,timeOut=7000)
	public static void solutionsValidation() throws Exception {

		WebElement buttonPresent = driver.findElement(By.xpath("//a[@href='/solutions']"));

		if (buttonPresent.isDisplayed()) {

			System.out.println("Solutions Label Present in Home Page");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			buttonPresent.click();

			String expectedUrl = "https://www.automationanywhere.com/solutions";
			String actualUrl = driver.getCurrentUrl();

			Assert.assertEquals(actualUrl, expectedUrl);
			System.out.println("Succesfully Navigate to Solutions Page");

		}

		else {

			System.out.println("Couldn't Locate Solutions Label");
		}

	}
   @Test(priority = 3,enabled=true,timeOut=7000)
	public static void resourcesValidation() throws Exception {

		WebElement buttonPresent = driver.findElement(By.xpath("//a[@href='/resources']"));

		if (buttonPresent.isDisplayed()) {

			System.out.println("Resources Label Present in Home Page");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			buttonPresent.click();

			String expectedUrl = "https://www.automationanywhere.com/resources";
			String actualUrl = driver.getCurrentUrl();

			Assert.assertEquals(actualUrl, expectedUrl);
			System.out.println("Succesfully Navigate to Resources Page");

		}

		else {

			System.out.println("Couldn't Locate Resources Label");
		}

	}
   @Test(priority = 4,enabled=true,timeOut=7000)
	public static void companyValidation() throws Exception {

		WebElement buttonPresent = driver.findElement(By.xpath("//a[@href='/company/about-us']"));

		if (buttonPresent.isDisplayed()) {

			System.out.println("Company Label Present in Home Page");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			buttonPresent.click();

			String expectedUrl = "https://www.automationanywhere.com/company/about-us";
			String actualUrl = driver.getCurrentUrl();

			Assert.assertEquals(actualUrl, expectedUrl);
			System.out.println("Succesfully Navigate to Company Page");
		}

		else {

			System.out.println("Couldn't Locate Products Label");
		}

	}
   @Test(priority = 5,enabled=true,timeOut=7000)
	public static void intelligentAutomationValidation() throws Exception {

		WebElement buttonPresent = driver.findElement(By.xpath("//a[@href='/rpa']"));

		if (buttonPresent.isDisplayed()) {

			System.out.println("Intelligent Automation Label Present in Home Page");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			buttonPresent.click();

			String expectedUrl = "https://www.automationanywhere.com/rpa";
			String actualUrl = driver.getCurrentUrl();

			Assert.assertEquals(actualUrl, expectedUrl);
			System.out.println("Succesfully Navigate to Intelligent Automation Page");
		}

		else {

			System.out.println("Couldn't Locate Intelligent Automation Label");
		}

	}



}
