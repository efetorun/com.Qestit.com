@qestit
Feature: es muss überprüft werden, ob die URL zugänglich ist

  Scenario: der Nutzer bestätigt, dass die URL zugänglich ist

    Given Benutzer geht zu url
    Then  Bestätigt, dass die Url zugänglich ist