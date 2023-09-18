package starter.stepdef.Put;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.Put.PutUpdateUserAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class putUpdateUserStepDef {
    @Steps
    PutUpdateUserAPI putupdateuserAPI;
    @Given("Update user with valid json {string} and user id {int}")
    public void updateUserWithValidJsonAndUserIdId(String jsonFile, int id){
        File json = new File(Constants.REQ_BODY+jsonFile);
        putupdateuserAPI.putUpdateUser(json, id);
    }
    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
        SerenityRest.when().put(PutUpdateUserAPI.PUT_UPDATE_USER);
    }
    @And("Validate put update JSON schema {string}")
    public void validatePutUpdateJSONSchema(String jsonFile) {
        File json = new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    //negative case
    @Given("Update user with invalid json {string} and user id {}")
    public void updateUserWithInvalidJsonAndUserId(String jsonFile, int id) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        putupdateuserAPI.putUpdateUser(json, id);
    }

}
