package api.stepdef;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class TestBaseApi {

    protected RequestSpecification spec;

    public void setUp(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://automationexercise.com/api").build();
    }

}
