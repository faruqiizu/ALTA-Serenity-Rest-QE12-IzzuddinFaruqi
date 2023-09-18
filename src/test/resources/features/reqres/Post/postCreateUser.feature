Feature: Post create user
  @Latihan @PositiveCase
  Scenario: Post create a new user with valid json
    Given Create new user with valid json "User.json"
    When Send request post create new user
    Then Status code should be 201 created
    And Response body name was "faruqi" and job was "qa"
    And Validate create a new user JSON schema "CreateUserSchema.json"

  @Tugas @NegativeCase
  Scenario: Post create a new user with valid json
    Given Create new user with valid json "UserNameOnly.json"
    When Send request post create new user
    Then Status code should be 201 created
    And Response body name was "faruqi"
    And Validate create a new user JSON schema "CreateUserSchema.json"