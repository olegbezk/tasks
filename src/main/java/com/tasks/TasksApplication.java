package com.tasks;

import com.tasks.domain.Task;
import com.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService) {
		return args -> {
			taskService.saveTask(new Task(1L, "Create Spring Boot Application",
					LocalDate.now(), true));
			taskService.saveTask(new Task(2L, "Create Spring Boot Project Packages",
					LocalDate.now().plus(1, ChronoUnit.DAYS), false));
			taskService.saveTask(new Task(3L, "Create the Task Domain Class",
					LocalDate.now().plus(3, ChronoUnit.DAYS), false));
			taskService.saveTask(new Task(4L, "Create Service and Repository Classes",
					LocalDate.now().plus(5, ChronoUnit.DAYS), false));
			taskService.saveTask(new Task(5L, "Create Command Line Runner to Load Data",
					LocalDate.now().plus(8, ChronoUnit.DAYS), false));
			taskService.saveTask(new Task(6L, "Create the required configuration for properties",
					LocalDate.now().plus(10, ChronoUnit.DAYS), false));
			taskService.saveTask(new Task(7L, "Run the Spring Boot Application",
					LocalDate.now().plus(12, ChronoUnit.DAYS), false));
			taskService.saveTask(new Task(8L, "Check H2 console for the initial data",
					LocalDate.now().plus(13, ChronoUnit.DAYS), false));
		};
	}
}
