package com.ecorise.services;

import com.ecorise.dao.StudentDao;
import com.ecorise.model.Student;
//import com.ecorise.model.Student;
import com.google.gson.Gson;

public class StudentService {

	
 public void insertData(String studentdata) {
	 
	 	Student student =  makebeanfromjson(studentdata);
	 	StudentDao dao = new StudentDao();
	 	dao.insertData(student);
		
	}
 
 
public void updateData(String studentdata) {
	// TODO Auto-generated method stub
	Student student =  makebeanfromjson(studentdata);
 	StudentDao dao = new StudentDao();
 	dao.updateData(student);
}

private Student makebeanfromjson(String studentdata) {

	Gson gson = new Gson();
	return gson.fromJson(studentdata, Student.class);
}

}
