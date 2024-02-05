package com.example.reactiveweblearn.student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentService {

    Mono<Student> save(Student student);

    Flux<Student> findAll();

    Mono<Student> findOne(Integer id);
}
