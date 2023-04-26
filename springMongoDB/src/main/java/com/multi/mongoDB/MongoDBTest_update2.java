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

public class MongoDBTest_update2 {

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

		//업데이트 할 조건을 json(Document)로 생성		
		Document filter = new Document();
		filter.append("id", "apple");
		
		//업데이트 할 내용을 bson으로 생성
		Bson set = Updates.set("name", "win2win");
		Bson set2 = Updates.set("tel", "win3win");
		List list = new ArrayList();
		list.add(set);
		list.add(set2);
		Bson setts = Updates.combine(list); //list를 bson화
		
		collection.updateMany(filter, setts);
		System.out.println("update 완료");
	}

}
