package service;

import java.util.Map;

import dao.StudentDao;
import student.Student;

public class StudentAllSelectService {

	private StudentDao studentDao;
	
	public StudentAllSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public Map<String, Student> allSelect() {
		return studentDao.getStudentDB();
	}
	
}