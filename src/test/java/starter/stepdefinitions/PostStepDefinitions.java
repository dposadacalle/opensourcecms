package starter.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;
import starter.post.DoPost;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PostStepDefinitions {

    String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Validar campos requeridos")
    public void validar_campos_requeridos(String name) {
        this.name=name;
    }

    @When("Validar los Tipos de datos de los campos")
    public void validar_los_Tipos_de_datos_de_los_campos() {
        theActorCalled(name).attemptsTo(
                NavigateTo.theOpenSourceCmsHomePage(),
                DoPost.withDataPost("Test1", "Esto es un test!!!")
        );
    }

    @Then("Validar Longitud maxima de los campos")
    public void validar_Longitud_maxima_de_los_campos() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
