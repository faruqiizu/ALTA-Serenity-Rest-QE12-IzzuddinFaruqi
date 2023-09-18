package starter.stepdef.Delete;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.Delete.DeleteUserAPI;

public class deleteUserStepDef {
    @Steps
    DeleteUserAPI deleteuserAPI;
    @Given("Delete a user with valid user id {int}")
    public void deleteAUserWithValidUserIdId(int id) {
        deleteuserAPI.deleteUser(id);
    }
    @When("Send request delete user")
    public void sendRequestDeleteUser() {
        SerenityRest.when().delete(DeleteUserAPI.DELETE_USER);
    }
    @Then("Status code should be {int}")
    public void statusCodeShouldBeNoContent(int noContent) {
        SerenityRest.then().statusCode(noContent);
    }

    //negative case
    @Given("Delete a user with invalid user id {}")
    public void deleteAUserWithInvalidUserId(int id) {
        deleteuserAPI.deleteUser(id);
    }
}
