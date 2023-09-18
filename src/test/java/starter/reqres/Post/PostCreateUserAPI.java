package starter.reqres.Post;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class PostCreateUserAPI {
    public static String POST_CREATE_USER = Constants.BASE_URL+"/api/users";

    @Step("Post create new users")
    public void postCreateNewUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
}
