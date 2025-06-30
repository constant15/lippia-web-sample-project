
@HomePage
Feature: Home Page

  @Smoke
  Scenario: Inicio-Llegadas-Añadir al carrito-Artículos-Finalizar compra-Pasarela de pago
    Given Estoy en la URL http://practice.automationtesting.in
    When Hago click en el menu 'Comercio'
    And Hago click en el boton del 'Home menu'
    Then La página de inicio debe mostrar exactamente 3 arrivals
    When Hago click en la imagen de uno de los arrivals
    And El sitio web muestra la página de detalles del libro
    And Hago click en el botón 'Agregar al carrito'
    Then Se verifica que el libro con su precio se muestra en el menu 'Item'
    When Hago click en el enlace 'Items'
    Then Se verifica el subtotal y total justo encima del botón 'Pasar por la caja'
    When Hago click en el boton 'Pasar por la caja'
    Then Se verifica los detalles de facturación, detalles del pedido, informacion adicional y pasarela de pago
    When Completo el formulario de facturación con sus datos
    And Elijo un método de pago como transferencia, cheque, efectivo o PayPal
    Then Se verifica la posibilidad de poder aplicar un cupón y visualizar toda la información del pedido



  @Smoke
  Scenario: Inicio - Llegadas - Agregar al carrito - Ítems - Checkout - Pasarela de Pago - Realizar pedido
    Given Estoy en la URL http://practice.automationtesting.in
    When Hago click en el menu 'Comercio'
    And Hago click en el boton del 'Home menu'
    Then La página de inicio debe mostrar exactamente 3 arrivals
    When Hago click en la imagen de uno de los arrivals
    And El sitio web muestra la página de detalles del libro
    And Hago click en el botón 'Agregar al carrito'
    Then Se verifica que el libro con su precio se muestra en el menu 'Item'
    When Hago click en el enlace 'Items'
    Then Se verifica el subtotal y total justo encima del botón 'Pasar por la caja'
    When Hago click en el boton 'Pasar por la caja'
    Then Se verifica los detalles de facturación, detalles del pedido, informacion adicional y pasarela de pago
    When Completo el formulario de facturación con sus datos
    And Elijo un método de pago como transferencia, cheque, efectivo o PayPal
    And Hago click en el boton 'Realizar pedido' para completar el proceso
    Then Se completa el proceso y la página navega a una pantalla de Confirmación de Pedido con detalles del pedido, datos bancarios, datos del cliente y de facturación

