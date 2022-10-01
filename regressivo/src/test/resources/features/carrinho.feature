
Feature: Validar carrinho
Como usuario
Quero incluir produtos no carrinho
Para realizar as compras

Scenario: Validar carrinho de compra 
Given selecione o tamanho
And selecionar o produto
When adicionar ao carrinho
Then validar informacoes 