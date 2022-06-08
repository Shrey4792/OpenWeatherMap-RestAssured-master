package APITestingRestAssured.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class OpenWeather {

//    @When("^I have registered a new station to OpenWhetherMap \"([^\"]*)\" right APIKey$")
//    public void iHaveRegisteredANewStationToOpenWhetherMapAPIKey(String arg0) {
//
//        Response resp = when().
//                        get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=10f3f436f695a44a5bb5abd06c1dd1e6");
//        System.out.println(resp.getStatusCode());
//        System.out.println(resp.asString());
//
//
//        Assert.assertEquals(resp.getStatusCode(),200);
//
//    }
//
//    @When("^I have registered a new station to OpenWhetherMap \"([^\"]*)\" wrong APIKey$")
//    public void iHaveRegisteredANewStationToOpenWhetherMapWrongAPIKey(String arg0) throws Throwable {
//        Response resp = when().
//                get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=10f3f436f695a44a5bb5abd06c1dd1e");
//        System.out.println(resp.getStatusCode());
//        System.out.println(resp.asString());
//        Assert.assertEquals(resp.getStatusCode(),401);
//    }
//
//    @When("^How to use parameters with rest assured$")
//    public void howToUseParametersWithRestAssured() {
//        Response resp = given().
//                        param("q","London").
//                        param("appid", "10f3f436f695a44a5bb5abd06c1dd1e6").
//                        when().get("https://api.openweathermap.org/data/2.5/weather");
//        System.out.println(resp.getStatusCode());
//
//        if (resp.getStatusCode()==200){
//            System.out.println("API is working");
//        }
//        else{
//            System.out.println("API is n ot working");
//        }
//    }
//
//    @When("^I call API through data ID and value and assert$")
//    public void iCallAPIThroughDataIDAndValueAndAssert() {
//        Response resp = given().
//                param("id","2172797").
//                param("appid", "10f3f436f695a44a5bb5abd06c1dd1e6").
//                when().get("https://api.openweathermap.org/data/2.5/weather");
//        System.out.println(resp.getStatusCode());
//        Assert.assertEquals(resp.getStatusCode(), 200);
//    }
//
//    @When("^I want to check that data with extraction$")
//    public void iWantToCheckThatDataIsInJasonFormat() {
//        String weatherReport = given().
//                param("id", "2172797").
//                param("appid", "10f3f436f695a44a5bb5abd06c1dd1e6").
//                when().get("https://api.openweathermap.org/data/2.5/weather").then().contentType(ContentType.JSON).
//                extract().path("weather[0].description");
//        System.out.println("weatherReport:" + weatherReport);
//    }
//
//
//    @When("^I request POST by Body$")
//    public void iRequestPOSTByOjects() {
//        Response resp=given().body(" {\"id\":\"2\"," + "\title\":\"dummytitle\"," + "\"author\":\"shreyansh\"}").
//                when().contentType(ContentType.JSON).
//                post("http://localhost:3000/posts/");
//
//        System.out.println(resp.asString());
//
//    }
//
//    @When("^I request POST by Objects$")
//    public void iRequestPOSTByObjects() {
//
//        Posts posts = new Posts();
//        posts.setId("4");
//        posts.setAuthor("shreyansh");
//        posts.setTitle("An untold stroy of shreyansh narola");
//
//        Response resp = given().when().contentType(ContentType.JSON).body(posts).post("http://localhost:3000/posts/");
//        System.out.println(resp.asString());
//    }
//
//    @When("^I request by PUT API$")
//    public void iRequestByPUTAPI() {
//
//        Posts posts = new Posts();
//        posts.setId("3");
//        posts.setTitle("New Titlte");
//        posts.setAuthor("New Author");
//
//        Response resp = given().when().contentType(ContentType.JSON).body(posts).put("http://localhost:3000/posts/3");
//        System.out.println(resp.asString());
//    }

//    @When("^I request by PATCH API$")
//    public void iRequestByPATCHAPI() {
//        Response resp = given().body("{\"ttitle\": \"SHREYANSH\"}").when().contentType(ContentType.JSON).patch("http://localhost:3000/posts/3");
//        System.out.println(resp.asString());
//    }

//    @When("^I request by DELETE API$")
//    public void iRequestByDELETEAPI() {
//        Response resp = given().when().delete("http://localhost:3000/posts/3");
//        System.out.println(resp.asString());
//    }

    @When("^I send Complex POST request$")
    public void iSendComplexPostRequest() {
    Info info=new Info();
    info.setEmail("shreynarola@gmail.com");
    info.setPhone("6765347");
    info.setAddress("london");

    ComplexObjects complexObjects = new ComplexObjects();
    complexObjects.setId("14");
    complexObjects.setTitle("Auto-Biography");
    complexObjects.setAuthor("shreyansh");
    complexObjects.setInfo(info);

    Response resp= given().when().contentType(ContentType.JSON).body(complexObjects).post("http://localhost:3000/posts");

        System.out.println(resp.asString());

    }
}