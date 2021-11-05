package co.com.qvision.certificacion.proyectobase.tasks;

import co.com.qvision.certificacion.proyectobase.userinterface.LoginProyectoBase;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThepage() {

        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("standard_user").into(LoginProyectoBase.inputUserName),
                Enter.theValue("secret_sauce").into(LoginProyectoBase.inputPassword),
                Click.on(LoginProyectoBase.btnLogin));

    }
}
