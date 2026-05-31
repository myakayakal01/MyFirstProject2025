package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    private static ExtentReports extent;

    private static ExtentTest extentTest;

    @Override
    public void onTestStart(ITestResult result) {
        extentTest = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        String testCase = extentTest.log(Status.FAIL, "Test Case ") + result.getMethod().getMethodName() + " Had Failed";
    }

    @Override
    public void onTestSuccess(ITestResult result) {

        String testCase = extentTest.log(Status.PASS, "Test Case ") + result.getMethod().getMethodName() + " Had Passed";

    }

    @Override
    public void onTestSkipped(ITestResult result) {

        extentTest.log(Status.PASS, "Test Case Skipped");
    }

    @Override
    public void onFinish(ITestContext result) {
        extent.flush();
    }


    public void onStart(ITestContext result) {
        extent = ExtentReportManager.extentSetup();

     }
}
