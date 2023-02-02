package StepDefination;
import General.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import Object.ChoicePageObject;

public class General {

    Setup Setup= new Setup();
    ChoicePageObject Choice=new ChoicePageObject();

    @When("çs or extra {string}")
    public void çsOrExtra(String secim1) {
        Choice.Selectchoice(secim1);
    }

    @Given("Ciceksepeti homepage")
    public void ciceksepetiHomepage() {
        Setup.setup();
    }}


