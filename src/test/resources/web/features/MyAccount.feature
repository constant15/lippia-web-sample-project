
@MyAccount
Feature: MyAccount

  @Smoke
  Scenario: Mi cuenta - Detalles de la cuenta
    Given Estoy en la URL http://practice.automationtesting.in
    When Hago click en el boton 'Mi cuenta'
    And Ingreso el correo electronico nico_olivos@outlook.com en la caja de texto 'Nombre de usuario o dirección de correo electrónico'
    And Ingreso la contraseña PruebaCasos123 en la caja de texto 'Contraseña' y hago click en el boton 'Acceso'
    And Hago click en el boton 'Mi cuenta'
    And Hago click en 'Detalles de la cuenta'
    Then Se verifica que el usuario visualiza los detalles de su cuenta

  @Smoke
  Scenario: Mi cuenta - Log-Out
    Given Estoy en la URL http://practice.automationtesting.in
    When Hago click en el boton 'Mi cuenta'
    And Ingreso el correo electronico nico_olivos@outlook.com en la caja de texto 'Nombre de usuario o dirección de correo electrónico'
    And Ingreso la contraseña PruebaCasos123 en la caja de texto 'Contraseña' y hago click en el boton 'Acceso'
    And Hago click en el boton 'Mi cuenta'
    Then Al hacer clic en 'Cerrar sesión', el usuario sale correctamente del sitio








