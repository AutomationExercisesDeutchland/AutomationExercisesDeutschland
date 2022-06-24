package api.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ListProductApi extends TestBaseApi{

    Response response;

    @Given("kullanici {string} endpointine request gonderir")
    public void kullanici_endpointine_request_gonderir(String pathParamPruductList) {
       setUp();
       spec.pathParam("parametre", pathParamPruductList);
       response = given().spec(spec).get("/{parametre}");
       response.prettyPrint();

    }

    @Then("kullanici status kodunun {int} oldugunu dogrular")
    public void kullanici_status_kodunun_oldugunu_dogrular(Integer int1) {

    }

    @Then("kullanici urun sayisinin {int} oldugunu dogrular")
    public void kullanici_urun_sayisinin_oldugunu_dogrular(Integer int1) {

    }

    @Then("kullanici fiyati {int}'den kucuk olan urunleri log.txt dosyasina yazdirir")
    public void kullanici_fiyati_den_kucuk_olan_urunleri_log_txt_dosyasina_yazdirir(Integer int1) {

    }


}
