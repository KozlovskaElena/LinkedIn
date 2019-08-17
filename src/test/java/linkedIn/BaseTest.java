package linkedIn;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    protected User user;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "/Users/elena/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com");

        user = new User("kozlovskaja.elena@gmail.com", "1228807FlV");
    }

    @After
    public void finish() {
//        driver.quit();


    }

}
