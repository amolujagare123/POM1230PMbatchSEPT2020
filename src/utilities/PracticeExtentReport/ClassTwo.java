package utilities.PracticeExtentReport;

import org.testng.annotations.Test;
import utilities.PracticeExtentReport.util.Init;

public class ClassTwo extends Init {

    @Test
    public void openGoogle()
    {
        driver.get("http://google.com");
    }
}
