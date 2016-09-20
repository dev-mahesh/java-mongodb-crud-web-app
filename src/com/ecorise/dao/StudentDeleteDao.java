package com.ecorise.dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class StudentDeleteDao {

	public void deleteStudent(Integer rollno1) {
		
		try {
			
			MongoClient client = new MongoClient();
			DB db = client.getDB("studentinfo");
			DBCollection col = db.getCollection("docStudent");
			
			BasicDBObject query = new BasicDBObject();
			query =  new BasicDBObject("rollno", rollno1);
			
			col.remove(query);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
