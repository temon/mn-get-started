package com.sewonlab.mn.hello;

import io.micronaut.context.annotation.Primary;
import jakarta.inject.Singleton;


@Singleton
public class HelloMicronautService implements MyService {

    @Override
    public String sayHello() {
        return "Hello Micronaut!";
    }
}
