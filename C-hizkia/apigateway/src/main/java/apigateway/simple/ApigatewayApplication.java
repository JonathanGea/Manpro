package apigateway.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}
        
        @Bean
        public RouteLocator myroutes(RouteLocatorBuilder builder){
            return builder.routes()
                    .route(p -> p
                    .path("/csvdataentry/convertxml")
                    .uri("http://localhost:1003")
                    )
                    .route(p -> p
                    .path("/xmldataentry/processxml")
                    .uri("http://localhost:1004")
                    )
                    .route(p -> p
                    .path("/logservice/postlog")
                    .uri("http://localhost:1010")
                    )
                    .route(p -> p
                    .path("/products/finds")
                    .uri("http://localhost:2006")
                    )
                    .build();
        }

}
