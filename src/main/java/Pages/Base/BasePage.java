//package Pages.Base;
//
//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class BasePage {
//    WebDriver driver;
//
//    @Before
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://automationpractice.com/index.php");
//    }
//
//    @After
//    public void endTest() {
//        driver.quit();
//    }
//
//}
