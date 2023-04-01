@qestit
Feature: es muss überprüft werden, ob Sprache der Webseite geändert werden kann

  Scenario: der Nutzer bestätigt, dass Sprache der Webseite geändert werden kann

    Given Benutzer geht zu url
    And   Bestätigt, dass Sprache der Webseite geändert werden kann
    Then  Benutzer quit Driver