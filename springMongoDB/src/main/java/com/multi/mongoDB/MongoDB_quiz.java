package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDB_quiz {

	public static void main(String[] args) {
		// 1.몽고DB 연결
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("몽고DB 프로그램 연결");

		// 2.shop2 db 연결
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("shop DB 연결");

		// 3.member 컬렉션 연결
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("member 컬렉션 연결");
		
		//1 insertOne
//		Document one = new Document();
//		one.append("age", 500);
//		one.append("name","song");
//		one.append("office","busan");
//		one.append("phone", "011");
//
//		collection.insertOne(one);
		
		//2 insertMany
		
//		Document one = new Document();
//		one.append("age", 501);
//		one.append("name", "song2");
//		one.append("office","busan");
//		one.append("phone", "011");
//		
//		Document one2 = new Document();
//		one2.append("age", 502);
//		one2.append("name", "song3");
//		one2.append("office","seoul");
//		one2.append("phone", "011");
//		
//		Document one3 = new Document();
//		one3.append("age", 503);
//		one3.append("name", "song4");
//		one3.append("office","busan");
//		one3.append("phone", "011");
//		
//		ArrayList list = new ArrayList();
//		list.add(one);
//		list.add(one2);
//		list.add(one3);
//
//		collection.insertMany(list);
		
		//3 deleteOne
//		Document filter = new Document();
//		filter.append("age", 500);
//		
//		collection.deleteOne(filter);
		
		//4 updateOne
//		Document filter = new Document();
//		filter.append("age", 501);
//		
//		Bson update = Updates.set("name", "songsong");
//		
//		collection.updateOne(filter, update);
		
		//5 updateMany
		Document filter = new Document();
		filter.append("office", "busan");
		
		Bson update = Updates.set("phone", "9999");
		Bson update2 = Updates.set("name", "songsong2");
		Bson update3 = Updates.set("age", "555");
		
		List list = new ArrayList();
		list.add(update);
		list.add(update2);
		list.add(update3);
		Bson combined = Updates.combine(list);
		
		collection.updateMany(filter, combined);
		


	}

}
