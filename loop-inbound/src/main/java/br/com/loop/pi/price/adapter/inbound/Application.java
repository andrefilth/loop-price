package br.com.loop.pi.price.adapter.inbound;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "br.com.reclameaqui.pi.mt", "br.com.reclameaqui.pi.mt.adapter" })
public class Application{
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
