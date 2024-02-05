package com.example.reactiveweblearn.student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {

}
