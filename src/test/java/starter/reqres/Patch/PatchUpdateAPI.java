package starter.reqres.Patch;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.utils.Constants;

import java.io.File;

public class PatchUpdateAPI {
    public static String PATCH_UPDATE = Constants.BASE_URL+"/api/users/{id}";

    @Step("Patch update")
    public void patchUpdate(File json, int id){
        SerenityRest.given().pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }
}
