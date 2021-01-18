//package com.test.json;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
///**
// * [{"fileName":"���","path":"ddd"},{"fileName":"��ɢ��","path":"ghgh"}]
// * @author ThinkStation
// *
// */
//public class JsonTest {
//
//	public static void main(String[] args) {
//		// 1,��������json
//		// String json = "{'name':'�����','age':24}";
//		// parseJsonObject(json);
//
//		// 2,����json����
////		String json = "[{'name':'��С��' , 'age':20 , 'male':true},{'name':'��С��' , 'age':22 , 'male':false}]";
////		parseJSONArray(json);
//
//		//3,��������json,���滹������
////		String json = "{'name':'�����','age':24,'male':true,'address':{'street':'nansahn','city':shenzehn','country':'china'}}";
////		parseJsonPerson(json);
//
//		//4,����json����.����json,���滹������
//		String json = "[{'name':'�����','age':24,'male':true,'address':{'street':'nansahn','city':shenzehn','country':'china'}}"
//				+ ""
//				+ ",{'name':'��˾��','age':24,'male':true,'address':{'street':'tianhe','city':guagnzhou','country':'china'}}]";
//		parseJsonArrayPerson(json);
//	}
//
//	public static void parseJsonObject(String json) {
//		try {
//			JSONObject jsonObject = new JSONObject(json);
//			String name = jsonObject.getString("name");
//			int age = jsonObject.getInt("age");
//			// �������ø������
//			System.out.println("name:" + name + ",age:" + age);
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void parseJSONArray(String json) {
//		try {
//			JSONArray jsonArray = new JSONArray(json);
//			for (int i = 0; i < jsonArray.length(); i++) {
//				JSONObject jsonObject = jsonArray.getJSONObject(i);
//				String name = jsonObject.getString("name");
//				int age = jsonObject.getInt("age");
//				boolean male = jsonObject.getBoolean("male");
//				// �������ø������
//				System.out.println("name:" + name + ",age:" + age + ",male:" + male);
//			}
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static void parseJsonPerson(String json) {
//        try {
//            JSONObject jsonObject = new JSONObject(json);
//            String name = jsonObject.getString("name");
//            int age = jsonObject.getInt("age");
//            boolean male = jsonObject.getBoolean("male");
//            JSONObject addressJSON = jsonObject.getJSONObject("address");
//            String street = addressJSON.getString("street");
//            String city = addressJSON.getString("city");
//            String country = addressJSON.getString("country");
//            System.out.println("addressJSON:" + addressJSON);
//        } catch (JSONException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//	public static void parseJsonArrayPerson(String json) {
//        try {
//        	JSONArray jsonArray = new JSONArray(json);
//            for (int i = 0; i < jsonArray.length(); i++) {
//            	JSONObject jsonObject = jsonArray.getJSONObject(i);
//                String name = jsonObject.getString("name");
//                int age = jsonObject.getInt("age");
//                boolean male = jsonObject.getBoolean("male");
//                JSONObject addressJSON = jsonObject.getJSONObject("address");
//                String street = addressJSON.getString("street");
//                String city = addressJSON.getString("city");
//                String country = addressJSON.getString("country");
//                System.out.println("addressJSON:" + addressJSON);
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
