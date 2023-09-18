package starter.stepdef;

public class ReqresStepDef {

//    @Steps
//    ReqresAPI reqresAPI;

    //scenario 1: get list users
//    @Given("Get list user with valid parameter page {int}")
//    public void getListUserWithValidParameterPage(int page) {
//        reqresAPI.getListUsers(page);
//    }
//    @When("Send request get list users")
//    public void sendRequestGetListUsers() {
//        SerenityRest.when().get(ReqresAPI.GET_LIST_USERS);
//    }
//    @Then("Status code should be {int} OK")
//    public void statusCodeShouldBeOK(int ok) {
//        SerenityRest.then().statusCode(ok);
//    }
//    @And("Response body page should be {int}")
//    public void responseBodyPageShouldBe(int page) {
//        SerenityRest.then().body(ReqresResponses.PAGE,equalTo(page));
//    }
//    @And("Validate get list users JSON schema {string}")
//    public void validateGetListUsersJSONSchema(String jsonFile) {
//        File json = new File(Constants.JSON_SCHEMA+jsonFile);
//        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
//    }


    //scenario 2: post create new user
//    @Given("Create new user with valid json {string}")
//    public void createNewUserWithValidJson(String jsonFile) {
//        File json = new File(Constants.REQ_BODY+jsonFile);
//        reqresAPI.postCreateNewUser(json);
//    }
//    @When("Send request post create new user")
//    public void sendRequestPostCreateNewUser() {
//        SerenityRest.when().post(ReqresAPI.POST_CREATE_USER);
//    }
//    @Then("Status code should be {int} created")
//    public void statusCodeShouldBeCreated(int created) {
//        SerenityRest.then().statusCode(created);
//    }
//    @And("Response body name was {string} and job was {string}")
//    public void responseBodyNameWasAndJobWas(String name, String job) {
//        SerenityRest.and()
//                .body(ReqresResponses.NAME,equalTo(name))
//                .body(ReqresResponses.JOB,equalTo(job));
//    }
//    @And("Validate create a new user JSON schema {string}")
//    public void validateCreateANewUserJSONSchema(String jsonFile) {
//        File json = new File(Constants.JSON_SCHEMA+jsonFile);
//        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
//    }

//  scenario 3: put update user
//    @Given("Update user with valid json {string} and user id {int}")
//    public void updateUserWithValidJsonAndUserIdId(String jsonFile, int id){
//        File json = new File(Constants.REQ_BODY+jsonFile);
//        reqresAPI.putUpdateUser(json, id);
//    }
//    @When("Send request put update user")
//    public void sendRequestPutUpdateUser() {
//        SerenityRest.when().put(ReqresAPI.PUT_UPDATE_USER);
//    }
//    @And("Validate put update JSON schema {string}")
//    public void validatePutUpdateJSONSchema(String jsonFile) {
//        File json = new File(Constants.JSON_SCHEMA+jsonFile);
//        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
//    }

//  Scenario 4 : Delete a user
//    @Given("Delete a user with valid user id {int}")
//    public void deleteAUserWithValidUserIdId(int id) {
//        reqresAPI.deleteUser(id);
//    }
//
//    @When("Send request delete user")
//    public void sendRequestDeleteUser() {
//        SerenityRest.when().delete(ReqresAPI.DELETE_USER);
//    }
//
//    @Then("Status code should be {int} No Content")
//    public void statusCodeShouldBeNoContent(int noContent) {
//        SerenityRest.then().statusCode(noContent);
//    }


}
