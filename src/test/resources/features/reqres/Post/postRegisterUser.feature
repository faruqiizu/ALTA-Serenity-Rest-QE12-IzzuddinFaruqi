Feature: Register user
  @Tugas @PositiveCase
  Scenario Outline: Post register user with valid json
    Given Register user with valid json "PostRegisterNewUser.json"
    When Send request post register user
    Then Status code should be 200
    And Response body id was <id> and token was "<token>"
    And Validate post register JSON schema "PostRegisterNewUserSchema.json"
      Examples:
        | id | token             |
        | 4  | QpwL5tke4Pnpja7X4 |

  @Tugas @NegativeCase
  Scenario: Post register user with email only
    Given Register user with email only "PostRegisterNewUserEmailOnly.json"
    When Send request post register user
    Then Status code should be bad request 400
    And Responses body error was "Missing password"
    And Validate post register JSON schema "PostRegisterNewUserEmailOnlySchema.json"

  @Tugas @NegativeCase
  Scenario: Post register user with password only
    Given Register user with password only "PostRegisterNewUserPasswordOnly.json"
    When Send request post register user
    Then Status code should be bad request 400
    And Responses body error was "Missing email or username"
    And Validate post register JSON schema "PostRegisterNewUserPasswordOnlySchema.json"
