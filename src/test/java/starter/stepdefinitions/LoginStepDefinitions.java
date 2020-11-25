package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinitions {

    String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) has an activity account")
    public void sergey_has_an_activity_account(String name) {
        this.name = name;
    }

    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        theActorCalled(name).attemptsTo(
                DoLogin.withCredentials("opensourcecms", "opensourcecms")
        );
    }

    @Then("he should he access to manage his account")
    public void he_should_he_access_to_manage_his_account() {

    }
}
