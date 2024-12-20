package com.example.serviceb;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Controller("/serviceb")
public class ServiceBController {

    @Get
    public Mono<String> respond() {
        return Mono.just("blablablablablabalblablablablal")
                   .delayElement(Duration.ofSeconds(1));
    }
}