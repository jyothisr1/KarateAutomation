Feature: Get list of booking
  Scenario: verify user can retrieve list of booking
    Given url host
    When method get
    Then status 200
    And print response