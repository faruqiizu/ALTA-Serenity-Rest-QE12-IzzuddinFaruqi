Feature: Update user
  @Tugas @PositiveCase
  Scenario Outline: Patch update with valid json and user id
  Given Update with valid json "<jsonFile>" and user id <id>
    When Send request patch update
    Then Status code should be 200
    And Response body name was "<name>" and job was "<job>"
    And Validate patch update JSON schema "PatchUpdateSchema.json"
    Examples:
      | id | jsonFile          | name      | job            |
      | 1  | PatchUpdate.json  | morpheus  | zion resident  |
      | 2  | PatchUpdate2.json | morpheus2 | zion resident2 |

  @Tugas @NegativeCase
  Scenario: Patch update user with blank name and job
    Given Patch update user with blank name and job in id 3
    When Send request patch update
    Then Status code should be 400