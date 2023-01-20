package com.virgingames.testbase;
import io.restassured.RestAssured;
import org.junit.BeforeClass;


public class TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://www.virgingames.com";
       RestAssured.basePath = "/bingo";
    }
}
