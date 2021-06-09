package com.reactivedemo.reactivedemo.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.reactivedemo.reactivedemo.handler.AppHandler;

@Configuration
public class AppRouter {
	
	@Bean
	public RouterFunction<ServerResponse> getName(AppHandler appHandler){
		return RouterFunctions.route(RequestPredicates.GET("/name").
				and(RequestPredicates.accept(MediaType.APPLICATION_STREAM_JSON)), appHandler::getName);
			
	}

}
