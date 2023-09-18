Feature: Put update user
  @Latihan @PositiveCase
  Scenario Outline: Put update user with valid json and user id
    Given Update user with valid json "<jsonFile>" and user id <id>
    When Send request put update user
    Then Status code should be 200
    And Response body name was "<name>" and job was "<job>"
    And Validate put update JSON schema "PutUpdateUserSchema.json"
    Examples:
      | id | jsonFile         | name     | job           |
      | 1  | UpdateUser.json  | faruqi   | qa engineer   |
      | 2  | UpdateUser2.json | morpheus | zion resident |
      | 3  | UpdateUser3.json | aa       | a resident    |

  @Tugas @NegativeCase
  Scenario Outline: Put update user with name only
    Given Update user with invalid json "<jsonFile>" and user id <id>
    When Send request put update user
    Then Status code should be 200
    And Response body name was "<name>"
    And Validate put update JSON schema "PutUpdateUserSchema.json"
    Examples:
      | id | jsonFile         | name     | job |
      | 1  | UpdateUser.json  | faruqi   |     |
      | 2  | UpdateUser2.json | morpheus |     |

