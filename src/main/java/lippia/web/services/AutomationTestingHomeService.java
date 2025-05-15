package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java8.Ca;
import junit.framework.Assert;
import lippia.web.constants.AutomationTestingConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class AutomationTestingHomeService extends ActionManager {

    //ActionsHomePage
    public static void webPractica(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void ClickShopButton(){
        click(AutomationTestingConstants.SHOP_BUTTON_ID);
    }

    public static void ClickHomeButton(){
        click(AutomationTestingConstants.HOME_BUTTON_XPATH);
    }

    public static void Click_Next_Button(){
        click(AutomationTestingConstants.NEXT_BUTTON_CARROUSEL_XPATH);
    }

    public static void ClickUnElemento(){
        click(AutomationTestingConstants.PRODUCT_XPATH);
    }

    public static void ClickDescripcion(){
        click(AutomationTestingConstants.DESCRIPTION_BUTTON_XPATH);
    }

    public static void VerificacionElementos(){
        int var1 = 3;
        int CantProd = WebActionManager.getElements(AutomationTestingConstants.PRODUCTS_CARROUSEL_XPATH).size();
        Assert.assertEquals(var1, CantProd);
    }

    public static void VerificacionProductos(){
        int var2 = 3;
        int ProdNuevos = WebActionManager.getElements(AutomationTestingConstants.PRODUCTS_ARRIVALS_XPATH).size();
        Assert.assertEquals(var2, ProdNuevos);
    }

    public static void VerificacionDescripcion(){
        boolean Descripcion = Boolean.parseBoolean(WebActionManager.getElement(AutomationTestingConstants.DESCRIPTION_CONTENT_ID).getText());
        Assert.assertFalse("Es falso si el producto no tiene descripcion.", false);
    }



    //ActionsLogin

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

    public static void PasswordBoxEmpty(){
        Assert.assertFalse(AutomationTestingConstants.INPUT_PASSWORD_ID.isEmpty());

    }

    public static void EmailBoxEmpty(){
        Assert.assertFalse(AutomationTestingConstants.INPUT_EMAIL_ID.isEmpty());
    }

    //ActionsShop

    public static void ClickSorting(){
        click(AutomationTestingConstants.SORTING_BUTTON_XPATH);
    }


    public static void ClickLinkProduct(){
        click(AutomationTestingConstants.LINK_PRODUCT_XPATH);
    }

    public static void ClickProductOnSale(){
        click(AutomationTestingConstants.SALE_PRODUCT_XPATH);
    }

}
