package com.sewonlab.mn.hello;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloWorldController {

    @Get(value = "/", produces = "text/plain")
    public String HelloWorld() {
        return "Hello World!";
    }
}
