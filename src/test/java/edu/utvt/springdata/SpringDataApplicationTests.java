package edu.utvt.springdata;

import edu.utvt.springdata.data.entities.student;
import edu.utvt.springdata.data.repositories.studentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataApplicationTests {

	@Autowired
	private studentRepository studentRepository;

	@Test
	void contextLoads() {

		student student = new student("Diego", "Nava");
		studentRepository.save(student);

	}

}
