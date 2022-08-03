package stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSearchSteps {
	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("user open the browser");
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}

	

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user is landing on google search page");
		driver.navigate().to("https://google.com");
		driver.switchTo().frame(0);
		WebElement noThanks = driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div > c-wiz > div > div > div > div.DRc6kd.bdn4dc > div.QlyBfb > button"));
		noThanks.click();
		driver.switchTo().defaultContent();
	}

	
	@When("insert enters a text in search box")
	public void insert_enters_a_text_in_search_box() {
		System.out.println("user enter the text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
	}

	@And("hits enter")
	public void hits_ente() throws InterruptedException{
		System.out.println("user hits the enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Then("user is navigate to search results")
	public void user_is_navigate_to_search_results() {
		System.out.println("user is on google result page");
		driver.getPageSource().contains("Online Course");
		driver.close();
		driver.quit();
	}


}
