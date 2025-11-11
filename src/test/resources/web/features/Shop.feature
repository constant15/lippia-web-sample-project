@Ignore
@Shop
Feature: Shop


  Scenario: Compra de productos
    Given estoy en la URL https://www.saucedemo.com/
    When ingreso el usuario standard_user en la caja de texto 'Username'
    And ingreso la contraseña secret_sauce en la caja de texto 'Password'
    And hago click en el boton 'Login' e ingreso al sitio web
    And hago click en el boton 'Add to cart' de 2 productos diferentes
    And hago click en el boton 'cart'
    And se muestra el carrito de compras y hago click en el boton 'checkout'
    And ingreso un nombre en la caja de texto 'First name', un apellido en la caja de texto 'Last name' y un codigo postal en la caja de texto 'Zip/Postal Code'
    And hago click en el boton 'continue'
    And se verifica los productos en la pagina 'Overview' y hago click en el boton 'Finish'
    Then se verifica que la orden de compra fue realizada correctamente




