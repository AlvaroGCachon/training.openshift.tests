package test.java.com.amaris.demo;

import  io.restassured.RestAssured;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredTest {

	@Test
	public void exampleOfTestNgMaven() {
        RestAssured.get("nginx-app").then().statusCode(200).assertThat()
            .body("url", equalTo("nginx-app"));
	}
}