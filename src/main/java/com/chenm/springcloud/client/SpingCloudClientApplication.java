package com.chenm.springcloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(value={"com.chenm.springcloud.client"})
@EnableDiscoveryClient
public class SpingCloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingCloudClientApplication.class, args);
	}
}
