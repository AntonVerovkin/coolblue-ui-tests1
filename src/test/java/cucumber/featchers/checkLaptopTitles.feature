Feature: Check Search Page shows try-again message

  Scenario Outline: open Home Page
    Given User2 wrote incorrect request down: <request2>
    Then User2 should be able to see try-again message

    Examples:
      | request2       |
      | laptop         |
      | windows laptop |
      | apple laptop   |