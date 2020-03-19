package org.isi;

import org.isi.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculatorSonarAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorSonarAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ProductService productService) {
		return args -> {
			productService.init();
			System.out.println("Une nouvelle version");
		};
	}

}
