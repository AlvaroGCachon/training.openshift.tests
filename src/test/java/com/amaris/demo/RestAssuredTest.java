package test.java.com.amaris.demo;

import  io.restassured.RestAssured;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredTest {

	@Test
	public void exampleOfTestNgMaven() {
        String target = System.getProperty("target");
        if (target == null) {
            target="http://www.google.com";
        }
        RestAssured.get(target).then().assertThat().statusCode(200);
	}
}