package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student raul = new Student(
                    "raul",
                    "raul@crespo.dev",
                    LocalDate.of(2000, Month.FEBRUARY, 21)
            );

            Student wilson = new Student(
                    "wilson",
                    "wilson@ribeiro.dev",
                    LocalDate.of(1973, Month.NOVEMBER, 11)
            );

            repository.saveAll(
                    List.of(raul, wilson)
            );
        };
    }
}
