package utilities.PracticeExtentReport.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static utilities.PracticeExtentReport.util.Init.getDriver;
import static utilities.PracticeExtentReport.util.MyReport.getExtentObject;
import static utilities.PracticeExtentReport.util.MyReport.takescreenshot;

public class ReportListeners  implements ITestListener {

    ExtentTest test;
    ExtentReports extent = getExtentObject();

    @Override
    public void onTestStart(ITestResult iTestResult) {

        

         test = extent.createTest(iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        try {
            test.addScreenCaptureFromPath("./screenshot/"+takescreenshot(getDriver()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        test.pass(iTestResult.getMethod().getMethodName()+":This test is passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        try {
            test.addScreenCaptureFromPath("./screenshot/"+takescreenshot(getDriver()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        test.fail(iTestResult.getMethod().getMethodName()+":This test is failed");
        test.fail(iTestResult.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        try {
            test.addScreenCaptureFromPath("./screenshot/"+takescreenshot(getDriver()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        test.fail(iTestResult.getMethod().getMethodName()+":This test is failed");
        test.fail(iTestResult.getThrowable());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

        extent.flush();
    }
}
