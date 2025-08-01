package com.expert.StudentSpringDataJPA;

import com.expert.StudentSpringDataJPA.model.Student;
import com.expert.StudentSpringDataJPA.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class StudentSpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StudentSpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
//		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
//
//		s1.setRollNo(101);
//		s1.setName("Ravi");
//		s1.setMarks(99);
//
//		s2.setRollNo(102);
//		s2.setName("Vijay");
//		s2.setMarks(98);
//
//		s3.setRollNo(103);
//		s3.setName("Ajay");
//		s3.setMarks(97);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		List<Student> students = repo.findAll();
//		for (Student student : students) {
//			System.out.println(student);
//		}
//
//		Optional<Student> s = repo.findById(103);
//		System.out.println(s.orElse(new Student()));
//
//		System.out.println(repo.findByName("csdfsd"));
//
//		System.out.println(repo.findByMarks(99));
//
//		System.out.println(repo.findByMarksGreaterThan(97));


		s3.setRollNo(103);
		s3.setName("Ajay Ray");
		s3.setMarks(85);

		//Update the record
		repo.save(s3);

		repo.delete(s3);



	}
}
