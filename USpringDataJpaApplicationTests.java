package com.cts;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.entities.Student;
import com.cts.repository.StudentRepository;

@SpringBootTest
class USpringDataJpaApplicationTests {
	
	@Autowired
	private StudentRepository repos;

	@Test
	void contextLoads() {
		
		Student student=new Student();
		student.setId(1l);
		student.setName("Devika");
		student.setScore(100);
		
		repos.save(student);
		
		Student savedStudent = repos.findById(1L).get();
		
		assertNotNull(savedStudent);
		
	}

}
