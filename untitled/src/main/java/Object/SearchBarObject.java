package Object;

import General.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchBarObject {

    public void sendkeys (String Key){
       GeneralMethods.driver.findElement(By.xpath("//input[@class = 'form-control product-search__input js-product-search-input js-illegal-product-characters']")).sendKeys(Key);
    }

    public void Searchlistingcheck(){
        GeneralMethods.driver.findElement(By.xpath("//div[@class='products__item-img-container ratio-container']")).isDisplayed();
    }

    public void Click(String click){

        String Searchbar="searchbar";
        String removebutton="removebutton";
        String searchbutton="searchbutton";
        String pastsearch="pastsearch";
        String emtypopupbutton="emtypopupbutton";
        String cleanbutton="cleanbutton";
        String showallbutton="showallbutton";
        String suggest="suggest";
        if(Searchbar.equals(click)) {
            GeneralMethods.driver.findElement(By.cssSelector("input[class='form-control product-search__input js-product-search-input js-illegal-product-characters']")).click();
        }
        else if(removebutton.equals(click)){
            GeneralMethods.driver.findElement(By.cssSelector("div[class ='product-search__remove-button']")).click();
        }
        else if(searchbutton.equals(click)){
            GeneralMethods.driver.findElement(By.cssSelector("button[class='js-product-search-button btn product-search__button']")).click();
        }
        else if(pastsearch.equals(click)){
            List<WebElement> gecmis = GeneralMethods.driver.findElements(By.cssSelector("span[class='product-search__history-result-text']"));
            gecmis.get(0).click();
        }
        else if(emtypopupbutton.equals(click)){
            GeneralMethods.driver.findElement(By.cssSelector("button[data-dismiss='modal']")).click();
        }
        else if(cleanbutton.equals(click)){
            GeneralMethods.driver.findElement(By.cssSelector("span[class ='product-search__clear-button js-recent-search-clear-button']")).click();
        }
        else if(showallbutton.equals(click)){
            try {
                WebElement button = GeneralMethods.driver.findElement(By.cssSelector("a[class ='product-search__showall js-product-search--showall btn btn-success']"));
                button.click();
            }
            catch(org.openqa.selenium.StaleElementReferenceException ex)
            {
                WebElement button = GeneralMethods.driver.findElement(By.cssSelector("a[class = 'product-search__showall js-product-search--showall btn btn-success']"));
                button.click();
            }
        }
        else if(suggest.equals(click)){
            List<WebElement> gecmis1 = GeneralMethods.driver.findElements(By.cssSelector("li[class = 'product-search__result product-search__result--category']"));
            gecmis1.get(0).click();
        }
    }

    public void Emptysearchpopup(){
        GeneralMethods.driver.findElement(By.cssSelector("button[data-dismiss='modal']")).isDisplayed();
    }

    public void Checkpastsearch(){
        GeneralMethods.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
        GeneralMethods.driver.manage().timeouts().setScriptTimeout(2, TimeUnit.SECONDS);
        GeneralMethods.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        GeneralMethods.driver.findElement(By.cssSelector("span[class = 'product-search__history-result-text']")).isDisplayed();

        GeneralMethods.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        GeneralMethods.driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        GeneralMethods.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void Press(String Press){
            GeneralMethods.driver.findElement(By.cssSelector("input[class = 'form-control product-search__input js-product-search-input js-illegal-product-characters']")).sendKeys(Keys.ENTER);
    }

    public void Checknosuggest(){
       GeneralMethods.driver.findElement(By.cssSelector("p[class = 'product-search__noresults']")).isDisplayed();
    }
}
