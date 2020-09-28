package utilities.PracticeExtentReport;

import org.testng.annotations.Test;
import utilities.PracticeExtentReport.util.Init;

public class classOne extends Init {

    @Test
    public void openGmail()
    {
        driver.get("http://gmail.com");
    }
}
