package com.virgingames.assertion;

import com.virgingames.constants.EndPoints;
import com.virgingames.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.parsing.Parser.JSON;
import static org.hamcrest.CoreMatchers.equalTo;


public class VirginGamesAssertion extends TestBase {

    static ValidatableResponse response;

    @Test()
    public void verifyStreamIdAndStreamName() {
        RestAssured.registerParser("text/plain", JSON);
        response = given().log().all()
                .when()
                .get(EndPoints.GET_BINGO_LOBBY_FEED)
                .then().log().all().statusCode(200);


        response.body("bingoLobbyInfoResource.streams[0].streamName", equalTo("Adventure"))
        .body("bingoLobbyInfoResource.streams[0].streamId", equalTo(194));


    }

}
