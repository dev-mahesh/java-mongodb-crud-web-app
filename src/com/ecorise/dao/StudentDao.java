package com.ecorise.dao;

import com.ecorise.model.Student;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class StudentDao {

	public void insertData(Student student) {

		try {
		
			MongoClient client = new MongoClient();
			DB db = client.getDB("studentinfo");
			DBCollection col = db.getCollection("docStudent");
			BasicDBObject doc = new BasicDBObject();
			
			doc.put("rollno", student.getRollno());
			doc.put("name", student.getName());
			doc.put("depart", student.getDepart());
			doc.put("sub1", student.getSub1());
			doc.put("sub2", student.getSub2());
			doc.put("sub3", student.getSub3());
			
			col.insert(doc);
				
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
/*-----------------------------------------------------------------------------*/
	
	public void updateData(Student student) {
		try {
	
			MongoClient client = new MongoClient();
			DB db = client.getDB("studentinfo");
			DBCollection col = db.getCollection("docStudent");
			BasicDBObject doc = new BasicDBObject();
			BasicDBObject query = new BasicDBObject();
			query = new BasicDBObject("rollno", student.getRollno());
			doc.put("rollno", student.getRollno());
			doc.put("name", student.getName());
			doc.put("depart", student.getDepart());
			doc.put("sub1", student.getSub1());
			doc.put("sub2", student.getSub2());
			doc.put("sub3", student.getSub3());
			
			BasicDBObject newdoc = new BasicDBObject("$set", doc);
			
			col.update(query, newdoc);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
