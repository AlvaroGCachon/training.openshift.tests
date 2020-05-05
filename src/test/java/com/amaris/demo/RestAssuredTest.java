package test.java.com.amaris.demo;

import  io.restassured.RestAssured;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredTest {

	@Test
	public void exampleOfTestNgMaven() {
        RestAssured.get("http://test-app-school.2886795276-80-jago05.environments.katacoda.com").then().assertThat().statusCode(200);
	}
}