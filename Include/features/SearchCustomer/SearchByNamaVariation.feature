
Feature: Search Nama Variation
 

  @SearchByNamaVariation
  Scenario Outline: Search Nama Variation
    Given refresh the browser
    Given user berada di halaman login
    When user input username <username>
    Then user input password <password>
    And user klik submit
    Given user klik non monitory
    Then user klik CIF
    And user klik inquiry
    And user input nama <nama>
    And user input tgl_lahir <tgl_lahir>
    And user klik button search
    And wait for minutes 
    And user klik logout

    Examples: 
      | nama         | tgl_lahir      | result                   |username  | password | status  |
      |    ""       |     1983-05-04 | nama nasabah harus diisi! |0206105 |    00000000 | success |
	    | Rudi Wiranto |          ""  | Tanggal Lahir harus diisi! | 0206198 |    00000000 | success |
	  
    