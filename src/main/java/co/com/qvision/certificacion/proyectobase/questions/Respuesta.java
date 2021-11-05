package co.com.qvision.certificacion.proyectobase.questions;

import co.com.qvision.certificacion.proyectobase.userinterface.PagarArticulosProyectoBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Respuesta implements Question<Boolean> {

    private String pregunta;

    public Respuesta(String pregunta) {
        this.pregunta = pregunta;
    }

    public static Respuesta toThe(String pregunta) {

        return new Respuesta(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;
        String mensajeDeCompra = Text.of(PagarArticulosProyectoBase.labelConfirmacion)
                .viewedBy(actor).asString();

        if(pregunta.equals(mensajeDeCompra)){

            result = true;
        }
        else {
            result = false;
        }

        return result;
    }
}
