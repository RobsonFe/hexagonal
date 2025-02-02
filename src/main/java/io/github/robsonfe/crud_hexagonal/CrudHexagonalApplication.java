package io.github.robsonfe.crud_hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CrudHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudHexagonalApplication.class, args);
	}

}
