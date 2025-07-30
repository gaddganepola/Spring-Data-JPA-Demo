package com.expert.StudentSpringDataJPA;

import com.expert.StudentSpringDataJPA.model.Student;
import com.expert.StudentSpringDataJPA.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentSpringDataJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StudentSpringDataJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		s1.setRollNo(101);
		s1.setName("Ravi");
		s1.setMarks(99);

		s2.setRollNo(102);
		s2.setName("Vijay");
		s2.setMarks(98);

		s3.setRollNo(103);
		s3.setName("Ajay");
		s3.setMarks(97);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
	}
}
