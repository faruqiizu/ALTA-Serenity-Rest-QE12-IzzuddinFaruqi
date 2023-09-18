Feature: Login user
  @Tugas @PositiveCase
    Scenario: Post login user with valid json
      Given Login user with valid json "PostLoginUser.json"
      When Send request post login user
      Then Status code should be 200
      And Response body token was "QpwL5tke4Pnpja7X4"
      And Validate post login JSON schema "PostLoginUserSchema.json"


  @Tugas @NegativeCase
    Scenario: Post login user with email only
      Given Login user with email only "PostLoginUserEmailOnly.json"
      When Send request post login user
      Then Status code should be bad request 400
      And Responses body error was "Missing password"
      And Validate post login JSON schema "PostLoginUserEmailOnlySchema.json"

  @Tugas @NegativeCase
  Scenario: Post login user with password only
    Given Login user with password only "PostLoginUserPasswordOnly.json"
    When Send request post login user
    Then Status code should be bad request 400
    And Responses body error was "Missing email or username"
    And Validate post login JSON schema "PostLoginUserEmailOnlySchema.json"

  @Tugas @NegativeCase
  Scenario: Post login user with blank username and password
    Given Login user with username and password "PostLoginUserBlankEmailAndPassword.json"
    When Send request post login user
    Then Status code should be bad request 400
    And Responses body error was "Missing email or username and password"
    And Validate post login JSON schema "PostLoginUserEmailAndPasswordSchema.json"