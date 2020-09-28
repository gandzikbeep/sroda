package Pages.utilty;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

<<<<<<< HEAD

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
=======
public class ExecutionListener extends RunListener {
    /**
     * Called before any tests have been run.
     * */
    public void testRunStarted(Description description) throws java.lang.Exception
    {
        System.out.println("Number of tests to execute : " + description.testCount());
    }

    /**
     *  Called when all tests have finished
     * */
    public void testRunFinished(Result result) throws java.lang.Exception
    {
        System.out.println("Number of tests executed : " + result.getRunCount());
    }

    /**
     *  Called when an atomic test is about to be started.
     * */
    public void testStarted(Description description) throws java.lang.Exception
    {
        System.out.println("Starting execution of test case : "+ description.getMethodName());
    }

    /**
     *  Called when an atomic test has finished, whether the test succeeds or fails.
     * */
    public void testFinished(Description description) throws java.lang.Exception
    {
        System.out.println("Finished execution of test case : "+ description.getMethodName());
    }

    /**
     *  Called when an atomic test fails.
     * */
    public void testFailure(Failure failure) throws java.lang.Exception
    {
        System.out.println("Execution of test case failed : "+ failure.getMessage());


    }

    /**
     *  Called when a test will not be run, generally because a test method is annotated with Ignore.
     * */
    public void testIgnored(Description description) throws java.lang.Exception
    {
        System.out.println("Execution of test case ignored : "+ description.getMethodName());
>>>>>>> origin/master
    }
}
