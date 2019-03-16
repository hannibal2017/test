package com.test.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.test.domain.User;

/**
 * ����Ͱ͵�fastjson test
 * 
 * @author ThinkStation
 *
 */
public class FastjsonTest {

	public static void main(String[] args) {
		// testJSONArray();
		// testJsonString();
		testBeanToJson();
	}

	public static void testJSONArray() {
		String json = "[{'fileName':'aName','path':'ddd'},{'fileName':'bName','path':'ghgh'}]";
		List<Map<String, String>> listObjectFir = (List<Map<String, String>>) JSONArray.parse(json);
		for (Map<String, String> mapList : listObjectFir) {
			String fileName = mapList.get("fileName");
			String path = mapList.get("path");
			System.out.println("fileName:" + fileName + ",path:" + path);
		}
	}

	public static void testJsonString() {
		HashMap map = new HashMap();
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		map.put("count", 12);
		map.put("list", list);
		System.out.println(JSON.toJSONString(map));
	}

	public static void testBeanToJson() {
		User user = new User();
		user.setId(1);
		user.setPassword("11");
		user.setPhone("11");
		System.out.println(JSON.toJSONString(user));
//		{"id":1,"password":"11","phone":"11"}
	}

	public static void testJsonToBean() {
		String json = "{'id':'1','password':'11','phone':'11'}";
		JSONObject userJson = JSONObject.parseObject(json);
		User user = JSON.toJavaObject(userJson, User.class);
		System.out.println(user);
		System.out.println(user.getId());
//		com.test.domain.User@443b7951
//		1
	}

}
