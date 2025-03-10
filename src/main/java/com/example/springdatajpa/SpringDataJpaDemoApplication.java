package com.example.springdatajpa;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springdatajpa.model.Student;
import com.example.springdatajpa.repo.StudentRepo;

@SpringBootApplication
public class SpringDataJpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaDemoApplication.class, args);
		
		StudentRepo repo = context.getBean(StudentRepo.class);
		
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		
//		s1.setRollNo(101);
//		s1.setName("User1");
//		s1.setMarks(60);
//		
		s2.setRollNo(102);
		s2.setName("User2");
		s2.setMarks(85);
//		
//		s3.setRollNo(103);
//		s3.setName("User3");
//		s3.setMarks(80);
//		
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);
		
//		Optional<Student> s = repo.findById(102);		
//		System.out.println(s.orElse(new Student()));
//		
//		System.out.println(repo.findByName("User2"));
////		System.out.println(repo.findByMarks(80));
//		System.out.println(repo.findByMarksGreaterThan(60));
		
//		repo.save(s2);
		repo.delete(s2);
		
	}

}
