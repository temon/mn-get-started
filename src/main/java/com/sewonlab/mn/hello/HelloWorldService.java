package com.sewonlab.mn.hello;


import io.micronaut.context.annotation.Primary;
import io.micronaut.http.annotation.Controller;
import jakarta.inject.Singleton;

@Primary
@Singleton
public class HelloWorldService implements MyService {
    @Override
    public String sayHello() {
        return "Hello World From Service!";
    }
}
