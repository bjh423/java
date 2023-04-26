package com.multi.mongoDB;

import java.util.ArrayList;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest_find {

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

		FindIterable<Document> list = collection.find();
		
		ArrayList<MemberVO> result = new ArrayList<MemberVO>();
		
		for (Document document : list) {
			MemberVO bag = new MemberVO();
			bag.setId(document.getString("id"));
			bag.setPw(document.getString("pw"));
			bag.setName(document.getString("name"));
			bag.setTel(document.getString("tel"));
			result.add(bag);
		}
		System.out.println(result);
	}

}
