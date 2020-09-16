package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.Login;
import util.OpenUrl;
import utilities.Driver;

import java.io.IOException;

import static utilities.ConfigReader.getUrl;

public class ForgotPasswordTest extends OpenUrl {


    @Test
    public void forgotPasswordTest() throws IOException {

        Login login = new Login(driver);

        login.clickForgotPass();

        ForgotPassword forgotPassword = new ForgotPassword(driver);

        forgotPassword.setTxtEmail("amol@gmail.com");
        forgotPassword.clickSubmit();
    }


}
