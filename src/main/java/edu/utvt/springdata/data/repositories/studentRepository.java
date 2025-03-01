package edu.utvt.springdata.data.repositories;

import edu.utvt.springdata.data.entities.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<student, Long> {
}
