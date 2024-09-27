Feature:Validating create token

  Background:
    * def body = read("classpath://json//create_token.json")

  Scenario: verify user can create token
    Given url host
    And path '/auth'
    And header Content-Type = "application/json"
    And header Accept = "application/json"
    And set body
    When request post
    Then status 200
    And print response