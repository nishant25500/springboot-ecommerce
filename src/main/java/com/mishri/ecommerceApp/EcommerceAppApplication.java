package com.mishri.ecommerceApp;


import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing     // Enables JPA Auditing features
public class EcommerceAppApplication {

	public static void main(String[] args) {
		// configuring .env file before application starts
		Dotenv dotenv = Dotenv.configure()
				.ignoreIfMissing()
				.load();

		dotenv.entries().forEach((DotenvEntry entry) -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(EcommerceAppApplication.class, args);

	}

}
