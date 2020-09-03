package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.model.AppCredentials;

@SpringBootApplication
@EnableConfigurationProperties(AppCredentials.class)
public class HashicorpVaultConfigDemoApplication implements CommandLineRunner {

	private AppCredentials appCredentials;

	private Logger logger = LoggerFactory.getLogger(HashicorpVaultConfigDemoApplication.class);

	public HashicorpVaultConfigDemoApplication(AppCredentials appCredentials) {
		this.appCredentials = appCredentials;
	}

	public static void main(String[] args) {
		SpringApplication.run(HashicorpVaultConfigDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Username : " + appCredentials.getUsername());
		logger.info("Password : " + appCredentials.getPassword());
	}

}
