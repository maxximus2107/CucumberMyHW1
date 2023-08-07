package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BankAndCashPage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	private LoginPage loginPage;
	private BankAndCashPage bankAndCashPage;

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		initDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		bankAndCashPage = PageFactory.initElements(driver, BankAndCashPage.class);
	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String loginData, String field) {
		switch (field) {
		case "username":
			loginPage.enterUserName(loginData);
			break;
		case "password":
			loginPage.enterPassword(loginData);
			break;
		default:
			System.out.println("Unable to pass iteration through field: " + field);
			Assert.fail();
		}
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String clickAction) {
		switch (clickAction) {
		case "login":
			loginPage.clickSignInButton();
			break;
		case "bankCash":
			bankAndCashPage.clickBankAndCashElement();
			;
			break;
		case "newAccount":
			bankAndCashPage.clickNewAccountMenuItem();
			;
			break;

		default:
			System.out.println("Unknown click action: " + clickAction);
			Assert.fail();
		}
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@And("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String data, String field) {
		switch (field) {
		case "accountTitle":
			bankAndCashPage.enterAccountTitle(data);
			break;
		case "description":
			bankAndCashPage.enterDescription(data);
			break;
		case "initialBalance":
			bankAndCashPage.enterInitialBalance(data);
			break;
		case "accountNumber":
			bankAndCashPage.enterAccountNumber(data);
			break;
		case "contactPerson":
			bankAndCashPage.enterContactPerson(data);
			break;
		case "Phone":
			bankAndCashPage.enterPhone(data);
			break;
		case "internetBankingURL":
			bankAndCashPage.enterInternetBankingURL(data);
			break;
		default:
			System.out.println("Unknown field: " + field);
			Assert.fail();
		}
	}

	//@And("User clicks on {string}")
	public void user_clicks_on_to(String clickAction) {
		switch (clickAction) {
		case "bankCash":
			bankAndCashPage.clickBankAndCashElement();
			;
			break;
		// Add more cases as needed
		default:
			System.out.println("Unknown click action: " + clickAction);
			Assert.fail();
		}
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {

		String expectedMessage = "Account created successfully";
		String actualMessage = bankAndCashPage.getSuccessMessage();

		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}