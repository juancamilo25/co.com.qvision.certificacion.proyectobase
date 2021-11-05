package co.com.qvision.certificacion.proyectobase.tasks;

import co.com.qvision.certificacion.proyectobase.userinterface.BuscarArticuloProyectoBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BuscarArticulo implements Task {

  private String articulo;

    public BuscarArticulo(String articulo) {
        this.articulo = articulo;
    }

    public static BuscarArticulo the(String articulo) {
        return Tasks.instrumented(BuscarArticulo.class,articulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Click.on(BuscarArticuloProyectoBase.btnAgregarAritculo),
                Click.on(BuscarArticuloProyectoBase.btnCarrito));

    }
}
