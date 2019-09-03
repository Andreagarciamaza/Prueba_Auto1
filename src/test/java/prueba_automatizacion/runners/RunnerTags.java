package prueba_automatizacion.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/ResultadoPruebas.feature",
				tags= "@Escenario1",
		glue="prueba_automatizacion.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {

}
