package Pages.utilty;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.TestClass;

public class MyRunner  extends BlockJUnit4ClassRunner {
    public MyRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }


    @Override public void run(RunNotifier notifier){
        notifier.addListener(new ExecutionListener());
        notifier.fireTestRunStarted(getDescription());
        super.run(notifier);
    }

}
