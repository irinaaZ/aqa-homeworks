package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

    public void logStart(ITestResult result) {
        System.out.println("Test was started");
    }
    public void logSuccess(ITestResult result) {
        System.out.println("Test was passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test was failed");
        System.out.println(result.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("Test was finished");
    }
}



