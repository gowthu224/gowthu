package com.reactivedemo.reactivedemo.handler;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AppHandler {

	public Mono<ServerResponse> getName(ServerRequest request) {

		return ServerResponse.ok().
				contentType(MediaType.APPLICATION_STREAM_JSON).
				body(Flux.interval(Duration.ofSeconds(3)),Long.class);
	}
}
