package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest {


    @Test
    public void loginTest()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:82/afternoon-ip/");

        Login login = new Login(driver);

        login.setTxtUserName("amolujagare@gmail.com");
        login.setTxtPassword("admin123");
        login.clickLoginButton();

    }


}
