package com;

import java.util.stream.Stream;import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import com.controller.StudentController;
import com.model.Student;
import com.repository.StudentRepository;

@SpringBootApplication()
public class ReactiveMongo1Application {

	/*@Bean
	CommandLineRunner addData(StudentRepository studentRepository) {
		return args ->{
			studentRepository.deleteAll()
			.subscribe(null, null, () ->{
				Stream.of(new Student(1, "deepak"), 
						new Student(2, "hello"),
						new Student(3, "world"))
				.forEach(student -> {
					studentRepository
						.save(student)
						.subscribe(null, null, ()->{
							System.out.println(student);
						});
				});
			});
		};
	}*/
	public static void main(String[] args) {
		
		SpringApplication.run(ReactiveMongo1Application.class, args);
	}

}

