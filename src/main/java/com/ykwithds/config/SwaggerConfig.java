package com.ykwithds.config;

import java.util.List;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import lombok.RequiredArgsConstructor;


//@OpenAPIDefinition(info = @Info(title = "YK Edu Swagger", description = "샘플 REST API", version = "1.0.0"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {
	  @Bean
	  public OpenAPI myOpenAPI() {
	    Server devServer = new Server();
	    devServer.setUrl("http://localhost:8080");
	    devServer.setDescription("Server URL in Development environment");

	    Server prodServer = new Server();
	    prodServer.setUrl("https://bezkoder-api.com");
	    prodServer.setDescription("Server URL in Production environment");


	    Contact contact = new Contact();
	    contact.setEmail("bezkoder@gmail.com");
	    contact.setName("BezKoder");
	    contact.setUrl("https://www.bezkoder.com");
//

	    Info info = new Info()
	        .title("Tutorial Management API")
	        .version("1.0")
	        .contact(contact)
	        .description("This API exposes endpoints to manage tutorials.").termsOfService("https://www.bezkoder.com/terms")
	        ;
//	        .license(mitLicense);

	    return new OpenAPI().info(info).servers(List.of(devServer, prodServer));
	  }

    
}
