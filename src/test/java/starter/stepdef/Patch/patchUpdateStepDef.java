package starter.stepdef.Patch;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.Patch.PatchUpdateAPI;
import starter.utils.Constants;

import java.io.File;

public class patchUpdateStepDef {
    @Steps
    PatchUpdateAPI patchupdateAPI;
    @Given("Update with valid json {string} and user id {int}")
    public void updateWithValidJsonAndUserId(String jsonFile, int id) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        patchupdateAPI.patchUpdate(json, id);
    }
    @When("Send request patch update")
    public void sendRequestPatchUpdate() {
        SerenityRest.when().patch(PatchUpdateAPI.PATCH_UPDATE);
    }
    @And("Validate patch update JSON schema {string}")
    public void validatePatchUpdateJSONSchema(String jsonFile) {
        File json = new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    //Negative Case
//    @Given("Patch update user with blank name and job in id {int}")
//    public void patchUpdateUserWithEmptyNameAndJobInId(int id) {
//        patchupdateAPI.patchUpdate(id);
//    }
}
