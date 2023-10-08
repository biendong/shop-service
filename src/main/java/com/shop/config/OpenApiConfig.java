/**
 * Copyright @ of 101 Digital 2023
 */
package com.shop.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;

/**
 * @author haitrand
 *
 */
//@Configuration
public class OpenApiConfig {
//	@Bean
	public OpenAPI usersMicroserviceOpenAPI() {
//		return new OpenAPI().openapi(null)
//				.info(new Info().title("Your API Title").description("Your API Description").version("1.0"));
		OpenAPI openAPI = new OpenAPI();
		ExternalDocumentation extDoc = new ExternalDocumentation();
		extDoc.url("Primary.Governmentids.yml");
		openAPI.externalDocs(extDoc);

		return openAPI;
	}
}
