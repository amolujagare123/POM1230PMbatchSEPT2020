package utilities.PracticeExtentReport;

import org.testng.annotations.Test;
import utilities.PracticeExtentReport.util.Init;

public class ClassThree extends Init {

    @Test
    public void openfacebook()
    {
        driver.get("http://facebook.com");
    }
}
