package seleniumProblem3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Problem3 {

	public static WebDriver driver;
    @BeforeClass
	public static void systemSetup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashan\\Desktop\\Cucumber\\com.virtusa.maven.cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Script Start Execution");
		driver.get("https://www.automationanywhere.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   	driver.findElement(By.xpath("//div[@id='onetrust-button-group']//button[@id='onetrust-accept-btn-handler']")).click();


	}

    @AfterClass
	public static void driverClose() throws Exception {

		driver.quit();
		Thread.sleep(1000);
		System.out.println("Script End Execution");

	}
    @Test(priority = 1,enabled=true,timeOut=500)
 
	public static void logoValidation() throws Exception {

		

		boolean logoPresent = driver.findElement(By.xpath("//a[@class='coh-link header-logo']")).isDisplayed();

		if (logoPresent) {

			System.out.println("Automation Anywhere Logo is Present");

		} else {

			System.out.println("Couldn't Locate Logo");
		}

	}
    @Test(priority = 2,enabled=true,timeOut=7000)
	public static void requestDemoBttnValidation() throws Exception {

		WebElement buttonPresent = driver.findElement(By.xpath("//a[@title='Request demo']"));

		if (buttonPresent.isDisplayed()) {

			System.out.println("Request Demo Button is Present");

			buttonPresent.click();

			System.out.println("Request Demo Button is Clickable");
		}

		else {

			System.out.println("Request Demo Button Couldn't Locate");
		}

	}


}
