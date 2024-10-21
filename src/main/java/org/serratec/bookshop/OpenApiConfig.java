package org.serratec.bookshop;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(
		title = "API para compra e consulta de livros",
		version = "1.0",
		description = "Documentação da API Bookshop"))
public class OpenApiConfig {
}
