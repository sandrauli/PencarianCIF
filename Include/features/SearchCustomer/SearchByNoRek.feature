
Feature: Search Customer 
  @SearchByNorek
  Scenario Outline: SearchByNoRek
    Given user klik non monitory
    Then user klik CIF
    And user klik inquiry
    And user input account <account>
    And user klik button search
    And wait for minutes
    And verify <account>
    And user klik logout
    

    Examples: 
      | account  | result  |
      | 020601000002561 | 020601000002561 |
      
     
      