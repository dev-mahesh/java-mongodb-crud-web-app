package com.ecorise.services;

import java.util.ArrayList;

import com.ecorise.dao.SearchStudentDao;
import com.ecorise.model.Student;
import com.google.gson.Gson;

public class SearchStudentService {

	public String getStudentData(Integer rollno) {
		SearchStudentDao dao = new SearchStudentDao();
		ArrayList<Student> student = dao.searchStudentData(rollno);
		String jsondata = makejsonfrombean(student);
		
		return jsondata;
	}

	private String makejsonfrombean(ArrayList<Student> student) {
		Gson gson = new Gson();
		return gson.toJson(student);
	}

}
