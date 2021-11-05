package co.com.qvision.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PagarArticulosProyectoBase extends PageObject {


    public static final Target btnCheckout =
            Target.the("Boton para agregar el pago")
            .located(By.id("checkout"));

    public static final Target inputNombre =
            Target.the("Input para el nombre")
                    .located(By.id("first-name"));

    public static final Target inputApellido =
            Target.the("Input para el apellido")
                    .located(By.id("last-name"));

    public static final Target inputCodigoPostal =
            Target.the("Input para el Codigo postal")
                    .located(By.id("postal-code"));

    public static final Target btnContinuar =
            Target.the("Continuar")
                    .located(By.id("continue"));

    public static final Target btnFinalizarCompra =
            Target.the("Boton para finalizar compra")
                    .located(By.id("finish"));

    public static final Target labelConfirmacion =
            Target.the("texto para validar compra exitosa")
                    .located(By.xpath("//*[contains(@class,'complete-header')]"));



}
