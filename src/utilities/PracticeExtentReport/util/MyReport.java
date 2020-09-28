package utilities.PracticeExtentReport.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyReport {
   static ExtentReports extent;
    public static ExtentReports getExtentObject()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");


        reporter.config().setDocumentTitle("All testing reports");
        reporter.config().setReportName("Regression testing of Stock management");

         extent = new ExtentReports();

        extent.attachReporter(reporter);

        extent.setSystemInfo("Project name","Stock management system");
        extent.setSystemInfo("Dev name","Gaurav");
        extent.setSystemInfo("Testers name","Priyanka");

        return  extent;
    }

    public static String takescreenshot(WebDriver driver) throws IOException // this method returns name of the file
    {
        String filename = "";

        TakesScreenshot ts = (TakesScreenshot) driver;

        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_dd_MM_yyyy_hh_mm_ss").format(new Date());

        filename = "screenshot"+timeStamp+".png";

        FileUtils.copyFile(scrFile, new File("Reports\\Screenshot\\"+filename));

        return filename;
    }

}
