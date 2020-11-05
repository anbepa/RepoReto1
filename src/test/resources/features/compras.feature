Feature: se necesita ingresar a  la pagina de mercado libre y comprar un producto

Scenario:Buscar y agregar al carritos de compras
  Given el el cliente  Arturo  busca la compra
  When ingresa  el nombre  mascara  al carro
  Then se visualizara un mensaje de logeo

