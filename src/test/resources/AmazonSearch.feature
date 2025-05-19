@Amazon
Feature: Probar la Funcionalidad de Busqueda de Amazon

    @Cart               
    Scenario Outline: Como un cliente, cuando busco Alexa, quiero ver si la tercera opción en la segunda pagina esta disponible para la compra y que puede ser agregado al carro de compras
        Given el usuario navega a la pagina de amazon
        And busca el producto <Producto>
        And navega a la segunda pagina
        And selecciona el tercer articulo
        Then el usuario es capaz de agregarlo al carrito de compra
        
    Examples: 
        | Producto    |
        | Alexa       |
        | Xbox        |
        