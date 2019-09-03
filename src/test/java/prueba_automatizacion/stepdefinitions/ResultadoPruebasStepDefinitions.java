package prueba_automatizacion.stepdefinitions;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import prueba_automatizacion.questions.LaRespuesta;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import prueba_automatizacion.tasks.IngresarPaginaGoogle;
import prueba_automatizacion.util.GoogleSearchPageObject;




public class ResultadoPruebasStepDefinitions {

		
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	
	private Actor Andrea =Actor.named("Andrea");
	GoogleSearchPageObject googleSearchPageObject;
	
	
	
	@Before 
	public void configuracionInicial() {
	Andrea.can(BrowseTheWeb.with(hisBrowser));	
	}
	
	@Dado("^que Andrea  ingresa a la pagina de google$")
	public void queAndreaIngresaALaPaginaDeGoogle() throws Exception {
		Andrea.attemptsTo(Open.browserOn(googleSearchPageObject));
	    
	}


	@Cuando("^ella digita la palabra (.*) de manera erronea y luego hace click sobre la palabra correcta$")
	public void ellaDigitaLaPalabraDeManeraErroneaYLuegoHaceClickSobreLaPalabraCorrecta(String palabra)  {
		Andrea.wasAbleTo(IngresarPaginaGoogle.lapalabraPruebaz(palabra));  
		
	}




	@Entonces("^ella deberia obtener la lista de los resultados y validar que la cantidad sea mayor a (\\d+)$")
	public void ellaDeberiaObtenerLaListaDeLosResultadosYValidarQueLaCantidadSeaMayorA(int value) {
		value=6;
		Andrea.should(GivenWhenThen.seeThat(LaRespuesta.OfResults(), Matchers.is(Matchers.greaterThanOrEqualTo(value))));
		
		
	
			
		}
	}


	

	


