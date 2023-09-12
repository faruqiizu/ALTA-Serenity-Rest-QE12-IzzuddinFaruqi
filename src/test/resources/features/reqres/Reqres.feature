Feature: ALTA QE BATCH 12
  @latihan
  Scenario Outline: Get list user with valid parameter page xyz
    Given Get list user with valid parameter page <page>
    When Send request get list users
    Then Status code should be 200 OK
    Examples:
      | page |
      | 1    |
      | 2    |
    @latihan
    Scenario: Post create a new user with valid json
      Given Create new user with valid json "User.json"
      When Send request post create new user
      Then Status code should be 201 created