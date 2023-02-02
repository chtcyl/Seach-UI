package StepDefination;

import Object.SearchBarObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

    SearchBarObject Search=new SearchBarObject();

    @When("search {string}")
    public void search(String searchKey) {
       Search.sendkeys(searchKey);
    }

    @Then("check search result")
    public void checkSearchResult() {
        Search.Searchlistingcheck();
    }

    @Then("check search pop up")
    public void checkSearchPopUp() {
        Search.Emptysearchpopup();
    }

    @Then("Check Past searches")
    public void checkPastSearches() {
        Search.Checkpastsearch();
    }

    @And("press {string}")
    public void pressENTER(String Press) {
       Search.Press(Press);

    }

    @Then("check noresult")
    public void checkNoresult() {
        Search.Checknosuggest();
    }

    @And("click {string}")
    public void click(String click) {
       Search.Click(click);
    }
}

