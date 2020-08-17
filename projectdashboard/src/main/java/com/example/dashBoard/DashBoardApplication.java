package com.example.dashBoard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repositories.ProjectRepository;

@SpringBootApplication(scanBasePackages = {
		"web.api.controllers",
		"services"
})
@EnableJpaRepositories(basePackageClasses = {
		ProjectRepository.class
})
@EntityScan("domain")
public class DashBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashBoardApplication.class, args);
	}
}
