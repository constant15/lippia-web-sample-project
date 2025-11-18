@Shop
Feature: Shop

@Smoke
  Scenario: Validacion de datos
    Given estoy en la URL 'https://www.saucedemo.com'
    When ingreso el usuario standard_user en la caja de texto 'Username'
    And ingreso la contraseña secret_sauce en la caja de texto 'Password'
    And hago click en el boton 'Login'
    And hago click en el boton 'Add to cart' de dos productos diferentes
    And hago click en el boton 'Cart'
    And se muestra el carrito de compras y hago click en el boton 'Checkout'
    And ingreso el nombre Nicolas en la caja de texto 'First Name', ingreso el apellido Perez en la caja de texto 'Last Name' y el codigo postal 2000 en la caja de texto 'Zip/Postal Code'
    And hago click en el boton 'Continue'
    Then se verifica que se validan los datos ingresados

@Smoke
  Scenario: Compra de productos
    Given estoy en la URL 'https://www.saucedemo.com'
    When ingreso el usuario standard_user en la caja de texto 'Username'
    And ingreso la contraseña secret_sauce en la caja de texto 'Password'
    And hago click en el boton 'Login'
    And hago click en el boton 'Add to cart' de dos productos diferentes
    And hago click en el boton 'Cart'
    And se muestra el carrito de compras y hago click en el boton 'Checkout'
    And ingreso el nombre Nicolas en la caja de texto 'First Name', ingreso el apellido Perez en la caja de texto 'Last Name' y el codigo postal 2000 en la caja de texto 'Zip/Postal Code'
    And hago click en el boton 'Continue'
    And se verifica los productos en la pagina 'Overview' y hago click en el boton 'Finish'
    Then se verifica que la orden de compra fue realizada correctamente



