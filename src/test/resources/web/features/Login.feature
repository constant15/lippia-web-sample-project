@Login

Feature: Login


  Scenario: Login con ingreso de datos validos
    Given estoy en la URL 'https://www.saucedemo.com'
    When ingreso el usuario standard_user en la caja de texto 'Username'
    And ingreso la contraseña secret_sauce en la caja de texto 'Password'
    And hago click en el boton 'Login'
    Then Se verifica que ingresa correctamente al sitio mostrando los productos



  @Smoke
  Scenario: Login usuario incorrecto pero con contraseña correcta
    Given estoy en la URL 'https://www.saucedemo.com'
    When ingreso un usuario incorrecto locked_out_user en la caja de texto 'Username'
    And ingreso la contraseña secret_sauce en la caja de texto 'Password'
    And hago click en el boton 'Login'
    Then muestra un mensaje de 'Epic sadface: Sorry, this user has been locked out.'
