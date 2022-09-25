package com.example.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudRoutingConfig {

/*	@Bean
	public RouteLocator configureRoutes(RouteLocatorBuilder builder) 
	{
		return builder.routes()
				//.route("__id",r->r.path("/path/**").uri("lb://SERVICE-NAME"))
				.route("employeeServiceId", r->r.path("/employee/**").uri("lb://EMPLOYEE-SERVICE"))
				//.route("productServiceId", r->r.path("/product/**").uri("lb://PRODUCT-SERVICE"))
				.build();
	}*/
		@Bean
		public RouteLocator configureRoutes(RouteLocatorBuilder builder) {
			System.out.println("Router conf called");
			return builder.routes()
					//.route("__id",r->r.path("/path/**").uri("lb://SERVICE-NAME"))
					.route("employeeServiceId", r->r.path("/employee/**").uri("lb://EMPLOYEE-SERVICE"))
					//.route("productServiceId", r->r.path("/product/**").uri("lb://PRODUCT-SERVICE"))
					.build();
		}
}
