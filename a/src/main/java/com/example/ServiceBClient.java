package com.example.servicea;

import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.annotation.Get;
import reactor.core.publisher.Mono;

@Client("http://localhost:8082/serviceb")
public interface ServiceBClient {

    @Get
    Mono<String> fetchFromServiceB();
}
