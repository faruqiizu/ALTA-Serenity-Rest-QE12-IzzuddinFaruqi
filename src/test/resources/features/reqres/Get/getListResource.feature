Feature: Get list resource
  @Tugas @PositiveCase
  Scenario Outline: Get list resource with valid parameter
    Given Get list resource with valid parameter <id>
    When Send request get list resource
    Then Status code should be 200
    And Response body list resource page should be <id> inside "<data>"
    And Validate get list resource JSON schema "GetListResourceSchema.json"
    Examples:
      | id |
      | 7  |
      | 8  |

#  @Tugas @NegativeCase
#  Scenario Outline: Get list resource with invalid parameter
#    Given Get list resource with invalid parameter "<page>"
#    When Send request get list resource
#    Then Status code should be bad request 400
#    And Response body list resource page should be "<page>"
#    And Validate get list resource JSON schema "GetListResourceSchema.json"
#    Examples:
#      | page    |
#      | Michael |
#      | Lawson  |