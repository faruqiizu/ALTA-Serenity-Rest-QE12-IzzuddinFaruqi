Feature: delete user
@Latihan @PositiveCase
    Scenario Outline: Delete a user with valid user id
      Given Delete a user with valid user id <id>
      When Send request delete user
      Then Status code should be 204
      Examples:
        | id |
        | 1  |
        | 2  |

@Tugas @NegativeCase
  Scenario Outline: Delete a user with invalid user id
    Given Delete a user with invalid user id <id>
    When Send request delete user
    Then Status code should be 400
    Examples:
      | id  |
      | ini |
      | 2   |