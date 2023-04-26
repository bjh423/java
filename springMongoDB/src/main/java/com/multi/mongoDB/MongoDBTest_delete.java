package com.multi.mongoDB;

import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest_delete {

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

		//삭제할 조건을 json(Document)로 생성		
		Document filter = new Document();
		filter.append("id", "apple");
		
		collection.deleteOne(filter);
		client.close();
		System.out.println("deleteOne 종료");
		
	}

}
