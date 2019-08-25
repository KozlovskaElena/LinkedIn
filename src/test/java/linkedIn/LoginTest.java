package linkedIn;

import org.junit.Test;

public class LoginTest extends BaseTest {

    private HomePage homePage;

    @Test
    public void testLogin() {

        homePage = new HomePage(driver);

        homePage.inputLogin(user.getLogin());
        homePage.inputPassword(user.getPassword());
        homePage.clickSigninButton();
    }

//    new test1
//    new test2

}
