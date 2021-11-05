package co.com.qvision.certificacion.proyectobase.stepdefinitions;

import co.com.qvision.certificacion.proyectobase.questions.Respuesta;
import co.com.qvision.certificacion.proyectobase.tasks.BuscarArticulo;
import co.com.qvision.certificacion.proyectobase.tasks.Login;
import co.com.qvision.certificacion.proyectobase.tasks.OpenUp;
import co.com.qvision.certificacion.proyectobase.tasks.PagarArticulo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class proyectobaseStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el usuario se logea en la pagina SwagLabs$")
    public void elUsuarioSeLogeaEnLaPaginaSwagLabs()  {

        OnStage.theActorCalled("usuario").wasAbleTo(OpenUp.thePage(), Login.onThepage());

    }

    @When("^el usuario (.*) en la pagina web$")
    public void elUsuarioBuscaUnProductoEnLaPaginaWeb(String articulo)  {

    OnStage.theActorInTheSpotlight().attemptsTo(BuscarArticulo.the(articulo));
        OnStage.theActorInTheSpotlight().attemptsTo(PagarArticulo.enLaPagina());


    }

    @Then("^realiza una compra de un bolso en la pagina y encuentra el mensaje (.*)$")
    public void realizaUnaCompraDeUnBolsoEnLaPaginaYEncuentraElMensajeTHANKYOUFORYOURORDER(String pregunta){

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.toThe(pregunta)));

    }

}
