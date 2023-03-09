package com.student.Intern.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.student.Intern.Model.Student;
import com.student.Intern.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	//get student data
	@GetMapping("/get")
	public List<Student> getallStudentInfo() {
		List<Student>student=ss.getallStudentInfo();
		return student;
	}
	
	//insert new data
	@PostMapping("/post")
	public boolean insertStudentInfo(@RequestBody Student student) {
			return ss.insertStudentInfo(student);
	}
	
	//Delete student data
	@DeleteMapping("deleteStudent/{id}")
	public boolean deleteStudentInfo(@PathVariable int id) {
		return ss.deleteStudentInfo(id);
		
	}
	
	//update Student data
	@PutMapping("/update")
    public boolean updateStudentInfo(@RequestBody Student student) {
		return ss.updateStudentInfo(student);
	}
}
