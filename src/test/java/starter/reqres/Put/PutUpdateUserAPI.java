package starter.reqres.Put;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class PutUpdateUserAPI {
    public static String PUT_UPDATE_USER = Constants.BASE_URL+"/api/users/{id}";

    @Step("Put update user")
    public void putUpdateUser(File json, int id){
        SerenityRest.given().pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }
}
