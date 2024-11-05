package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("Open Chrome browser")
	public void open_chrome_browser() {
		driver=new EdgeDriver();
	    
	}

	@Given("Open URL {string}")
	public void open_url(String string) {
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskstdin-21%26ref%3Dnav_signin%26adgrpid%3D1328211703591630%26hvadid%3D83013495293827%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D156428%26hvtargid%3Dkwd-83014163717471%3Aloc-90%26hydadcr%3D5621_2377279%26msclkid%3D8845d84ba3291cc81101beb43d0d7dcd&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    
	}

	@When("Login ID Login Password")
	public void login_id_login_password() {
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("7989587627");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("7989587627");
	    
	}

	@When("click on submit")
	public void click_on_submit() {
	   driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	}

	@Then("Redirect to  Home page")
	public void redirect_to_home_page() {
	    
	}




}
