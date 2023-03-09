package com.student.Intern.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.Intern.Dao.StudentDao;
import com.student.Intern.Model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao ss;
	
	public List<Student> getallStudentInfo() {
		List<Student>student=ss.getallStudentInfo();
		return student;
		
	}

	public boolean insertStudentInfo(Student student) {
		return ss.insertStudentInfo(student);
		
	}
	
	public boolean deleteStudentInfo(int id) {
		return ss.deleteStudentInfo(id);
		
	}

	public boolean updateStudentInfo(Student student) {
		return ss.updateStudentInfo(student);
		
	}

	

}
