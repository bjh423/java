package com.multi.mongoDB;

import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest_insert {

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

		Scanner sc = new Scanner(System.in);
		// 자바프로그램 <--연결설정(강물, 스트림)----- 콘솔
		System.out.print("id입력>>");
		String id = sc.next();
		System.out.print("pw입력>>");
		String pw = sc.next();
		System.out.print("name입력>>");
		String name = sc.next();
		System.out.print("tel입력>>");
		String tel = sc.next();
		sc.close();

		
		Document doc = new Document();
		doc.append("id", id);
		doc.append("pw", pw);
		doc.append("name", name);
		doc.append("tel", tel);

		collection.insertOne(doc);
		System.out.println("insert 성공");

		
	}

}
