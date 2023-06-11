package com.thevarungupta.cloud.config.sever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigSeverApplication.class, args);
	}

}
