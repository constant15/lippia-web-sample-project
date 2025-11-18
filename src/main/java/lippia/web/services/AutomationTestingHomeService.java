package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java8.Ca;
import junit.framework.Assert;
import lippia.web.constants.AutomationTestingConstants;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class AutomationTestingHomeService extends ActionManager {


    public static void webPractica(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    //ActionsLogin

    public static void EnterUser(String user){
        setInput(AutomationTestingConstants.INPUT_USERNAME_ID, user);
    }

    public static void EnterPassword(String pass){
        setInput(AutomationTestingConstants.INPUT_PASSWORD_ID, pass);
    }


    public static void checkCartButton(){
        WebElement buttonCart= WebActionManager.getElement(AutomationTestingConstants.CART_BUTTON_ID);
        Assert.assertTrue("El botón del carrito no está visible", buttonCart.isDisplayed());
    }
    public static void ClickLoginButton(){
        click(AutomationTestingConstants.LOGIN_BUTTON_ID);
    }


    public static void usernameCheck(){
        WebElement errorMessage = WebActionManager.getElement(AutomationTestingConstants.ERROR_MESSAGE_XPATH);
        Assert.assertTrue("El mensaje de error no esta visible", errorMessage.isDisplayed());
    }

    public static void clickCart() throws InterruptedException {
        Thread.sleep(4000);
        click(AutomationTestingConstants.BUTTON_ADDTOCART_PRODUCT_ID);
        Thread.sleep(4000);
        click(AutomationTestingConstants.CART_BUTTON_ID);
        Thread.sleep(4000);
    }

    public static void productDisplayed() {
        WebElement product = WebActionManager.getElement(AutomationTestingConstants.BUTTON_CART_ENABLED_XPATH);
        Assert.assertTrue("No hay un producto en el carrito.", product.isDisplayed());
    }

    public static void clickRemoveProduct(){
        click(AutomationTestingConstants.BUTTON_REMOVE_PRODUCT_CART_ID);
    }

    public static void productDisplayedAct() {
        WebElement product = WebActionManager.getElement(AutomationTestingConstants.BUTTON_CART_ENABLED_XPATH);
        if(!product.isDisplayed()){
            System.out.println("No hay productos en el carrito.");
        }
    }

    public static void clickProductsCart() throws InterruptedException {
        click(AutomationTestingConstants.BUTTON_ADDTOCART_PRODUCT_ID);
        Thread.sleep(4000);
        click(AutomationTestingConstants.BUTTON_ADDCART_PRODUCT2_ID);
    }

    public static void clickCartButton(){
        click(AutomationTestingConstants.CART_BUTTON_ID);
    }

    public static void clickCheckout(){
        click(AutomationTestingConstants.BUTTON_CHECKOUT_ID);
    }

    public static void clickContinue(){
        click(AutomationTestingConstants.BUTTON_CART_CONTINUE_ID);
    }

    public static void addData(String nombre, String apellido, int cp){
        setInput(AutomationTestingConstants.FIRSTNAME_BOX_ID, nombre);
        setInput(AutomationTestingConstants.LASTNAME_BOX_ID, apellido);
        setInput(AutomationTestingConstants.CP_BOX_ID, String.valueOf(cp));
    }

    public static void verifyCheckout(){
        boolean listaProducto = WebActionManager.getElement(AutomationTestingConstants.CHECKOUT_CONTAINER_XPATH).isDisplayed();
        Assert.assertTrue("La lista de productos no es visible.", listaProducto);
    }

    public static void clickFinish(){
        click(AutomationTestingConstants.FINISH_BUTTON_ID);
    }

    public static void completeOrder(){
        boolean order = WebActionManager.getElement(AutomationTestingConstants.BUY_CONTAINER_ID).isDisplayed();
        Assert.assertTrue("La orden no se completo correctamente.", order);
    }
}

