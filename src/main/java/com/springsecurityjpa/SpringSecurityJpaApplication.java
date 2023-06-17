package com.springsecurityjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.springsecurityjpa.repo.UserRepoInterface;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = UserRepoInterface.class)
public class SpringSecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJpaApplication.class, args);
	}

}
