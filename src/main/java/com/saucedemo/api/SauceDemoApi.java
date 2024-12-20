package com.saucedemo.api;

import io.restassured.http.ContentType;
import testframework.PropertiesManager;
import testframework.core.BaseApiService;

import static io.restassured.RestAssured.given;

public class SauceDemoApi extends BaseApiService {
    public SauceDemoApi(String path) {
        super(path, PropertiesManager.getConfigProperties().getProperty("sauceDemoBaseUrl"));
    }

    public void authenticate(String username) {
        setRequestSpecification(
                given()
                        .contentType(ContentType.JSON)
                        .baseUri(getServiceUrl())
        );
    }
}
