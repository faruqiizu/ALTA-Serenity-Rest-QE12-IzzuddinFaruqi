package starter.stepdef.Get;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.Get.GetListUserAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;
import static org.hamcrest.Matchers.equalTo;

public class getListUsersStepDef {
    @Steps
    GetListUserAPI getlistuserAPI;

    @Given("Get list users with valid parameter page {int}")
    public void getListUserWithValidParameterPage(int page) {
        getlistuserAPI.getListUsers(page);
    }
    @When("Send request get list users")
    public void sendRequestGetListUsers() {
        SerenityRest.when().get(getlistuserAPI.GET_LIST_USERS);
    }
    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int ok) {
        SerenityRest.then().statusCode(ok);
    }
    @And("Response body page should be {int}")
    public void responseBodyPageShouldBe(int page) {
        SerenityRest.then().body(ReqresResponses.PAGE,equalTo(page));
    }
    @And("Validate get list users JSON schema {string}")
    public void validateGetListUsersJSONSchema(String jsonFile) {
        File json = new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
