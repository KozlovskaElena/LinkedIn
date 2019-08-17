package linkedIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name=\"session_key\"]")
    private WebElement loginField;

    @FindBy(css = "input[name=\"session_password\"]")
    private WebElement passwordField;

    @FindBy(css = ".sign-in-form__submit-btn")
    private WebElement signInButton;

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSigninButton() {
        signInButton.click();
    }
}
