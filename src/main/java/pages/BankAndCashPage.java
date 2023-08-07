package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCashPage extends TestBase {

	WebDriver driver;

	public BankAndCashPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement bankAndCashMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
    WebElement newAccountMenuItem;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
    WebElement accountTitleField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
    WebElement descriptionField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
    WebElement initialBalanceField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
    WebElement accountNumberField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
    WebElement contactPersonField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
    WebElement phoneField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
    WebElement internetBankingURLField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
    WebElement submitButton;
    
    @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]")
    WebElement successMessageElement;
    
    

    public void clickBankAndCashElement() {
        bankAndCashMenu.click();
    }

    public void clickNewAccountMenuItem() {
        newAccountMenuItem.click();
    }

    public void enterAccountTitle(String accountTitle) {
        accountTitleField.sendKeys(accountTitle);
    }

    public void enterDescription(String description) {
        descriptionField.sendKeys(description);
    }

    public void enterInitialBalance(String initialBalance) {
        initialBalanceField.sendKeys(initialBalance);
    }

    public void enterAccountNumber(String accountNumber) {
        accountNumberField.sendKeys(accountNumber);
    }

    public void enterContactPerson(String contactPerson) {
        contactPersonField.sendKeys(contactPerson);
    }

    public void enterPhone(String phone) {
        phoneField.sendKeys(phone);
    }

    public void enterInternetBankingURL(String internetBankingURL) {
        internetBankingURLField.sendKeys(internetBankingURL);
    }

    public void submitAccountCreation() {
        submitButton.click();
    }

    
    public String getSuccessMessage() {
        return successMessageElement.getText(); 
    }
}




