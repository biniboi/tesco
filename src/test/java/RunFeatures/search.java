package RunFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

import PageFactory.BrowserFactory;
import PageFactory.Enviroments;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import pageObjects.ObjectsRepo;
public class search {

	WebDriver driver = BrowserFactory.getBrowser("Chrome");


@Given("^I'm on the homepage$")
public void I_m_on_the_homepage() {
	driver.get(Enviroments.URL);
	if(driver.equals(driver))
	{System.out.println("Chrome Browser Started");}
    throw new PendingException();
}



@When("^I click search button$")
public void I_click_search_button() {
ObjectsRepo.SearchButton(driver).click();
    throw new PendingException();
}

@Then("^I should see Please enter a search term alert message$")
public void I_should_see_Please_enter_a_search_term_alert_message() {
    assertEquals("Please enter a search term", ObjectsRepo.AlertMessage(driver).getText());
    throw new PendingException();
}

@When("^user search for \"([^\"]*)\"$")
public void user_search_for(String arg1) {
	ObjectsRepo.SearchBox(driver).sendKeys(arg1);;
    throw new PendingException();
}

@Then("^the results should indicate, No result found$")
public void the_results_should_indicate_No_result_found() {
    assertEquals("Please enter a search term", ObjectsRepo.SearchResult(driver).getText());
    throw new PendingException();
}

@Then("^search page should be updated and indicate We didn't find any products to match X$")
public void search_page_should_be_updated_and_indicate_We_didn_t_find_any_products_to_match_X() {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^search page should be updated and indicate X amount results for product found$")
public void search_page_should_be_updated_and_indicate_X_amount_results_for_product_found() {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

@Then("^search page should be updated and indicate X and X amount results for product found$")
public void search_page_should_be_updated_and_indicate_X_and_X_amount_results_for_product_found() {
	BrowserFactory.closeAllDriver();
    throw new PendingException();
}

}

