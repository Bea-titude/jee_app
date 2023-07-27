package com.tf4beta.ems.main;

import com.tf4beta.ems.main.controllers.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import javax.servlet.DispatcherType;

@SpringBootApplication(scanBasePackages = {"com.tf4beta.ems.main.*.*"})
@ComponentScan(basePackageClasses= EmployeeController.class)
public class EmsCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsCrudApplication.class, args);
	}

}
