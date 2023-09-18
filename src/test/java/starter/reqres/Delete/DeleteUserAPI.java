package starter.reqres.Delete;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

public class DeleteUserAPI {
    public static String DELETE_USER = Constants.BASE_URL+"/api/users/{id}";

    @Step("Delete a user")
    public void deleteUser(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
}
