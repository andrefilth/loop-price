package br.com.loop.pi.price.adapter;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.loop.pi.price.adapter.server.ConfigurationServer;

@Configuration
@ComponentScan(basePackages = { "br.com.loop.pi.price", "br.com.loop.pi.price.adapter" })
@EnableFeignClients
@SpringBootApplication
public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	private ConfigurationServer configurationServer;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	private void init(){
		logger.info("#########################################################################");
		logger.info("       Spring Boot - active profile: " + configurationServer.getName());
		logger.info("#########################################################################");

	}
}
