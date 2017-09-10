package com.zml.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZmlEurekaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ZmlEurekaApplication.class).web(true).run(args);
	}
}
