@Ignore
@Registration
Feature: Registration

  @Smoke
  Scenario Outline: Registracion en el sitio Web con datos invalidos
    Given Estoy en la URL http://practice.automationtesting.in
    When Hago click en el boton 'Mi cuenta'
    And Ingreso el correo electronico <correo> en la caja de texto 'Dirección de correo electrónico' del formulario de Registro
    And Ingreso la contraseña <password> en la caja de texto 'Contraseña' del formulario de Registro
    And Hago click en el boton 'Registro'
    Then Se verifica que el registro en el sitio web falla por <motivo>




    Examples:
      | correo            | password | motivo  |
      | nico123@gmail.com |          |    1    |
      |                   |          |    2    |






