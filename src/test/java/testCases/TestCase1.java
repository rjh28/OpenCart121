package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;

public class TestCase1 {

	 WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "G:\\Javaworkspace\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(29));
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
	}

	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}

	@Test
	public void registrationTest() {
		HomePage hp = new HomePage(driver);
		hp.MyAccountClick();
		hp.ClickRegister();
		RegistrationPage rp = new RegistrationPage(driver);
		rp.setFirstName("Sample");
		rp.setLastName("User");
		rp.setEmail("abc@test.com");
		rp.setPassword("admin123");
		rp.clicPrivecyBtn();
		rp.clicButton();
	}

}
