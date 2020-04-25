
Feature: Search Customer By variation
  

  @SearchCustomer
  Scenario Outline: Search Customer
    Given user klik non monitory
    Then user klik CIF
    And user klik inquiry
    And user input account <account>
    And user klik button search 
    Then verify result <result>
    And wait for minutes
    And user klik logout

    Examples: 
      | account  |  result|
      | 478732747332628 | Data tidak ditemukan  |

     