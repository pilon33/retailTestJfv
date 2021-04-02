package jfv.retail.intercorp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"jfv.retail.intercorp.controller","jfv.retail.intercorp.service","jfv.retail.intercorp.config"})
public class IntercorpClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntercorpClientesApplication.class, args);
	}

}
