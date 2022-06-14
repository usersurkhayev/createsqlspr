package com.orient.createsqlspr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CreatesqlsprApplication implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;


    public static void main(String[] args) {
        SpringApplication.run(CreatesqlsprApplication.class, args);
    }




    @Override
    public void run(String... args) throws Exception {

        Student student = new Student();
        student.setFirstName("Malik");
        student.setLastName("Seferov");
        student.setEmail("SM@gmail.com");

        //studentRepository.save(student);


    }
}
