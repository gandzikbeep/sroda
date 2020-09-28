package Pages.utilty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriveFactory {

    public static WebDriver getDriver() {
        System.out.println("Zmienna zostanie zainicjalizowana");
        WebDriverManager.chromedriver().setup();
        WebDriver driverInstance = new ChromeDriver();
        driverInstance.manage().deleteAllCookies();   //new line
        driverInstance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driverInstance.manage().window().maximize();
        return driverInstance;
    }
}
