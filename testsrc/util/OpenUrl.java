package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.Driver;

import java.io.IOException;

import static utilities.ConfigReader.getUrl;

public class OpenUrl {


    public static WebDriver driver = Driver.getDriver(Driver.DriverType.CHROME);

    @BeforeClass
    public void openUrl() throws IOException {

        driver.get(getUrl());
    }


}
