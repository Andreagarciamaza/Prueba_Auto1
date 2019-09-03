package prueba_automatizacion.tasks;




import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import prueba_automatizacion.util.GoogleSearchPageObject;



public class IngresarPaginaGoogle<DatosMovimiento> implements Task
{
	private String palabra;

	
	public IngresarPaginaGoogle(String palabra) {
		super();
		this.palabra = palabra;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
	actor.attemptsTo(Enter.theValue(palabra).into(GoogleSearchPageObject.Palabra));
	actor.attemptsTo(Click.on(GoogleSearchPageObject.BTNLOGIN));
	actor.attemptsTo(Click.on(GoogleSearchPageObject.palabracorrecta));
}

	public static IngresarPaginaGoogle	lapalabraPruebaz(String palabra ) {
	
		return Tasks.instrumented(IngresarPaginaGoogle.class, palabra);	}

}


