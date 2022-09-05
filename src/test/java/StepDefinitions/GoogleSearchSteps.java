package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	 WebDriver driver=null;
	 
	@Given("browser is open")
	public void browser_is_open() {
	
	
	  String projectPath=System.getProperty("user.dir");
	  System.out.println("my path is : "+ projectPath );
	  System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver");
	  
	  //Static Path
	  System.setProperty("webdriver.chrome.driver","/home/root328/Inexture/drivers/chromedriver_linux64/chromedriver");
	
	  driver = new ChromeDriver();
//	  driver.manage().window().maximize(); 
	
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	  driver.navigate().to("https://www.google.com/");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
	  driver.findElement(By.name("q")).sendKeys("inexture Solutins LLP");
	  Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	}

	@Then("user is navigated to the search reasults website.")
	public void user_is_navigated_to_the_search_reasults_website() {
	  System.out.println("inside results");
	  driver.getPageSource().contains("About Us");
	  driver.close();
	  driver.quit();
	}



}
