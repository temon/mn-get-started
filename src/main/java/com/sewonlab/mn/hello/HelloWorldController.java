package com.sewonlab.mn.hello;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Singleton;

@Singleton
@Controller("/hello")
public class HelloWorldController {

    private final MyService service;

    public HelloWorldController(final MyService service) {
        this.service = service;
    }

    @Get(value = "/", produces = "text/plain")
    public String HelloWorld() {
        return service.sayHello();
    }
}