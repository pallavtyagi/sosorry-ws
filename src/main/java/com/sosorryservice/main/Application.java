package com.sosorryservice.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.sosorryservice.main",
		"com.sosorryservice.model",
		"com.sosorryservice.controller",
		"com.sosorryservice.service",
		"com.sosorryservice.configuration"})
@EnableSwagger2
@EnableMongoRepositories(basePackages="com.sosorryservice.service")
public class Application implements CommandLineRunner{
	
	@Override
	public void run(String... arg0) throws Exception {
		if (arg0.length > 0 && arg0[0].equals("exitcode")) {
			throw new ExitException();
		}
	}
	
    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }
    
    class ExitException extends RuntimeException implements ExitCodeGenerator {
		private static final long serialVersionUID = 1L;

		@Override
		public int getExitCode() {
			return 10;
		}

	}
}

