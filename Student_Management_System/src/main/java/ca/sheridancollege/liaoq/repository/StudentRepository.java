package ca.sheridancollege.liaoq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.sheridancollege.liaoq.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
	//type of entity, type of primary key
	//include a SimpleJpaRepository class, so don/t need @repository for any repository interface

}
