
@Shop
Feature: Shop
  @Ignore
  @Smoke
  Scenario: Usuario agrega un libro desde Shop y realiza el proceso de compra
    Given Estoy en la URL http://practice.automationtesting.in
    When Hago click en el menu 'Comercio'
    And Hago click en el botón 'Agregar al carrito' del libro
    Then Se verifica que el libro con su precio se muestra en el menu 'Item'
    When Hago click en el enlace 'Items'
    Then Se verifica el subtotal y total justo encima del botón 'Pasar por la caja'
    When Hago click en el boton 'Pasar por la caja'
    Then Se verifica los detalles de facturación, detalles del pedido, informacion adicional y pasarela de pago
    When Completo el formulario de facturación con sus datos
    And Elijo el metodo de pago 'Transferencia bancaria directa'
    And Hago click en el boton 'Realizar pedido' para completar el proceso
    Then Se completa el proceso y la página navega a una pantalla de Confirmación de Pedido con detalles del pedido, datos bancarios, datos del cliente y de facturación


  @Smoke
  Scenario: Tienda-Añadir al carrito-Ver carrito-Funcionalidad de impuestos
    Given Estoy en la URL http://practice.automationtesting.in
    When Hago click en el menu 'Comercio'
    And Hago click en el botón 'Agregar al carrito' del libro
    Then Se verifica que el libro con su precio se muestra en el menu 'Item'
    When Hago click en el enlace 'Items'
    Then Se verifica el subtotal y total justo encima del botón 'Pasar por la caja'
    When Hago click en el boton 'Pasar por la caja'
    And Ingreso en el detalle de facturacion en la caja de texto 'Pais' a India
    Then Se verifica que el pedido tendra una tasa impositiva del 2%
    #When Ingreso en el detalle de facturacion en la caja de texto 'Pais' a un pais extranjero a India
    #Then Se verifica que en el pedido tendra una tasa impositiva del 5%




