Feature: Ingresar a la BACS

  Scenario Outline:Loguearse
    Given User ingresa a la pagina del navigator
    When User acepta los terminos
    And ingresa su usuario <usuario> y contraseña <contraseña>
    Then realiza la busqueda del documento <doc>


    Examples:
      |usuario                               |contraseña  |doc  |
      |joel.armando.leiva.collazos@everis.com|JoelLeiva30*|CP099|
