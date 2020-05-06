

Feature: Searc By No.Id Variation
  

  @SearchByNoIDVariation
  Scenario Outline: Search BY ID
    Given user klik non monitory
    Then user klik CIF
    And user klik inquiry
    And user input idnum <idnum>
    And user klik button search 
    Then verify result <result>
    And wait for minutes
    And user klik logout


    Examples: 
      | idnum  | result |
      | 2737377732377372 | data not found | 