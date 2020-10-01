package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utilities.Driver;

import java.io.IOException;

import static utilities.ConfigReader.getUrl;

public class OpenUrl {


    public static WebDriver driver;

    @BeforeClass
    public void openUrl() throws IOException {
        driver = Driver.getDriver(Driver.DriverType.CHROME);
        driver.get(getUrl());
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }



}
