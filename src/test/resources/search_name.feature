Feature:
  Search Feature https://nameberry.com/

  Scenario Outline: Positive test
    Given user opens the site
    And user clicks on input
    When user searchers for <name>
    And user clicks on Search button
    Then user sees results
    And <name> should be displayed

    Examples:
    |name |
    |  Mike  |
    |  Mark  |
