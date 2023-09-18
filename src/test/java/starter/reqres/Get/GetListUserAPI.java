package starter.reqres.Get;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

public class GetListUserAPI {
    public static String GET_LIST_USERS = Constants.BASE_URL+"/api/users?page={page}";

    @Step("Get list users")
    public void getListUsers(int page){
        SerenityRest.given()
                .pathParam("page",page);
    }
}
