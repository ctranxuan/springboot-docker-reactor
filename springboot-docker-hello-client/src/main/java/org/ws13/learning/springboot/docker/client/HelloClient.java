package org.ws13.learning.springboot.docker.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author ctranxuan
 */
// helloworld is the hostname declared with --link in the docker command
@FeignClient(name = "hello-service", url = "http://helloworld:8080", fallback = HelloClientFallback.class)
public interface HelloClient {

    @RequestMapping(method = GET, value = "/hello")
    String sayHello();

}
