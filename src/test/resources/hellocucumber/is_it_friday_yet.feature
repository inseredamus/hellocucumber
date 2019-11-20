Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  Scenario: Calculate is not difficult
    Given The number X and the number Y
    When I add X to Y
    Then The result should be the sum X+Y