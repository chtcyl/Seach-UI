package Object;

import General.GeneralMethods;
import org.openqa.selenium.By;

public class ChoicePageObject {

    public void Selectchoice(String secim) {
        String extra="extra";
        if(extra.equals(secim)){
            GeneralMethods.driver.get(GeneralMethods.url);
           GeneralMethods.driver.findElement(By.cssSelector("img[alt='varvar popup image']")).click();
        }
        else {
            GeneralMethods.driver.get(GeneralMethods.url);
           GeneralMethods.driver.findElement(By.cssSelector("img[alt='ciceksepeti popup image']")).click();
        }}
}
