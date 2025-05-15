@Ignore
@HomePage
Feature: Home Page

  @Smoke
  Scenario: Home page with three sliders only
    Given estoy en la URL http://practice.automationtesting.in
    When hago click en el menu 'Comercio'
    And hago click en el boton del 'home menu'
    Then la home page tiene solo 3 deslizables


  @Smoke
  Scenario: Home page with three arrivals only
    Given estoy en la URL http://practice.automationtesting.in
    When hago click en el menu 'Comercio'
    And hago click en el boton del 'home menu'
    Then la home page tiene solo 3 productos


  @Smoke
  Scenario: Home page - Arrivals-Image-Description
    Given estoy en la URL http://practice.automationtesting.in
    When hago click en el menu 'Comercio'
    And hago click en el boton del 'home menu'
    And hago click en la primer imagen en el catalogo
    And hago click en la pestaña 'Descripción' del libro que seleccioné anteriormente
    Then la pagina me muestra la 'Descripcion' del libro en el que hice click



