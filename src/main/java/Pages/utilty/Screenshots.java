package Pages.utilty;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalTime;

public class Screenshots   {

    public Screenshots(WebDriver newDriver) {
    }

    public static void takesScreenshot(WebDriver driver) throws IOException{
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("src/main/resources/test" + LocalTime.now().getNano() + ".png");
        Files.copy(screenshotFile.toPath(),destinationFile.toPath());
    }

//
//    public void takesScreenshot() {
//    }
}


