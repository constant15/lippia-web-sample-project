package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
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
}

