@login1
Feature: Como usuario
  Quero realizar o login
  Para acessar a pagina

  Background: Acessar a tela de login
    Given que esteja na tela de login
  @loginPositivo
  Scenario: Login valido
    And preencher o usuario
    And preencher a senha
    When realizar o login
    Then login realizado com sucesso

  @testeNegativo
  Scenario: Login com dados invalido
    But preencher com usuario invalido
    But preencher a senha invalida
    When realizar o login
    Then sistema apresenta mensagem de usuario email invalido




