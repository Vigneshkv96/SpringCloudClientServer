package com.springcloudconfig.SpringCloudConfigClient;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.springcloudconfig.SpringCloudConfigClient.Controller")
@SpringBootApplication
public class SpringCloudConfigClientApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringCloudConfigClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}

}
