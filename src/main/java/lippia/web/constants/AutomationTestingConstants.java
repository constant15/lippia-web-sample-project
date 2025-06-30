package lippia.web.constants;

public class AutomationTestingConstants {

    //Login
    public static final String MY_ACCOUNT_BUTTON_ID = "id:menu-item-50";
    public static final String INPUT_EMAIL_ID = "id:username";
    public static final String INPUT_PASSWORD_ID = "id:password";
    public static final String LOGIN_BUTTON_ID = "name:login";

    public static final String LOGIN_OUT_XPATH = "xpath://*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a";
    public static final String ERROR_MESSAGE_XPATH = "xpath://*[@id=\"page-36\"]/div/div[1]/ul/li";

    public static final String SIGN_OUT_XPATH = "xpath://*[@id=\"page-36\"]/div/div[1]/div/p[1]/a";

    //Registration
    public static final String INPUT_EMAIL_REGISTER_ID = "id:reg_email";
    public static final String INPUT_PASSWORD_REGISTER_ID = "id:reg_password";

    public static final String REGISTER_BUTTON_XPATH = "xpath://*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]";

    public static final String ERROR_REGISTRATION_XPATH = "xpath://*[@id=\"page-36\"]/div/div[1]/ul/li";

    //MyAccount

    public static final String ACCOUNT_DETAILS_XPATH = "xpath://*[@id=\"page-36\"]/div/div[1]/nav/ul/li[5]/a";
    public static final String FORM_DETAILS_XPATH = "xpath://*[@id=\"page-36\"]/div/div[1]/div/form";
    public static final String SHOP_BUTTON_ID = "id:menu-item-40";
    public static final String HOME_BUTTON_XPATH = "xpath://*[@id=\"header\"]/div[1]";
    public static final String PRODUCT_XPATH = "xpath://*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div/ul/li";
    public static final String PRODUCTS_ARRIVALS_XPATH = "xpath://*[@id=\"themify_builder_content-22\"]/div[2]/div/div/div/div/div[2]/div";
    public static final String DESCRIPTION_BUTTON_XPATH = "xpath://*[@id=\"product-160\"]/div[3]/ul/li[1]";
    public static final String ADD_BASKET_BUTTON_XPATH = "xpath://*[@id=\"product-160\"]/div[2]/form/button";
    public static final String ITEM_MENU_BUTTON = "xpath://*[@id=\"wpmenucartli\"]/a/span[1]";
    public static final String CHECKOUT_BUTTON_XPATH = "xpath://*[@id=\"page-34\"]/div/div[1]/div/div/div/a";

    public static final String FORM_CHECKOUT_ID = "id:customer_details";

    //Datos para el formulario de pedido

    public static final String FORM_CHECKOUT_FN_ID = "id:billing_first_name";
    public static final String FORM_CHECKOUT_LN_ID = "id:billing_last_name";
    public static final String FORM_CHECKOUT_PF_ID = "id:billing_phone";
    public static final String FORM_CHECKOUT_EMAIL_ID = "id:billing_email";
    public static final String FORM_CHECKOUT_COUNTRY_LIST_ID = "id:s2id_billing_country";
    public static final String FORM_INPUT_COUNTRY_ID = "id:s2id_autogen1_search";
    public static final String FORM_CHECKOUT_FIRST_OPTION_XPATH = "xpath://*[@id=\"select2-results-1\"]/li[1]";
    public static final String FORM_CHECKOUT_ADDRESS_ID ="id:billing_address_1";
    public static final String FORM_CHECKOUT_CITY_ID ="id:billing_city";
    public static final String FORM_CHECKOUT_STATE_ID ="id:s2id_billing_state";
    public static final String FORM_INPUT_STATE_ID = "id:s2id_autogen2_search";
    public static final String FORM_CHECKOUT_FIRST_OPTION_STATE_XPATH = "xpath://*[@id=\"select2-results-2\"]/li[1]";

    public static final String FORM_CHECKOUT_PD_ID = "id:billing_postcode";
    public static final String FORM_CHECKOUT_PAY_METHOD_XPATH = "id:payment_method_bacs";

    public static final String COUPON_APPLY_XPATH = "xpath://*[@id=\"page-35\"]/div/div[1]/div[2]/a";
    public static final String PLACE_ORDER_BUTTON_ID = "id:place_order";
    public static final String ORDER_DETAILS_XPATH = "xpath://*[@id=\"page-35\"]/div/div[1]/p[1]";
    public static final String BOOK_BUTTON_CART = "xpath://*[@id=\"content\"]/ul/li[7]/a[2]";

    public static final String ITEM_PRICE_XPATH = "xpath://*[@id=\"order_review\"]/table/tfoot/tr[1]/td/span";
    public static final String FORM_CHECKOUT_SECOND_OPTION_XPATH = "xpath://*[@id=\"select2-results-1\"]/li[2]";
    public static final String ITEM_TAX_XPATH = "xpath://*[@id=\"order_review\"]/table/tfoot/tr[2]/td/span";

}

