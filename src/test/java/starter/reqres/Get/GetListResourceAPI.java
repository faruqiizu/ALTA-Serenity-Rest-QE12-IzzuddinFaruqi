package starter.reqres.Get;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

public class GetListResourceAPI {
    public static String GET_LIST_RESOURCE = Constants.BASE_URL+"/api/unknown/{data}";
    @Step("Get list resource")
    public void getListResource(int data){
        SerenityRest.given().pathParam("data", data);
    }
}
