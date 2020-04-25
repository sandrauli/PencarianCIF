
Feature: Search by CIF Variation

  @tag1
  Scenario Outline: Search by CIF Variation
    Given user berada di halaman login
    When user input username <username>
    Then user input password <password>
    And user klik submit
    Given user klik non monitory
    Then user klik CIF
    And user klik inquiry
    And user input cifnum <cifnum>
    And user klik button search 
    And wait for minutes
    Then verify result <result>
    And wait for minutes
    And user klik logout
    
    Examples: 
      | cifnum  | result  |username  | password | status  |
      | 3874837 |  No records found | 0206196 |    00000000 | success |
      | tyttttt |  No records found | 0206103 |    00000000 | success |

        

    
      
     