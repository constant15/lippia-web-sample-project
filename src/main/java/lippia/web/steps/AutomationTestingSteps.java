package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import lippia.web.constants.AutomationTestingConstants;
import lippia.web.services.AutomationTestingHomeService;

public class AutomationTestingSteps extends PageSteps {

    @Given("^Estoy en la URL http://practice.automationtesting.in$")
    public void HomePage(){
        AutomationTestingHomeService.webPractica();
    }

    @When("^Hago click en el boton 'Mi cuenta'$")
    public void ClickMiCuenta() {
        AutomationTestingHomeService.ClickAccountButton();
    }


    @And("^Ingreso el correo electronico (.*) en la caja de texto 'Nombre de usuario o dirección de correo electrónico'$")
    public void IngresoEmail(String correo) {
        AutomationTestingHomeService.EnterEmail(correo);
    }

    @And("^Ingreso la contraseña (.*) en la caja de texto 'Contraseña' y hago click en el boton 'Acceso'$")
    public void IngresoContrasenia(String contra) {
        AutomationTestingHomeService.EnterPassword(contra);
        AutomationTestingHomeService.ClickLoginButton();
    }


    @Then("^Ingreso correctamente al sitio web con el usuario$")
    public void VerificacionIngreso() {

    AutomationTestingHomeService.CheckLogin();

    }

    @And("^Ingreso el nombre de usuario (.*) con letras mayusculas y minusculas en la caja de texto 'Nombre de usuario o dirección de correo electrónico'$")
        public void IngresoEmailCaseSensitive(String correo) {
            AutomationTestingHomeService.EnterEmail(correo);
    }

    @And("^Ingreso la contraseña (.*) con letras mayusculas y minusculas en la caja de texto 'Contraseña'$")
    public void ContraseniaCaseSensitive(String contraCS){
        AutomationTestingHomeService.EnterPassword(contraCS);

    }

    @And("^Hago click en el boton 'Acceso'$")
    public void clickAcceder(){
        AutomationTestingHomeService.ClickLoginButton();
    }
    @Then("^Se verifica que el ingreso a la cuenta falla debido a datos de ingreso incorrectos.$")
    public void VerificaIngresoIncorrecto(){
        AutomationTestingHomeService.CheckErrorLogin();
    }


    @And("Ingreso el nombre de usuario (.*) en la caja de texto 'Nombre de usuario o dirección de correo electrónico'.$")
    public void ingresoUsername(String usuario) {
        AutomationTestingHomeService.EnterEmail(usuario);
    }

    @And("Hago click en el boton 'Sign out'")
    public void clickSignOut() {
        AutomationTestingHomeService.ClickSignOut();

    }

    @And("Hago click en el boton 'Retroceder' del navegador")
    public void clickRetroceder() {
        AutomationTestingHomeService.ClickRetrocederNav();
    }

    @Then("Se verifica que el usuario no inicia sesión en su cuenta, sino que debe ser visible una página web general.")
    public void VerificacionWebGral() {
        AutomationTestingHomeService.CheckLoginPage();
    }


    @And("^Ingreso el correo electronico (.*) en la caja de texto 'Dirección de correo electrónico' del formulario de Registro$")
    public void ingresoEmailRegistro(String email) {
        AutomationTestingHomeService.ingresoEmailRegistration(email);
    }

    @And("Ingreso la contraseña (.*) en la caja de texto 'Contraseña' del formulario de Registro$")
    public void ingresoContraseniaRegistro(String pass) {
        AutomationTestingHomeService.ingresoPasswordRegistration(pass);
    }

    @And("Hago click en el boton 'Registro'")
    public void clickBotonRegistro() {
        AutomationTestingHomeService.clickRegistration();
    }



    @Then("Se verifica que el registro en el sitio web falla por (.*)$")
    public void verificacionFallaRegistro(int motivo) {
        AutomationTestingHomeService.tipoFallaRegistracion(motivo);
    }


    @And("Hago click en 'Detalles de la cuenta'$")
    public void clickDetallesCuenta() {
        AutomationTestingHomeService.clickDetailsAccount();
    }

    @Then("Se verifica que el usuario visualiza los detalles de su cuenta$")
    public void verificacionDetallesCuenta() {
        AutomationTestingHomeService.seccionDetallesCuenta();
    }


    @Then("Al hacer clic en 'Cerrar sesión', el usuario sale correctamente del sitio")
    public void verificacionCierreSesion() {
        AutomationTestingHomeService.salirCuenta();
        AutomationTestingHomeService.CheckLoginPage();
    }

    @When("Hago click en el menu 'Comercio'$")
    public void clickComercio() {
        AutomationTestingHomeService.clickMenuShop();
    }

    @And("Hago click en el boton del 'Home menu'$")
    public void clickHomeMenuButton() {
        AutomationTestingHomeService.clickHomeMenu();
    }

    @Then("La página de inicio debe mostrar exactamente 3 arrivals")
    public void verificacionArrivals() {
        AutomationTestingHomeService.verificacionProductos();
    }


    @When("Hago click en la imagen de uno de los arrivals")
    public void clickProductoArrival() {
        AutomationTestingHomeService.ClickUnProducto();
    }

    @And("El sitio web muestra la página de detalles del libro")
    public void detallesLibro() {
        AutomationTestingHomeService.ClickDescripcion();
    }

    @And("Hago click en el botón 'Agregar al carrito'$")
    public void agregarAlCarrito() {
        AutomationTestingHomeService.ClickAgregarAlCart();
    }


    @Then("Se verifica que el libro con su precio se muestra en el menu 'Item'$")
    public void VerificaPrecioMenuItem() throws InterruptedException {
        Thread.sleep(180);
        AutomationTestingHomeService.verificarPrecioLibro();

    }

    @When("Hago click en el enlace 'Items'$")
    public void ClickAccesoCarrito() {
        AutomationTestingHomeService.clickMenuItems();
    }


    @Then("Se verifica el subtotal y total justo encima del botón 'Pasar por la caja'$")
    public void VerificacionDatosCesta() {
        AutomationTestingHomeService.verificacionMontos();

    }

    @When("Hago click en el boton 'Pasar por la caja'")
    public void clickPasarPorCaja() {
        AutomationTestingHomeService.clickCheckout();
    }

    @Then("Se verifica los detalles de facturación, detalles del pedido, informacion adicional y pasarela de pago")
    public void verificacionDetalles() {
        AutomationTestingHomeService.detallesCheckout();
    }

    @When("Completo el formulario de facturación con sus datos")
    public void datosFormularioPedido() throws InterruptedException {
        AutomationTestingHomeService.ingresoDatosFormulario();
    }

    @And("Elijo un método de pago como transferencia, cheque, efectivo o PayPal")
    public void clickMetodoPaypal() {
        AutomationTestingHomeService.metodoPago();
    }

    @Then("Se verifica la posibilidad de poder aplicar un cupón y visualizar toda la información del pedido")
    public void verificacionAplicacionCupon() {
        AutomationTestingHomeService.aplicacionCupon();
    }

    @And("Hago click en el boton 'Realizar pedido' para completar el proceso")
    public void clickRealizarPedido() throws InterruptedException {
        AutomationTestingHomeService.clickButtonPlaceOrder();
    }

    @Then("Se completa el proceso y la página navega a una pantalla de Confirmación de Pedido con detalles del pedido, datos bancarios, datos del cliente y de facturación")
    public void verificacionCompraCompleta() {
        AutomationTestingHomeService.verificacionDetalleOrden();
    }

    @And("Elijo el metodo de pago 'Transferencia bancaria directa'")
    public void metodoTransBanc() {
        AutomationTestingHomeService.metodoPago();
    }

    @And("Hago click en el botón 'Agregar al carrito' del libro")
    public void agregarCarritoDesdeShop() throws InterruptedException {
        AutomationTestingHomeService.clickAgregarLibroDesdeShop();
        Thread.sleep(6000);

    }


    @And("^Ingreso un (.*) en el detalle de facturacion en la caja de texto 'Pais'$")
    public void ingresoPais(String pais) {
        AutomationTestingHomeService.seleccionPais(pais);
    }

    @Then("^Se verifica que el pedido tendra una tasa impositiva del 2% si ese (.*) es India o 5% si es otro pais$")
    public void verificacionTax(String verifPais) {
        AutomationTestingHomeService.assertPorTax(verifPais);
    }



}

