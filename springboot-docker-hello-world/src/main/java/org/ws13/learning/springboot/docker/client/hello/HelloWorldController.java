package org.ws13.learning.springboot.docker.client.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ctranxuan
 */
@RestController

public class HelloWorldController {
    /**
     * curl -v "http://localhost:8080/hello"
     *
     * @return
     */
    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!!!";
    }
}

