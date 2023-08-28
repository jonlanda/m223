package ch.zli.m223;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculatorResourceTest {

    @Test
    public void testCalculatorEndpoint() {
        given()
                .when().get("/calculator/add/1/1")
                .then()
                .statusCode(200)
                .body(is("2"));
    }

}