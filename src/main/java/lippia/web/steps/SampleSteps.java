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
    public void hagoClickEnElBotonLogin() {
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


}

