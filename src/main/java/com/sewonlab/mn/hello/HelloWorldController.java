package com.sewonlab.mn.hello;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Singleton;

@Singleton
@Controller("/hello")
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(final HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Get(value = "/", produces = "text/plain")
    public String HelloWorld() {
        return helloWorldService.sayHello();
    }
}
