package com.api.tests;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class PetsAPI {
	
	private long petId;
	
	@Test
	public void testAddPets() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		String jsonbody = "{"
				+ "  \"id\": 0,"
				+ "  \"category\": {"
				+ "    \"id\": 0,"
				+ "    \"name\": \"string\""
				+ "  },"
				+ "  \"name\": \"doggie\","
				+ "  \"photoUrls\": ["
				+ "    \"string\""
				+ "  ],"
				+ "  \"tags\": ["
				+ "    {"
				+ "      \"id\": 0,"
				+ "      \"name\": \"string\""
				+ "    }"
				+ "  ],"
				+ "  \"status\": \"available\""
				+ "}";
		
		Response response = given().header("accept", "application/json").header("Content-Type" , "application/json" )
				.body(jsonbody).when().post("/pet");
		
		System.out.println(response.prettyPrint());
		response.then().statusCode(200).and().contentType("application/json");
		response.then().body("status",  Matchers.equalTo("available")).body("category.name", Matchers.equalTo("string"))
				.body("tags[0].name" , Matchers.equalTo("string"));
		
		petId = response.path("id");
		System.out.println(petId);
		
	}
	
	@Test(dependsOnMethods =  {"testAddPets"} )
	public void testUpdatePets() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		
		String jsonbody = "{"
				+ "  \"id\": "+petId+","
				+ "  \"category\": {"
				+ "    \"id\": 0,"
				+ "    \"name\": \"string\""
				+ "  },"
				+ "  \"name\": \"doggie\","
				+ "  \"photoUrls\": ["
				+ "    \"string\""
				+ "  ],"
				+ "  \"tags\": ["
				+ "    {"
				+ "      \"id\": 0,"
				+ "      \"name\": \"string\""
				+ "    }"
				+ "  ],"
				+ "  \"status\": \"available\""
				+ "}";
		
		Response response = given().header("accept", "application/json").header("Content-Type" , "application/json" )
				.body(jsonbody).when().put("/pet");
		
		System.out.println(response.prettyPrint());
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.contentType(), "application/json");
		
		response.then().statusCode(200).and().contentType("application/json");		
	}

	@Test
	public void getPets() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		Response response = given().header("accept", "application/json").when().get("/pet/findByStatus?status=pending");
	
		System.out.println(response.prettyPrint());
		response.then().statusCode(200).and().contentType("application/json");		
	}
	
	@Test(dependsOnMethods =  {"testUpdatePets"})
	public void getPetsById() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		Response response = given().header("accept", "application/json").when().get("/pet/"+petId);
	
		//System.out.println(response.prettyPrint());
		response.then().statusCode(200).and().contentType("application/json");		
	}
	
	@Test(dependsOnMethods = {"getPetsById"})
	public void deletePets() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		Response response = given().header("accept", "application/json").when().delete("/pet/"+petId);
	
		//System.out.println(response.prettyPrint());
		response.then().statusCode(200).and().contentType("application/json");		
	}
	
}
