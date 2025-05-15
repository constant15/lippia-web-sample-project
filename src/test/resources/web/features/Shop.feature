@Shop
Feature: Shop

  @Smoke
  Scenario: Shop-default sorting funtionality
    Given estoy en la URL http://practice.automationtesting.in
    When hago click en el menu 'Comercio'
    And Hago clic en el elemento Ordenar por popularidad en el menu desplegable de ordenacion predeterminada.
    Then Ahora el usuario puede ver solo los productos populares


    @Smoke
  Scenario: Shop-Product Categories Funcionality
    Given estoy en la URL http://practice.automationtesting.in
    When hago click en el menu 'Comercio'
    And Hago click en cualquiera de los enlaces que se encuentran en 'Products Categories'
    Then La pagina me muestra los productos de esa categoria en particular

  @Smoke
  Scenario: Shop-Sale Functionality
    Given estoy en la URL http://practice.automationtesting.in
    When hago click en el menu 'Comercio'
    And hago click en el nombre del producto a la venta en oferta en la home page
    Then la pagina me muestra el precio actual y el precio anterior de dicho producto