package SampleCucumberExample;


import java.util.List;

import org.junit.Assert;
//import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
//import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinations {
    WebDriver driver;
	@Given("^As user i need to be mercury home page$")
	public void as_user_i_need_to_be_mercury_home_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://demo.guru99.com/test/newtours/");
	}

	@When("^user enter username$")
	public void user_enter_username() throws Throwable {
	   By mercury_username_locator=By.name("userName");
	   WebElement mercury_username_element=driver.findElement(mercury_username_locator);
	   mercury_username_element.sendKeys("mercury");
	}

	@Then("^verify username text box contains text or not$")
	public void verify_username_text_box_contains_text_or_not() throws Throwable {
		 By mercury_username_locator=By.name("userName");
		   WebElement mercury_username_element=driver.findElement(mercury_username_locator);
		   String uname = mercury_username_element.getAttribute("value"); 
		   Assert.assertEquals("mercury", uname);
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    driver.close();
	}
	/*
	 * @When("user enter password as {string}") public void
	 * user_enter_password_as(String pass) throws Throwable{ By
	 * mercury_username_locator=By.name("password"); WebElement
	 * mercury_username_element=driver.findElement(mercury_username_locator);
	 * mercury_username_element.sendKeys("mercury"); }
	 * 
	 * @Then("verify mercury password text box contains text or not") public void
	 * verify_mercury_password_text_box_contains_text_or_not() throws Throwable { By
	 * mercury_username_locator=By.name("password"); WebElement
	 * mercury_username_element=driver.findElement(mercury_username_locator); String
	 * uname = mercury_username_element.getAttribute("value");
	 * Assert.assertEquals("mercury", uname); }
	 * 
	 * @When("user enter mercury uname") public void
	 * user_enter_mercury_uname(DataTable table) throws Throwable{
	 * List<List<String>>info=table.raw(); String uname=info.get(2).get(0); By
	 * mercury_username_locator=By.name("userName"); WebElement
	 * mercury_username_element=driver.findElement(mercury_username_locator);
	 * mercury_username_element.sendKeys(uname);
	 * 
	 * }
	 * 
	 * @When("user enter mercury pass") public void
	 * user_enter_mercury_pass(DataTable table) {
	 * List<List<String>>info=table.raw(); String pass=info.get(2).get(0); By
	 * mercury_password_locator=By.name("password"); WebElement
	 * mercury_password_element=driver.findElement(mercury_password_locator);
	 * mercury_password_element.sendKeys(pass);
	 * 
	 * }
	 * 
	 * @Then("click on signin button") public void click_on_signin_button() { By
	 * mercury_submitbtn_locator=By.name("submit"); WebElement
	 * mercury_submitbtn=driver.findElement(mercury_submitbtn_locator);
	 * mercury_submitbtn.click(); }
	 * 
	 * @Then("verify url") public void verify_url() { String
	 * expectedURL="login success"; String actualURL=driver.getCurrentUrl(); boolean
	 * status=actualURL.contains(expectedURL); Assert.assertEquals(true, status); }
	 */
}
