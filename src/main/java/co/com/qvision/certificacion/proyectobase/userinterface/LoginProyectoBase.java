package co.com.qvision.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;

public class LoginProyectoBase extends PageObject {



    public static final Target inputUserName = Target.the("Input para ingresar el nombre del usuario")
            .located(By.id("user-name"));

    public static final Target inputPassword = Target.the("Input para ingresar la contraseña del usuario")
            .located(By.id("password"));

    public static final Target btnLogin = Target.the("Boton para ingresar")
            .located(By.id("login-button"));


    /*
    @FindBy(id = "user-name") WebElementFacade inputUserName;

    @FindBy(id = "password") WebElementFacade inputPassword;

    @FindBy(id = "login-button") WebElementFacade btnLogin;

*/

}
