package com.sewonlab.mn.hello;


import io.micronaut.http.annotation.Controller;
import jakarta.inject.Singleton;

@Singleton
public class HelloWorldService {
    public String sayHello() {
        return "Hello World From Service!";
    }
}
