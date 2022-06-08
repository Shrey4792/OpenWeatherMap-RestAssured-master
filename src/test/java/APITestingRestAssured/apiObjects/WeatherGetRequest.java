package APITestingRestAssured.apiObjects;

import junit.framework.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class WeatherGetRequest {



    public void Test_01(){

        get("https://api.openweathermap.org/data/2.5/weather?q=London&appid=10f3f436f695a44a5bb5abd06c1dd1e6");


    }

}
