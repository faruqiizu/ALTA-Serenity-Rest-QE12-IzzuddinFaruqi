Feature: Get list users
  @Latihan @PositiveCase
  Scenario Outline: Get list user with valid parameter pages
    Given Get list users with valid parameter page <page>
    When Send request get list users
    Then Status code should be 200
    And Response body page should be <page>
    And Validate get list users JSON schema "ListUsersSchema.json"
    Examples:
      | page |
      | 1    |
      | 2    |