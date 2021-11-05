package co.com.qvision.certificacion.proyectobase.tasks;

import co.com.qvision.certificacion.proyectobase.userinterface.paginaPruebas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private paginaPruebas paginaPruebas;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(paginaPruebas));
        
    }
}
