package com.test.json;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;

/**
 * ����Ͱ͵�fastjson test
 * 
 * @author ThinkStation
 *
 */
public class FastjsonTest {

	public static void main(String[] args) {
		String json = "[{'fileName':'���','path':'ddd'},{'fileName':'��ɢ��','path':'ghgh'}]";
		List<Map<String, String>> listObjectFir = (List<Map<String, String>>) JSONArray.parse(json);
		for (Map<String, String> mapList : listObjectFir) {
			String fileName = mapList.get("fileName");
			String path = mapList.get("path");
			System.out.println("fileName:" + fileName + ",path:" + path);
		}
	}

}
