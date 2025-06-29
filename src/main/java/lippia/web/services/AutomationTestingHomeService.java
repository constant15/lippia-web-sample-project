package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import cucumber.api.java.en_old.Ac;
import io.github.sridharbandi.driver.DriverContext;
import lippia.web.constants.GoogleConstants;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java8.Ca;
import junit.framework.Assert;
import lippia.web.constants.AutomationTestingConstants;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverAction;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

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

    public static void clickMenuShop(){
        click(AutomationTestingConstants.SHOP_BUTTON_ID);
    }

    public static void clickHomeMenu(){
        click(AutomationTestingConstants.HOME_BUTTON_XPATH);
    }

    public static void verificacionProductos(){
        int var2 = 3;
        int ProdNuevos = WebActionManager.getElements(AutomationTestingConstants.PRODUCTS_ARRIVALS_XPATH).size();
        Assert.assertEquals(var2, ProdNuevos);
        if(var2 == ProdNuevos){
            System.out.println("En el menu principal se muestran 3 productos nuevos.");
        }
        else{
            System.out.println("No hay 3 productos en el menu principal.");
        }
    }

    public static void ClickUnProducto(){
        click(AutomationTestingConstants.PRODUCT_XPATH);
    }

    public static void ClickDescripcion(){
        click(AutomationTestingConstants.DESCRIPTION_BUTTON_XPATH);
    }

    public static void ClickAgregarAlCart(){
        click(AutomationTestingConstants.ADD_BASKET_BUTTON_XPATH);
    }

    public static void verificarPrecioLibro(){
        WebElement Items = WebActionManager.getElement(AutomationTestingConstants.ITEM_MENU_BUTTON);
        Assert.assertTrue("El precio del libro no se muestra en el menu item.", Items.isEnabled());
    }

    public static void clickMenuItems(){
        click(AutomationTestingConstants.ITEM_MENU_BUTTON);
    }

    public static void verificacionMontos(){
        WebElement montos = WebActionManager.getElement(AutomationTestingConstants.CHECKOUT_BUTTON_XPATH);
        Assert.assertTrue("El subtotal y el total no se encuentran por encima del boton 'Pasar por la caja.'", montos.isDisplayed());
    }

    public static void clickCheckout(){
        click(AutomationTestingConstants.CHECKOUT_BUTTON_XPATH);
    }

    public static void detallesCheckout(){
        WebElement formulario = WebActionManager.getElement(AutomationTestingConstants.FORM_CHECKOUT_ID);
        Assert.assertTrue("El formulario de detalles del pago no se verifica.", formulario.isDisplayed());

    }

    public static void ingresoDatosFormulario() throws InterruptedException {
        setInput(AutomationTestingConstants.FORM_CHECKOUT_FN_ID, "Nicolas");
        setInput(AutomationTestingConstants.FORM_CHECKOUT_LN_ID, "Olivos");
        setInput(AutomationTestingConstants.FORM_CHECKOUT_PF_ID, "123456879");
        setInput(AutomationTestingConstants.FORM_CHECKOUT_EMAIL_ID, "nico_olivos@outlook.com");
        click(AutomationTestingConstants.FORM_CHECKOUT_COUNTRY_LIST_ID);
        setInput(AutomationTestingConstants.FORM_INPUT_COUNTRY_ID, "Argentina");
        click(AutomationTestingConstants.FORM_CHECKOUT_FIRST_OPTION_XPATH);
        setInput(AutomationTestingConstants.FORM_CHECKOUT_ADDRESS_ID, "Velez 2427");
        setInput(AutomationTestingConstants.FORM_CHECKOUT_CITY_ID, "Corrientes");
        click(AutomationTestingConstants.FORM_CHECKOUT_STATE_ID);
        setInput(AutomationTestingConstants.FORM_INPUT_STATE_ID, "Corrientes");
        click(AutomationTestingConstants.FORM_CHECKOUT_FIRST_OPTION_STATE_XPATH);
        setInput(AutomationTestingConstants.FORM_CHECKOUT_PD_ID, "3400");
        Thread.sleep(120);

    }

    public static void metodoPago(){
        waitClickable(AutomationTestingConstants.FORM_CHECKOUT_PAY_METHOD_XPATH);
    }

    public static void aplicacionCupon(){
        WebElement verificacionCupon = WebActionManager.getElement(AutomationTestingConstants.COUPON_APPLY_XPATH);
        Assert.assertTrue("La posibilidad de aplicar el cupon no se encuentra disponible", verificacionCupon.isDisplayed());
    }

    public static void clickButtonPlaceOrder() throws InterruptedException {
        waitClickable(AutomationTestingConstants.PLACE_ORDER_BUTTON_ID);
        Thread.sleep(30000);
        click(AutomationTestingConstants.PLACE_ORDER_BUTTON_ID);
        Thread.sleep(30000);
    }

    public static void verificacionDetalleOrden(){
        WebElement orderDetails = WebActionManager.getElement(AutomationTestingConstants.ORDER_DETAILS_XPATH);
        Assert.assertTrue("La orden de detalle de compra no esta visible.", orderDetails.isDisplayed());

    }

    public static void clickAgregarLibroDesdeShop(){
        click(AutomationTestingConstants.BOOK_BUTTON_CART);
    }


    public static void indiaBoxCountry(){
        click(AutomationTestingConstants.FORM_CHECKOUT_COUNTRY_LIST_ID);
        setInput(AutomationTestingConstants.FORM_INPUT_COUNTRY_ID, "India");
        click(AutomationTestingConstants.FORM_CHECKOUT_SECOND_OPTION_XPATH);
    }

    public static void verifyPorcMinimo(){
        String valor = getText(AutomationTestingConstants.ITEM_PRICE_XPATH);
        int valor2 = Integer.parseInt(valor);
        System.out.println("El valor parcial es: "+valor2);
    }


}


