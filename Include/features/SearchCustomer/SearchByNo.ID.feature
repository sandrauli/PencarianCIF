
Feature: Search by No.ID
 

  @SearchByNo.ID
  Scenario Outline: SearchByNo.ID
    Given user klik non monitory
    Then user klik CIF
    And user klik inquiry
    And user input idnum <idnum>
    And user klik button search
    And wait for minutes 
    And verify <idnum>
    And user klik logout

    Examples: 
      | idnum | 
      | 3271060405830025 | 
      