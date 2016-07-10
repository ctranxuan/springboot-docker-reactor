package org.ws13.learning.springboot.docker.client;

import org.springframework.stereotype.Service;

/**
 * @author ctranxuan
 */
@Service
public class HelloClientFallback implements HelloClient {
    @Override
    public String sayHello() {
        return "Bonjour le monde !!!";
    }
}
