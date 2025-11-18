package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutomationTestingHomeService;

public class SampleSteps extends PageSteps {

    @Given("^estoy en la URL 'https://www.saucedemo.com'$")
    public void homePage() {
        AutomationTestingHomeService.webPractica();

    }

    @When("^ingreso el usuario (.*) en la caja de texto 'Username'$")
    public void ingresoUsuario(String user) {
        AutomationTestingHomeService.EnterUser(user);
    }
    @And("^ingreso la contraseña (.*) en la caja de texto 'Password'$")
    public void IngresoContrasenia(String contra) {
        AutomationTestingHomeService.EnterPassword(contra);
    }


    @And("hago click en el boton 'Login'")
    public void clickButtonLogin() {
        AutomationTestingHomeService.ClickLoginButton();
    }


    @Then("Se verifica que ingresa correctamente al sitio mostrando los productos")
    public void verificacionProductos() {
        AutomationTestingHomeService.checkCartButton();
    }

    @When("^ingreso un usuario incorrecto (.*) en la caja de texto 'Username'$")
    public void ingresoUserNoReg(String user) {
        AutomationTestingHomeService.EnterUser(user);
    }

    @Then("^muestra un mensaje de 'Epic sadface: Sorry, this user has been locked out.'")
    public void errorMessageVerify() {
        AutomationTestingHomeService.usernameCheck();
    }


    @And("^hago click en el boton 'Add to cart' de un producto$")
    public void clickEnCart() throws InterruptedException {
        AutomationTestingHomeService.clickCart();
    }

    @Then("se verifica que en el carrito de compras hay un producto agregado")
    public void verifyProducts() {
        AutomationTestingHomeService.productDisplayed();
    }

    @And("^hago click en el boton 'Remove' del producto$")
    public void clickRemove() {
        AutomationTestingHomeService.clickRemoveProduct();
    }

    @Then("se verifica que se vacia el carrito de compras")
    public void carritoVacio() {
        AutomationTestingHomeService.productDisplayedAct();
    }


    @And("^hago click en el boton 'Add to cart' de dos productos diferentes$")
    public void agregoProductos() throws InterruptedException {
        AutomationTestingHomeService.clickProductsCart();
    }

    @And("^hago click en el boton 'Cart'$")
    public void clickCarrito() {
        AutomationTestingHomeService.clickCartButton();
    }

    @And("^se muestra el carrito de compras y hago click en el boton 'Checkout'$")
    public void vistaCarrito() {
        AutomationTestingHomeService.clickCheckout();
    }

    @And("^hago click en el boton 'Continue'$")
    public void clickContinuar() {
        AutomationTestingHomeService.clickContinue();
    }




    @And("^ingreso el nombre (.*) en la caja de texto 'First Name', ingreso el apellido (.*) en la caja de texto 'Last Name' y el codigo postal (.*) en la caja de texto 'Zip/Postal Code'$")
    public void ingresoDatos(String nombre, String apellido, int cp) {
        AutomationTestingHomeService.addData(nombre, apellido, cp);
    }

    @Then("se verifica que se validan los datos ingresados")
    public void verificacionDatos() {
        AutomationTestingHomeService.verifyCheckout();
    }


    @And("se verifica los productos en la pagina 'Overview' y hago click en el boton 'Finish'")
    public void clickFinish() {
        AutomationTestingHomeService.verifyCheckout();
        AutomationTestingHomeService.clickFinish();
    }


    @Then("se verifica que la orden de compra fue realizada correctamente")
    public void verifyBuy() {
        AutomationTestingHomeService.completeOrder();
    }
}

