package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest_insert2 {

	public static void main(String[] args) {
		// 1.몽고DB 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("몽고DB 프로그램 연결");

		// 2.shop2 db 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("shop DB 연결");

		// 3.member 컬렉션 연결
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("member 컬렉션 연결");

		
		Document doc = new Document();
		doc.append("id", "apple");
		doc.append("pw", "apple");
		doc.append("name", "apple");
		doc.append("tel", "apple");
		
		Document doc2 = new Document();
		doc2.append("id", "apple1");
		doc2.append("pw", "apple1");
		doc2.append("name", "apple1");
		doc2.append("tel", "apple1");
		
		//ArrayList<Document> list = new ArrayList<Document>();
		List<Document> list = new ArrayList<Document>();
		list.add(doc);
		list.add(doc2);

		collection.insertMany(list);
		System.out.println("insert 성공");

		
	}

}
