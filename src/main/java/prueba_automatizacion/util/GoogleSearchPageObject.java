package prueba_automatizacion.util;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://www.google.com.co")
public class GoogleSearchPageObject extends PageObject {
	

public static final Target Palabra = Target.the("Se ingresa la palabra Pruebaz")
                           .located(By.name("q" ));
public static final Target BTNLOGIN = Target.the("Boton de buscar")
                           .located(By.name("btnK"));
public static final Target palabracorrecta = Target.the("Seleccionar la palabra Pruebas")
                           .located(By.id("fprsl"));

public static final Target Lista_links=Target.the("lista de resultados").located(By.className("ellip"));


}
