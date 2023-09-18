package starter.stepdef.Get;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.Get.GetListResourceAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class getListResourceStepDef {
    @Steps
    GetListResourceAPI getlistresourceAPI;
    @Given("Get list resource with valid parameter {int}")
    public void getListUserWithValidParameter(int id) {
        getlistresourceAPI.getListResource(id);
    }
    @When("Send request get list resource")
    public void sendRequestGetListResource() {
        SerenityRest.when().get(getlistresourceAPI.GET_LIST_RESOURCE);
    }
    @And("Response body list resource page should be {} inside {string}")
    public void responseBodyListResourcePageShouldBeInside(String id, String data) {
        SerenityRest.then()
                .body(ReqresResponses.ID_RESPONSE,equalTo(id))
                .body(ReqresResponses.DATA_ID,equalTo(data));
    }
    @And("Validate get list resource JSON schema {string}")
    public void validateGetListResourceJSONSchema(String jsonFile) {
        File json = new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    //negative case
    @Given("Get list resource with invalid parameter {int}")
    public void getListResourceWithInvalidParameter(int page) {
        getlistresourceAPI.getListResource(page);
    }


}
