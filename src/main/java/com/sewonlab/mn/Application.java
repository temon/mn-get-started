package com.sewonlab.mn;

import com.sewonlab.mn.hello.HelloMicronautService;
import com.sewonlab.mn.hello.HelloWorldController;
import com.sewonlab.mn.hello.HelloWorldService;
import io.micronaut.runtime.Micronaut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        var context = Micronaut.run(Application.class, args);

        LOG.info("Message from service: {}", context.getBean(HelloWorldService.class).sayHello());
        LOG.info("Message from service: {}", context.getBean(HelloMicronautService.class).sayHello());
    }
}