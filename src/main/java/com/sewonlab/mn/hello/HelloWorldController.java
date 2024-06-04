package com.sewonlab.mn.hello;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Controller("/hello")
public class HelloWorldController {

    @Inject
    private HelloWorldService helloWorldService;

    @Get(value = "/", produces = "text/plain")
    public String HelloWorld() {
        return helloWorldService.sayHello();
    }
}
