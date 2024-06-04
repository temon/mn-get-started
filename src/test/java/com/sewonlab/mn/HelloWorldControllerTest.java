package com.sewonlab.mn;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class HelloWorldControllerTest {

    @Inject
    @Client("/")
    HttpClient httpClient;

    @Test
    void testHelloWorld() {
        String response = httpClient.toBlocking().retrieve("/hello");
        Assertions.assertEquals("Hello World From Service!", response);
    }

    @Test
    void testHelloWorldReturnSuccess200() {
        var response = httpClient.toBlocking().exchange("/hello", String.class);
        Assertions.assertEquals(HttpStatus.OK, response.getStatus());
        Assertions.assertEquals("Hello World From Service!", response.body());
    }
}
