package com.controller;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.repository.StudentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;


	@GetMapping("/{id}")
	public Mono<Student> getStudent(@PathVariable("id") int id){
		Mono<Student> s = studentRepository.findById(id).delayElement(Duration.ofSeconds(5));
		System.out.println("async");
		return s;	
	}
	
	@GetMapping("/all")
	public Flux<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping(value = "/streamData", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Student> streamData(){
		return studentRepository.findWithTailableCursorBy().delayElements(Duration.ofSeconds(2));
	}
}
