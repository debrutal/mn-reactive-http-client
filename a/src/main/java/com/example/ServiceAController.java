package com.example.servicea;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import reactor.core.publisher.Mono;

@Controller("/servicea")
public class ServiceAController {

    private final ServiceBClient serviceBClient;

    public ServiceAController(ServiceBClient serviceBClient) {
        this.serviceBClient = serviceBClient;
    }

    @Get
    public Mono<String> callServiceB() {
        return serviceBClient.fetchFromServiceB();
    }
}
