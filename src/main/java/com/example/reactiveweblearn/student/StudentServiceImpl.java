package com.example.reactiveweblearn.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    @Transactional
    public Mono<Student> save(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Flux<Student> findAll(){
        return studentRepository.findAll();
    }

    @Override
    public Mono<Student> findOne(Integer id){
        return studentRepository.findById(id);
    }
}
