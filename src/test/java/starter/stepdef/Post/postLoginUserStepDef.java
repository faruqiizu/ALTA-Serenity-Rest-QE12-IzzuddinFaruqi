package starter.stepdef.Post;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.Post.PostLoginUserAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class postLoginUserStepDef {
    @Steps
    PostLoginUserAPI postloginuserAPI;
    @Given("Login user with valid json {string}")
    public void loginUserWithValidJson(String jsonFile) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        postloginuserAPI.postLoginUser(json);
    }
    @When("Send request post login user")
    public void sendRequestPostLoginUser() {
        SerenityRest.when().post(PostLoginUserAPI.POST_LOGIN_USER);
    }
    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int ok) {
        SerenityRest.then().statusCode(ok);
    }
    @And("Response body token was {string}")
    public void responseBodyTokenWas(String token) {
        SerenityRest.and().body(ReqresResponses.TOKEN_LOGIN,equalTo(token));
    }
    @And("Validate post login JSON schema {string}")
    public void validatePostLoginJSONSchema(String jsonFile) {
        File json = new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    //login email only
    @Given("Login user with email only {string}")
    public void loginUserWithEmailOnly(String jsonFile) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        postloginuserAPI.postLoginUser(json);
    }
    @Then("Status code should be bad request {int}")
    public void statusCodeShouldBeBadRequest(int badRequest) {
        SerenityRest.then().statusCode(badRequest);
    }
    @And("Responses body error was {string}")
    public void responseBodyLoginErrorWas(String errorMessage){
        SerenityRest.and().body(ReqresResponses.ERROR_MESSAGE, equalTo(errorMessage));
    }

    //login password only
    @Given("Login user with password only {string}")
    public void loginUserWithPasswordOnly(String jsonFile) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        postloginuserAPI.postLoginUser(json);
    }

    //login blank username and password
    @Given("Login user with username and password {string}")
    public void loginUserWithUsernameAndPassword(String jsonFile) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        postloginuserAPI.postLoginUser(json);
    }

}
