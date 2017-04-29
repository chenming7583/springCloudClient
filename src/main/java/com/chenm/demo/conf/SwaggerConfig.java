package com.chenm.demo.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
			  
	@Value("${swagger.ui.enable}")
	private boolean environmentSpecificBooleanFlag;
	
	@Bean
	public Docket docketFactory(){
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(
				new ApiInfo("接口文档", "SpringCloud web接口列表", "1.0", "", "", "", "")).enable(environmentSpecificBooleanFlag);
	}
}
