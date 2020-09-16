package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;
import utilities.Driver;

import java.io.IOException;

import static utilities.ConfigReader.*;

public class LoginTest extends OpenUrl {


    @Test
    public void loginTest() throws IOException {

        Login login = new Login(driver);

        login.setTxtUserName(getUsername());
        login.setTxtPassword(getPassword());
        login.clickLoginButton();

    }

}
