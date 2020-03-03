package Navigator.stepsdefinitions;

import Navigator.pageobject.PaginaPrincipal;
import Navigator.steps.UsuarioNavigator;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class UsuarioDefinicionDePasos {

    @Steps(shared=true)
    UsuarioNavigator usuario;

    @Given("^(.*) ingresa a la pagina del navigator$")
    public void ingresaANavigator(String nombreDeUsuario){
    usuario.isCalled(nombreDeUsuario);
    usuario.ingresarAPagina();
    }
    @When("^(.*) acepta los terminos$")
    public void aceptarTerminos(String nombreDeUsuario ) throws InterruptedException {
        usuario.isCalled(nombreDeUsuario);
        usuario.aceptarterminos();

    }
    @And("ingresa su usuario (.*) y contraseña (.*)")
    public void iniciarSesion(String user, String pssw) throws InterruptedException {
        usuario.loguearse(user,pssw);
    }
    @Then("realiza la busqueda del documento (.*)")
    public void busqueda(String texto) throws InterruptedException {
        usuario.busqueda(texto);
        usuario.busqueda1();
    }
}
