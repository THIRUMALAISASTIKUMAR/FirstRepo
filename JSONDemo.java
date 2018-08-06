package com.json;

import org.json.simple.JSONObject;

public class JSONDemo {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("Thiru", 50);
		obj.put("Vihesh", 60);
		obj.put("Selvi", 40);
		obj.put("Sasti", 40);
		System.out.println(obj);
	}

}
