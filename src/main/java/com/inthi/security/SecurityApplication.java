package com.inthi.security;

import com.inthi.security.controller.RegisterRequest;
import com.inthi.security.model.Role;
import com.inthi.security.service.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.inthi.security.model.Role.ADMIN;
import static com.inthi.security.model.Role.MANAGER;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service
	){
		return args -> {
			var admin= RegisterRequest.builder()
					.firstname("admin")
					.lastname("admin")
					.email("admin@gmail.com")
					.password("admin123")
					.role(ADMIN)
					.build();
			System.out.println("Admin token:"+ service.register(admin).getToken());

			var manager= RegisterRequest.builder()
					.firstname("manager")
					.lastname("manager")
					.email("manager@gmail.com")
					.password("manager123")
					.role(MANAGER)
					.build();
			System.out.println("Manager token:"+ service.register(manager).getToken());
		};
	}

}
