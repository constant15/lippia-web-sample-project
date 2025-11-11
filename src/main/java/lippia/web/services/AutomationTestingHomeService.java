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

}

//*[@id="login_button_container"]/div/form/div[3]/h3/text()
//*[@id="login_button_container"]/div/form/div[3]