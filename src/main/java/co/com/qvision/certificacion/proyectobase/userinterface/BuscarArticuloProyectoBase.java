package co.com.qvision.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class BuscarArticuloProyectoBase extends PageObject {

    public static final Target btnAgregarAritculo =
            Target.the("Agregar bolso Sauce Labs Backpack")
            .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target btnCarrito =
            Target.the("Ir al carrito de compras")
                    .located(By.id("shopping_cart_container"));

    //
}
