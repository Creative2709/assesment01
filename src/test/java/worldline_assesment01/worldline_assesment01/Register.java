package worldline_assesment01.worldline_assesment01;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.ElementClickInterceptedException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import junit.framework.Assert;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.awt.AWTException;



public class Register {
	
	WebDriver driver;


@Given("I will navigate to the Admissions Portal login page")
public void i_will_navigate_to_the_admissions_portal_login_page() {
	 System.setProperty("webdriver.chrome.driver", "D:\\WORLDLINE\\Testing\\chromedriver_win32\\chromedriver.exe");

     driver = new ChromeDriver();
     driver.manage().window().maximize();
     
//     driver.get("https://www.makemytrip.com/railways/irctc-login.html");
   
}

@Then("I click the Create an Account link")
public void i_click_the_create_an_account_link() {
	
	// Write code here that turns the phrase above into concrete actions
  driver.get("https://www.makemytrip.com/railways/irctc-create-account.html");

	
}

@Then("I will be on the Register page")
public void i_will_be_on_the_register_page() {
	String expected_url = "https://www.makemytrip.com/railways/irctc-create-account.html";
	String current_url = driver.getCurrentUrl();
	Assert.assertEquals(expected_url, current_url);
    // Write code here that turns the phrase above into concrete actions
   
}

@Given("I have entered a Title")
public void i_have_entered_a_title() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[1]/div[1]/div[2]/input")).sendKeys("swapnil270900");
}    

@And("I have entered a First Name")
public void i_have_entered_a_first_name() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[2]/div[1]/div[2]/input")).sendKeys("Swapnil");
   
}

@And("I have entered a Surname")
public void i_have_entered_a_surname() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.cssSelector("input[placeholder='Enter your last Name']")).sendKeys("Jadhav");
}

@And("I have entered a Date of Birth")
public void i_have_entered_a_date_of_birth() throws InterruptedException{
	
	        JavascriptExecutor js = (JavascriptExecutor) driver;


	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[2]/div[2" +
	                "]/div[2]/input")));
	        WebElement dateIP = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[2]/div[2" +
	                "]/div[2]/input"));

	        js.executeScript("window.scrollBy(0,500)","");
	        if(dateIP.isDisplayed()){
	            Thread.sleep(5000);
	            dateIP.click();
	        }
	        if(dateIP.isEnabled()){
	            By dropDownMonth = By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/form/select[2]");
	            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait1.until(ExpectedConditions.visibilityOfElementLocated(dropDownMonth));
	            WebElement dropDownMonthSelect = driver.findElement(dropDownMonth);
	            Select dropDownMonthList = new Select(dropDownMonthSelect);
	            dropDownMonthList.selectByIndex(9);
	            Select dropDownYear = new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/form/select[2]")));
	            dropDownYear.selectByIndex(78);
	            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[2]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[4]/div[4]")).click();
	        }
	    }

@And("I have entered a Gender")
public void i_have_entered_a_gender() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[2]/div[3]/div[1]"));


   
}

@And("I have entered an Email")
public void i_have_entered_an_email() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[1]/div[1]/div[4]/input")).sendKeys("sj27092000@gmail.com");

}

@And("I have entered a Mobile")
public void i_have_entered_a_mobile() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("9112699066");
   
}

@And("I have entered a Password")
public void i_have_entered_a_password() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[1]/div[2]/div[4]/input")).sendKeys("Testing123");
}


@And("I have entered a Password Reminder Question")
public void i_have_entered_a_password_reminder_question() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[1]/div[3]/div[2]/select"));
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[1]/div[3]/div[2]/select/option[3]")).click();
}

@And("I have entered a Password Reminder Answer")
public void i_have_entered_a_password_reminder_answer() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/div[1]/div[3]/div[4]/input")).sendKeys("abc123");
}



@Then("I have entered residential address")
public void i_have_entered_residential_address() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.cssSelector("input[placeholder='Enter your residential address']")).sendKeys("Akurdi, Pune");

	
}

@Then("I have entered pincode")
public void i_have_entered_pincode() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.cssSelector("input[placeholder='Enter your Pincode']")).sendKeys("411033");
}

@Then("I have entered alternate number")
public void i_have_entered_alternate_number() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.cssSelector("input[placeholder='Mobile Number']")).sendKeys("2341121111");
}


@When("I click on the Create Account button")
public void i_click_on_the_create_account_button() throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver;

	  js.executeScript("window.scrollBy(800,500)","");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/main/div[3]/div[1]/button")).click();
      								
}
	@Then("User should display error message")
	public void user_should_display_error_message() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("failed to create account.");
	}

}





