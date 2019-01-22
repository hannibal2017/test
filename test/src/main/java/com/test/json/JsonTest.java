package com.test.json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * [{"fileName":"广告","path":"ddd"},{"fileName":"放散阀","path":"ghgh"}]
 * @author ThinkStation
 *
 */
public class JsonTest {

	public static void main(String[] args) {
		// 1,解析单个json
		// String json = "{'name':'李书豪','age':24}";
		// parseJsonObject(json);

		// 2,解析json数组
//		String json = "[{'name':'胡小威' , 'age':20 , 'male':true},{'name':'赵小亮' , 'age':22 , 'male':false}]";
//		parseJSONArray(json);
		
		//3,解析单个json,下面还有数据
//		String json = "{'name':'李书豪','age':24,'male':true,'address':{'street':'nansahn','city':shenzehn','country':'china'}}";
//		parseJsonPerson(json);
		
		//4,解析json数组.单个json,下面还有数据
		String json = "[{'name':'李书豪','age':24,'male':true,'address':{'street':'nansahn','city':shenzehn','country':'china'}}"
				+ ""
				+ ",{'name':'公司的','age':24,'male':true,'address':{'street':'tianhe','city':guagnzhou','country':'china'}}]";
		parseJsonArrayPerson(json);
	}

	public static void parseJsonObject(String json) {
		try {
			JSONObject jsonObject = new JSONObject(json);
			String name = jsonObject.getString("name");
			int age = jsonObject.getInt("age");
			// 接下来该干嘛干嘛
			System.out.println("name:" + name + ",age:" + age);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	public static void parseJSONArray(String json) {
		try {
			JSONArray jsonArray = new JSONArray(json);
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject jsonObject = jsonArray.getJSONObject(i);
				String name = jsonObject.getString("name");
				int age = jsonObject.getInt("age");
				boolean male = jsonObject.getBoolean("male");
				// 接下来该干嘛干嘛
				System.out.println("name:" + name + ",age:" + age + ",male:" + male);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public static void parseJsonPerson(String json) {  
        try {  
            JSONObject jsonObject = new JSONObject(json);  
            String name = jsonObject.getString("name");  
            int age = jsonObject.getInt("age");  
            boolean male = jsonObject.getBoolean("male");  
            JSONObject addressJSON = jsonObject.getJSONObject("address");  
            String street = addressJSON.getString("street");  
            String city = addressJSON.getString("city");  
            String country = addressJSON.getString("country");  
            System.out.println("addressJSON:" + addressJSON);
        } catch (JSONException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }
	public static void parseJsonArrayPerson(String json) {  
        try {  
        	JSONArray jsonArray = new JSONArray(json);  
            for (int i = 0; i < jsonArray.length(); i++) {  
            	JSONObject jsonObject = jsonArray.getJSONObject(i);  
                String name = jsonObject.getString("name");  
                int age = jsonObject.getInt("age");  
                boolean male = jsonObject.getBoolean("male");  
                JSONObject addressJSON = jsonObject.getJSONObject("address");  
                String street = addressJSON.getString("street");  
                String city = addressJSON.getString("city");  
                String country = addressJSON.getString("country");  
                System.out.println("addressJSON:" + addressJSON);
            }  
        } catch (JSONException e) {  
            e.printStackTrace();  
        }  
    }

}
