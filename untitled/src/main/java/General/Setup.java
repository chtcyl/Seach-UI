package General;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;

public class Setup {
    public static void setup() {

        try {
            DesiredCapabilities cap = DesiredCapabilities.chrome();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("incognito");
            cap.setCapability(ChromeOptions.CAPABILITY, options);
            System.setProperty("webdriver.chrome.driver", "/Users/cihat.cayli/IdeaProjects/untitled/driverchrome/chromedriver");
            GeneralMethods.driver = new ChromeDriver(cap);

            GeneralMethods.driver.manage().window().maximize();
            GeneralMethods.driver.manage().deleteAllCookies();

            GeneralMethods.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
            GeneralMethods.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
        }

} @After
    public void takeScraenshotOnFailure(io.cucumber.java.Scenario scenario) {

            TakesScreenshot ts = (TakesScreenshot) GeneralMethods.driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
            GeneralMethods.driver.quit();
    }
}
