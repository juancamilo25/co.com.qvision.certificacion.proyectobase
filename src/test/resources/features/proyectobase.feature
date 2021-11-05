#Autor: Juan Camilo Alvarez Barrios
@stories
  Feature: Usuario ingresa al portal web y realiza una compra
@scenario1
Scenario: Buscar un producto en la tienda
  Given el usuario se logea en la pagina SwagLabs
  When el usuario busca un producto en la pagina web
  Then realiza una compra de un bolso en la pagina y encuentra el mensaje THANK YOU FOR YOUR ORDER
