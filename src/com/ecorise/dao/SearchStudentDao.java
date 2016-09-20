package com.ecorise.dao;

import java.util.ArrayList;
import java.util.List;

import com.ecorise.model.Student;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class SearchStudentDao {

	public ArrayList<Student> searchStudentData(Integer rollno) {
		ArrayList<Student> list = new ArrayList<Student>();
		try {
			
			MongoClient client = new MongoClient();
			DB db = client.getDB("studentinfo");
			DBCollection col = db.getCollection("docStudent");
			BasicDBObject query = new BasicDBObject();
			query = new BasicDBObject("rollno", rollno);
			List<DBObject> mylist = col.find(query).toArray();
			for (int i = 0; i < mylist.size(); i++) {
				Student student = new Student();
				student.setRollno((int) mylist.get(i).get("rollno"));
				student.setName(mylist.get(i).get("name").toString());
				student.setDepart(mylist.get(i).get("depart").toString());
				student.setSub1((int) mylist.get(i).get("sub1"));
				student.setSub2((int) mylist.get(i).get("sub2"));
				student.setSub3((int) mylist.get(i).get("sub3"));
				list.add(student);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}
