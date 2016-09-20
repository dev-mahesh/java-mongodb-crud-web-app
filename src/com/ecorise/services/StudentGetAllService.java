package com.ecorise.services;

import java.util.ArrayList;

import com.ecorise.dao.GetStudentDao;
import com.ecorise.model.Student;
import com.google.gson.Gson;

public class StudentGetAllService {

	public String getAllStudentData() {
		// TODO Auto-generated method stub
		GetStudentDao dao = new GetStudentDao();
		ArrayList<Student> student = dao.getAllStudentData();
		String jsondata = makejsonformbean(student);
		return jsondata;
	}

	private String makejsonformbean(ArrayList<Student> student) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		return gson.toJson(student);
	}

}
