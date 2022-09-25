package in.nareshit.raghu.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCoudRoutingConfig {

	//RouteLocator = list(routes) --> 1 route = 1 MS#
	@Bean
	public RouteLocator configureRoute(RouteLocatorBuilder builder) {
		return builder.routes()
				//1 route --- 1 MS#
				.route("employeeId", r->r.path("/employee/**").uri("lb://EMPLOYEE-SERVICE"))
				//.route("productId", r->r.path("/product/**").uri("lb://PRODUCT-SERVICE"))
				//.route("orderId", r->r.path("/order/**").uri("lb://ORDER-SERVICE"))
				.build();
	}
}
