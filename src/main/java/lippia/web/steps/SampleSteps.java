package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AutomationTestingHomeService;

public class SampleSteps extends PageSteps {

    //StepsHomePage
    @Given("^estoy en la URL http://practice.automationtesting.in$")
    public void HomePage(){
        AutomationTestingHomeService.webPractica();
    }

    @When("^hago click en el menu 'Comercio'$")
    public void ClickShop(){
        AutomationTestingHomeService.ClickShopButton();
    }

    @And("^hago click en el boton del 'home menu'$")
    public void ClickHome(){
        AutomationTestingHomeService.ClickHomeButton();
    }

    @Then("^la home page tiene solo 3 deslizables$")
    public void VerifySliders(){
        AutomationTestingHomeService.VerificacionElementos();

    }

    @Then("^la home page tiene solo 3 productos$")
    public void VerifyProducts(){
        AutomationTestingHomeService.VerificacionProductos();
    }

    @And("^hago click en la primer imagen en el catalogo$")
    public void ClickImagen(){
        AutomationTestingHomeService.ClickUnElemento();
    }

    @And("^hago click en la pestaña 'Descripción' del libro que seleccioné anteriormente$")
    public void ClickDescripcion(){
        AutomationTestingHomeService.ClickDescripcion();
    }

    @Then("^la pagina me muestra la 'Descripcion' del libro en el que hice click$")
    public void VerificaDescripcion(){
        AutomationTestingHomeService.VerificacionDescripcion();

    }



    //StepsLogin
    @When("^hago click en el menu 'Mi cuenta'$")
    public void ClickMiCuenta() {
        AutomationTestingHomeService.ClickAccountButton();
    }


    @And("^ingreso el correo electronico (.*) en la caja de texto 'Username or email address'$")
    public void IngresoEmail(String correo) {
        AutomationTestingHomeService.EnterEmail(correo);
    }

    @And("^ingreso la contraseña (.*) en la caja de texto 'Password'$")
    public void IngresoContrasenia(String contra) {
        AutomationTestingHomeService.EnterPassword(contra);
    }

    @Then("^hago click en el boton 'Login' e ingreso al sitio web$")
    public void ClickLogin() {
        AutomationTestingHomeService.ClickLoginButton();
    }

    @And("^no ingreso la contraseña (.*) en la caja de texto 'Password'$")
    public void NoPassword(String contra) {
        AutomationTestingHomeService.EnterPassword(contra);
    }

    @Then("^muestra un mensaje de 'Error: Password is required' y vuelve a mostrar la pagina para el login.$")
    public void PasswordRequired() {
        AutomationTestingHomeService.PasswordBoxEmpty();
        ClickMiCuenta();


    }

    @And("hago click en el boton 'Login'")
    public void hagoClickEnElBotonLogin() {
        AutomationTestingHomeService.ClickLoginButton();
    }

    @And("no ingreso el correo electronico (.*) en la caja de texto 'Username or email address'")
    public void NoEmail(String correo) {
        AutomationTestingHomeService.EnterEmail(correo);
    }

    @Then("muestra un mensaje de 'Error: Username is required' y vuelve a mostrar la pagina para el login.")
    public void EmailRequired() {
        AutomationTestingHomeService.EmailBoxEmpty();
        ClickMiCuenta();
    }
    
    
    //StepsShop






    @And("^Hago click en cualquiera de los enlaces que se encuentran en 'Products Categories'$")
    public void ClickProductCategories() {
        AutomationTestingHomeService.ClickLinkProduct();
    }


    @Then("La pagina me muestra los productos de esa categoria en particular")
    public void laPaginaMeMuestraLosProductosDeEsaCategoriaEnParticular() {

    }


    @And("hago click en el nombre del producto a la venta en oferta en la home page")
    public void ClickProductoEnOferta() {
        AutomationTestingHomeService.ClickProductOnSale();
    }

    @Then("la pagina me muestra el precio actual y el precio anterior de dicho producto")
    public void laPaginaMeMuestraElPrecioActualYElPrecioAnteriorDeDichoProducto() {
    }

    @And("Hago clic en el elemento Ordenar por popularidad en el menu desplegable de ordenacion predeterminada.")
    public void HagoClickSorting() {
        AutomationTestingHomeService.ClickSorting();
    }

    @Then("Ahora el usuario puede ver solo los productos populares")
    public void MuestraProductosPopulares() {

    }

}

