Feature: Openpage
  Scenario: Deschide o pagina la alegere
    Given Deschid browserul
    When Accesez pagina "https://www.google.com"
    And Close the browser
