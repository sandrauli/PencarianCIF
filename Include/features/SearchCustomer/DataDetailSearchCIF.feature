
Feature: Data Detail Search CIF


  @DataDetailSearchCIF
  Scenario Outline: Data Detail Search CIF
    Given user klik non monitory
    Then user klik CIF
    And user klik inquiry
    And user input account <account>
    And user klik button search 
    And user scrool continue
    And user klik checkbox
    And wait for minutes
    And user klik continue
    And verify Data Debitur
		And user scrool continue
		And user klik continue
		And verify Alamat Sesuai ID
		And verify Alamat Domisili
		And verify Data Lainnya
	  And user scrool continue
		And user klik continue
		And verify Data Pekerjaan
		And verify Keluarga PEP
		And user scrool continue
		And user klik continue
    And verify Data Kantor
    And user scrool continue
    And user klik continue
    And verify Data Keuangan
    And user scrool finish
    And user klik finish
    And user klik logout
    
      Examples: 
      | account  | result  |
      | 020601000002561 | 020601000002561 |
