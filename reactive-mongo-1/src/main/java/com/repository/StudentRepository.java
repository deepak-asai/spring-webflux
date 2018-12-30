package com.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.model.Student;

import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveMongoRepository<Student, Integer>{
	@Tailable
	Flux<Student> findWithTailableCursorBy();
}
