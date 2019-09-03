package prueba_automatizacion.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static prueba_automatizacion.util.GoogleSearchPageObject.*;




	public class LaRespuesta implements Question <Integer>{

		
		@Override
		public Integer answeredBy(Actor actor) {
		     			return Lista_links.resolveAllFor(actor).size();
		}
		
       public static LaRespuesta OfResults () {
    	   return new LaRespuesta();
		
	}
	}


