package com.example.MyDoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger.readers.parameter.SwaggerExpandedParameterBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class MyDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDocApplication.class, args);
	}


}
