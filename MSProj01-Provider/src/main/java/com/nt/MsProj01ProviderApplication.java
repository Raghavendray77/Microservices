package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MsProj01ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProj01ProviderApplication.class, args);
	}

}