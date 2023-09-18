package starter.reqres.Get;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.utils.Constants;

public class GetSingleResourceAPI {
    public static String GET_SINGLE_RESOURCE = Constants.BASE_URL+"/api/unknown/{data}";
    @Step("Get single resource")
    public void getSingleResource(int data){
        SerenityRest.given().pathParam("data", data);
    }
}
