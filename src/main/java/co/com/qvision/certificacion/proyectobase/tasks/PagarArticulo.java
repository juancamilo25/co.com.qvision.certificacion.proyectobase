package co.com.qvision.certificacion.proyectobase.tasks;

import co.com.qvision.certificacion.proyectobase.userinterface.PagarArticulosProyectoBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class PagarArticulo implements Task {


    public static PagarArticulo enLaPagina() {
        return Tasks.instrumented(PagarArticulo.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Click.on(PagarArticulosProyectoBase.btnCheckout),
                Enter.theValue("Juan Camilo").into(PagarArticulosProyectoBase.inputNombre),
                Enter.theValue("Alvarez Barrios").into(PagarArticulosProyectoBase.inputApellido),
                Enter.theValue("555").into(PagarArticulosProyectoBase.inputCodigoPostal),
                Click.on(PagarArticulosProyectoBase.btnContinuar),
                Click.on(PagarArticulosProyectoBase.btnFinalizarCompra)
                );

    }
}
