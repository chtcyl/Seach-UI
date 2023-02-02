package General;


import org.openqa.selenium.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GeneralMethods {
    public static String url="https://test1.ciceksepeti.com";
    public static WebDriver driver;

    public static void braze(){

        GeneralMethods.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
        GeneralMethods.driver.manage().timeouts().setScriptTimeout(2, TimeUnit.SECONDS);
        GeneralMethods.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        List<WebElement> elements = GeneralMethods.driver.findElements(By.xpath("//*[text()='İzin ver']"));

        if (elements.size()>0) {
            GeneralMethods.driver.findElement(By.xpath("//*[text()='İzin ver']")).click();
        }
        else {
            GeneralMethods.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            GeneralMethods.driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
            GeneralMethods.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);}
    }
}
