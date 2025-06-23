@Ignore
@Login
Feature: Login

  @Smoke
  Scenario: Login con ingreso de datos validos
    Given Estoy en la URL http://practice.automationtesting.in
    When Hago click en el boton 'Mi cuenta'
    And Ingreso el correo electronico nico_olivos@outlook.com en la caja de texto 'Nombre de usuario o dirección de correo electrónico'
    And Ingreso la contraseña PruebaCasos123 en la caja de texto 'Contraseña' y hago click en el boton 'Acceso'
    Then Ingreso correctamente al sitio web con el usuario

  @Smoke
  Scenario: Los datos ingresados se distinguen de las mayusculas y las minusculas.
    Given Estoy en la URL http://practice.automationtesting.in
    When Hago click en el boton 'Mi cuenta'
    And Ingreso el nombre de usuario NiCo_OLivOs con letras mayusculas y minusculas en la caja de texto 'Nombre de usuario o dirección de correo electrónico'
    And Ingreso la contraseña PrUeBasCaSOS123 con letras mayusculas y minusculas en la caja de texto 'Contraseña'
    And Hago click en el boton 'Acceso'
    Then Se verifica que el ingreso a la cuenta falla debido a datos de ingreso incorrectos.


  @Smoke
  Scenario: Autenticacion de los datos ingresados para el login.
    Given Estoy en la URL http://practice.automationtesting.in
    When Hago click en el boton 'Mi cuenta'
    And Ingreso el nombre de usuario nico_olivos en la caja de texto 'Nombre de usuario o dirección de correo electrónico'.
    And Ingreso la contraseña PruebaCasos123 en la caja de texto 'Contraseña' y hago click en el boton 'Acceso'
    And Hago click en el boton 'Sign out'
    And Hago click en el boton 'Retroceder' del navegador
    Then Se verifica que el usuario no inicia sesión en su cuenta, sino que debe ser visible una página web general.


