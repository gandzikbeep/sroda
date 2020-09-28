package Pages.utilty;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;


public class ExecutionListener extends RunListener {


    @Override
    public void testRunStarted(Description description)  {
        System.out.println("Number of tests to execute : " + description.testCount());
    }

    @Override
    public void testRunFinished(Result result)  {
        System.out.println("Number of tests executed : " + result.getRunCount());
    }

    @Override
    public void testStarted(Description description)  {
        System.out.println("Starting execution of test case : " + description.getMethodName());
    }

    @Override
    public void testFinished(Description description)  {
        System.out.println("Finished execution of test case : " + description.getMethodName());
    }

    @Override
    public void testFailure(Failure failure) throws java.lang.Exception {
        System.out.println("Execution of test case failed : " + failure.getMessage());
         Screenshots.takesScreenshot(DriveFactory.getDriver());
    }

    @Override
    public void testIgnored(Description description)  {
        System.out.println("Execution of test case ignored : " + description.getMethodName());
    }
}

