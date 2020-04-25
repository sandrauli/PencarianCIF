
Feature: Search Customer by CIF
  

  @SearchByCIF
  Scenario Outline: SearchByCIF
    Given user klik non monitory
    When user klik CIF
    Then user klik inquiry
    And user input cifnum <cifnum>
    And user klik button search 
    And wait for minutes
    And verify <cifnum>


    Examples: 
      | cifnum      | result  |
      |  RP39804    | RP39804 |
      