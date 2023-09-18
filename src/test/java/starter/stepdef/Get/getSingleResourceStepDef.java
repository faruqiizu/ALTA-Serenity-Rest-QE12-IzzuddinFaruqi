package starter.stepdef.Get;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.Get.GetSingleResourceAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class getSingleResourceStepDef {
    @Steps
    GetSingleResourceAPI getsingleresourceAPI;
    @Given("Get single resource with valid parameter {int}")
    public void getListUserWithValidParameterPage(int id) {
        getsingleresourceAPI.getSingleResource(id);
    }
    @When("Send request get single resource")
    public void sendRequestGetSingleResource() {
        SerenityRest.when().get(getsingleresourceAPI.GET_SINGLE_RESOURCE);
    }
    @And("Response body single resource page should be {int}")
    public void responseBodySingleResourcePageShouldBe(int id) {
        SerenityRest.then().body(ReqresResponses.ID_RESPONSE,equalTo(id));
    }
    @And("Validate get single resource JSON schema {string}")
    public void validateGetSingleResourceJSONSchema(String jsonFile) {
        File json = new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

}
