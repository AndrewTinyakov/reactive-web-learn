package com.example.reactiveweblearn.student;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping
    Mono<Student> save(@RequestBody Student student) {
        return service.save(student);
    }

    @GetMapping("/{id}")
    Mono<Student> findById(@PathVariable int id) {
        return service.findOne(id);
    }

    @GetMapping
    Flux<Student> findAll() {
        return service.findAll();
    }

}
