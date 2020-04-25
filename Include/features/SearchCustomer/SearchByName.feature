
Feature: Search By Nama Dan Tanggal Lahir
 

  @SearchByName
  Scenario Outline: Search By Name
    Given refresh the browser
    Given user klik non monitory
    Then user klik CIF
    And user klik inquiry
    And user input nama <nama>
    And user input tgl_lahir <tgl_lahir>
    And user klik button search
    And verify <nama>
    And verify <tgl_lahir>
    And user klik logout

    Examples: 
      | account  | tgl_lahir | 
      | RUDI WINARTO |  1983-05-04 | 
    