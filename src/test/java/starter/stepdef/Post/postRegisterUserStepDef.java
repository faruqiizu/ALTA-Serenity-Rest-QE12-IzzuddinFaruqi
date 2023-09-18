package starter.stepdef.Post;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.Post.PostRegisterUserAPI;
import starter.reqres.ReqresResponses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class postRegisterUserStepDef {
    @Steps
    PostRegisterUserAPI postregisteruserAPI;
    @Given("Register user with valid json {string}")
    public void registerUserWithValidJson(String jsonFile) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        postregisteruserAPI.postRegisterUser(json);
    }
    @When("Send request post register user")
    public void sendRequestPostRegisterUser() {
        SerenityRest.when().post(PostRegisterUserAPI.POST_REGISTER_USER);
    }
    @And("Response body id was {int} and token was {string}")
    public void responseBodyIdWasAndTokenWas(int id, String token) {
        SerenityRest.and()
                .body(ReqresResponses.ID_ONLY,equalTo(id))
                .body(ReqresResponses.TOKEN_LOGIN, equalTo(token));
    }
    @And("Validate post register JSON schema {string}")
    public void validatePostRegisterJSONSchema(String arg0) {
    }

    //negative case
    @Given("Register user with email only {string}")
    public void registerUserWithEmailOnly(String jsonFile) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        postregisteruserAPI.postRegisterUser(json);
    }

    //negative case
    @Given("Register user with password only {string}")
    public void registerUserWithPasswordOnly(String jsonFile) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        postregisteruserAPI.postRegisterUser(json);
    }
//    @When("Send request post register user")
//    public void sendRequestPostRegisterUserPass() {
//        SerenityRest.when().post(PostRegisterUserAPI.POST_REGISTER_USER);
//    }
}
