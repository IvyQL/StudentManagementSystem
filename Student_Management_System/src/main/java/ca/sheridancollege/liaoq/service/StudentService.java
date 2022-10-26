package ca.sheridancollege.liaoq.service;

import java.util.List;

import ca.sheridancollege.liaoq.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
