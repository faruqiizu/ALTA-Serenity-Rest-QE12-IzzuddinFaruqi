Feature: Get single resource
  @Tugas @PositiveCase
  Scenario Outline: Get single resource with valid parameter id
    Given Get single resource with valid parameter <id>
    When Send request get single resource
    Then Status code should be 200
    And Response body single resource page should be <id>
    And Validate get single resource JSON schema "GetSingleResourceSchema.json"
    Examples:
      | id |
      | 1  |
      | 2  |