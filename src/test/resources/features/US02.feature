@qestit
Feature: es muss überprüft werden, ob mainTitle die WebSeite erneuet

  Scenario: der Nutzer bestätigt, dass mainTitle die WebSeite erneuet

    Given Benutzer geht zu url
    And   Bestätigt, dass mainTitle die WebSeite erneuet
    Then  Benutzer quit Driver