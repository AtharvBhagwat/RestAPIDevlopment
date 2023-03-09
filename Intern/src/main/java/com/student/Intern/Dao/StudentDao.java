package com.student.Intern.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.Intern.Model.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory sf;
	
	public List<Student> getallStudentInfo() {
	
		
			Session session=sf.openSession();
			Criteria criteria=session.createCriteria(Student.class);
			List<Student>student=criteria.list();
			
			session.close();
			return student;
		}

	public boolean insertStudentInfo(Student student) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(student);

		transaction.commit();
		session.close();
		return true;
	}
	
	public boolean deleteStudentInfo(int id) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(id);

		transaction.commit();
		session.close();
		return true;
		
	}

	public boolean updateStudentInfo(Student student) {
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(student);

		transaction.commit();
		session.close();
		return true;
		
	}

	



}
