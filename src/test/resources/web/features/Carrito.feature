@Carrito
Feature: Carrito


  @Smoke
  Scenario: Agregar producto al carrito
    Given estoy en la URL 'https://www.saucedemo.com'
    When ingreso el usuario standard_user en la caja de texto 'Username'
    And ingreso la contraseña secret_sauce en la caja de texto 'Password'
    And hago click en el boton 'Login'
    And hago click en el boton 'Add to cart' de un producto
    Then se verifica que en el carrito de compras hay un producto agregado


  @Smoke
  Scenario: Eliminar el producto del carrito
    Given estoy en la URL 'https://www.saucedemo.com'
    When ingreso el usuario standard_user en la caja de texto 'Username'
    And ingreso la contraseña secret_sauce en la caja de texto 'Password'
    And hago click en el boton 'Login'
    And hago click en el boton 'Add to cart' de un producto
    And hago click en el boton 'Remove' del producto
    Then se verifica que se vacia el carrito de compras




