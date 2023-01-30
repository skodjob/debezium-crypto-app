package io.excellent.project.crypto;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CryptoResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/crypto")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy Reactive"));
    }

}