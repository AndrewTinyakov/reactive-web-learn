package com.example.reactiveweblearn;

import com.example.reactiveweblearn.student.Student;
import com.example.reactiveweblearn.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class ReactiveWebLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveWebLearnApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentService service) {
        return args -> {
            for (int i = 0; i < 100; i++) {
                service.save(Student.builder()
                        .firstname("Andrew " + i)
                        .age(i)
                        .build()).subscribe();
            }
        };
    }


}
