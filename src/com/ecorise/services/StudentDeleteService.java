package com.ecorise.services;

import com.ecorise.dao.StudentDeleteDao;

public class StudentDeleteService {

	public void deleteStudent(Integer rollno1) {
	
		StudentDeleteDao dao = new StudentDeleteDao();
		dao.deleteStudent(rollno1);
	}
}
