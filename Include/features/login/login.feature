
Feature: login


  @login
  Scenario Outline: login
    Given user berada di halaman login
    When user input username <username>
    Then user input password <password>
    And user klik submit
    
 
      
  Examples: 
      |username  | password | status  |
      | 0206196 |    00000000 | success |
      