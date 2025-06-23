package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import cucumber.api.java.en_old.Ac;
import lippia.web.constants.GoogleConstants;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java8.Ca;
import junit.framework.Assert;
import lippia.web.constants.AutomationTestingConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static java.sql.DriverManager.getDriver;

public class AutomationTestingHomeService extends ActionManager {

    public static void webPractica(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void ClickAccountButton(){
        click(AutomationTestingConstants.MY_ACCOUNT_BUTTON_ID);
    }

    public static void EnterEmail(String email){
        setInput(AutomationTestingConstants.INPUT_EMAIL_ID, email);
    }

    public static void EnterPassword(String pass){
        setInput(AutomationTestingConstants.INPUT_PASSWORD_ID, pass);
    }

    public static void ClickLoginButton(){
        click(AutomationTestingConstants.LOGIN_BUTTON_ID);
    }

    public static void CheckLogin(){
        WebElement botonLogout = WebActionManager.getElement(AutomationTestingConstants.LOGIN_OUT_XPATH);
        Assert.assertTrue("El botón de cerrar sesión no está visible", botonLogout.isDisplayed());

    }

    public static void CheckErrorLogin(){
        WebElement ErrorMessage = WebActionManager.getElement(AutomationTestingConstants.ERROR_MESSAGE_XPATH);
        Assert.assertTrue("El mensaje de error por datos incorrectos esta visible", ErrorMessage.isDisplayed());

    }

    public static void ClickSignOut(){
        click(AutomationTestingConstants.SIGN_OUT_XPATH);
    }

    public static void ClickRetrocederNav() {

        if (getDriver() != null) {
            getDriver().navigate().back();
        }

    }

    private static WebDriver getDriver() {
        return null;
    }


    public static void CheckLoginPage(){
        WebElement buttonLogin = WebActionManager.getElement(AutomationTestingConstants.LOGIN_BUTTON_ID);
        Assert.assertTrue("El botón de iniciar sesion no está visible", buttonLogin.isDisplayed());
    }

    public static void ingresoEmailRegistration(String email){
        setInput(AutomationTestingConstants.INPUT_EMAIL_REGISTER_ID, email);
    }

    public static void ingresoPasswordRegistration(String pass){
        setInput(AutomationTestingConstants.INPUT_PASSWORD_REGISTER_ID, pass);
    }

    public static void clickRegistration(){
        click(AutomationTestingConstants.REGISTER_BUTTON_XPATH);
    }


    public static void verificacionPasswordEmpty(){
        WebElement errorRegMess = WebActionManager.getElement(AutomationTestingConstants.ERROR_REGISTRATION_XPATH);
        Assert.assertTrue("La contraseña no esta ingresada.", errorRegMess.isDisplayed());

    }

    public static void verificacionEmailEmpty(){
        WebElement errorRegMess = WebActionManager.getElement(AutomationTestingConstants.ERROR_REGISTRATION_XPATH);
        Assert.assertTrue("El email no esta ingresado.", errorRegMess.isDisplayed());
    }

    public static void tipoFallaRegistracion(int motivo){
        if (motivo == 1){
            AutomationTestingHomeService.verificacionPasswordEmpty();
        } else if (motivo == 2) {
            AutomationTestingHomeService.verificacionEmailEmpty();

        }
    }

    public static void clickDetailsAccount(){
        click(AutomationTestingConstants.ACCOUNT_DETAILS_XPATH);
    }

    public static void seccionDetallesCuenta(){
        boolean seccionDetalles = WebActionManager.isPresent(AutomationTestingConstants.FORM_DETAILS_XPATH);
        Assert.assertTrue("La sección de detalles de cuenta no está visible", seccionDetalles);
    }

    public static void salirCuenta(){
        click(AutomationTestingConstants.LOGIN_OUT_XPATH);

    }
}



