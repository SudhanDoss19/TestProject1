package ProjectLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserLaunch {

    public static WebDriver driver;

    public static void getDriver()
    {
            System.setProperty("webdriver.chrome.driver", "C:\\Work\\Chrome\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
    }
}

