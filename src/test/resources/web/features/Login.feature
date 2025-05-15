@Login

Feature: Login

  @Smoke
  Scenario: Login con ingreso de datos validos
    Given estoy en la URL http://practice.automationtesting.in
    When hago click en el menu 'Mi cuenta'
    And ingreso el correo electronico nico_olivos@outlook.com en la caja de texto 'Username or email address'
    And ingreso la contraseña PruebaCasos123 en la caja de texto 'Password'
    Then hago click en el boton 'Login' e ingreso al sitio web

  @Smoke
  Scenario: Login con usuario correcto pero sin contraseña
    Given estoy en la URL http://practice.automationtesting.in
    When hago click en el menu 'Mi cuenta'
    And ingreso el correo electronico nico_olivos@outlook.com en la caja de texto 'Username or email address'
    And no ingreso la contraseña  en la caja de texto 'Password'
    And hago click en el boton 'Login'
    Then muestra un mensaje de 'Error: Password is required' y vuelve a mostrar la pagina para el login.

  @Smoke
  Scenario: Login sin usuario pero con contraseña
    Given estoy en la URL http://practice.automationtesting.in
    When hago click en el menu 'Mi cuenta'
    And no ingreso el correo electronico  en la caja de texto 'Username or email address'
    And ingreso la contraseña PruebaCasos123 en la caja de texto 'Password'
    And hago click en el boton 'Login'
    Then muestra un mensaje de 'Error: Username is required' y vuelve a mostrar la pagina para el login.
