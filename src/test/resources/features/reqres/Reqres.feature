#Feature: ALTA QE BATCH 12
#  @Latihan
#  Scenario Outline: Get list user with valid parameter page
#    Given Get list user with valid parameter page <page>
#    When Send request get list users
#    Then Status code should be 200 OK
#    And Response body page should be <page>
#    And Validate get list users JSON schema "ListUsersSchema.json"
#    Examples:
#      | page |
#      | 1    |
#      | 2    |
#    @Latihan
#    Scenario: Post create a new user with valid json
#      Given Create new user with valid json "User.json"
#      When Send request post create new user
#      Then Status code should be 201 created
#      And Response body name was "faruqi" and job was "qa"
#      And Validate create a new user JSON schema "CreateUserSchema.json"
#    @Latihan
#    Scenario Outline: Put update user with valid json and user id
#      Given Update user with valid json "<jsonFile>" and user id <id>
#      When Send request put update user
#      Then Status code should be 200 OK
#      And Response body name was "<name>" and job was "<job>"
#      And Validate put update JSON schema "PutUpdateUserSchema.json"
#      Examples:
#        | id | jsonFile         | name     | job           |
#        | 1  | UpdateUser.json  | faruqi   | qa engineer   |
#        | 2  | UpdateUser2.json | morpheus | zion resident |
#        | 3  | UpdateUser3.json | aa       | a resident    |
#  @Latihan
#    Scenario Outline: Delete a user with valid user id
#      Given Delete a user with valid user id <id>
#      When Send request delete user
#      Then Status code should be 204 No Content
#      Examples:
#        | id |
#        | 1  |
#        | 2  |
#
