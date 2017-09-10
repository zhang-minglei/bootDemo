package com.zml.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ZmlCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZmlCloudConfigApplication.class, args);
	}
}
