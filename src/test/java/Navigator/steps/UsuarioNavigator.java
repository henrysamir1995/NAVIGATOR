package Navigator.steps;

import Navigator.pageobject.PaginaPrincipal;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class UsuarioNavigator extends ScenarioActor {

    String actor;

    @Steps(shared=true)
    PaginaPrincipal paginaPrincipal;

    //@Step("#actor ingresa a navigator")
    public void ingresarAPagina(){
        paginaPrincipal.setDefaultBaseUrl("https://interbank.bpm.ibmcloud.com/ecm/test/navigator/");
        paginaPrincipal.open();
    }

    //@Step("#actor acepta los terminos")
    public void aceptarterminos() throws InterruptedException {
    paginaPrincipal.aceptarTerminos();
    }

    @Step("#actor se loguea")
    public void loguearse(String correo, String pssw) throws InterruptedException {
        paginaPrincipal.loguearse(correo,pssw);
    }

    @Step("#actor hace una busqueda")
    public void busqueda(String texto) throws InterruptedException {
        paginaPrincipal.busqueda(texto);
    }

    public void busqueda1() throws InterruptedException {
       // String texto1=paginaPrincipal.casa();
       //System.out.println(texto1);
        paginaPrincipal.casaa();
        String texto=paginaPrincipal.web();
        System.out.println(texto);
    }

}
