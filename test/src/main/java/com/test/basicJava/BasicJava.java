package com.test.basicJava;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class BasicJava {

	// static
	private static  int a = 2;
	{
		System.out.println("block");
	}
	static {
		System.out.println("static block");
	}
	
	public static  void method1(){
		System.out.println("static method1");
	}
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 1 integer
		// -128~127 �����
		/*
		 * Integer a = 123; Integer b = 123; System.out.println("a,b�Ƿ���ȣ�" + (a
		 * == b));
		 * 
		 * // new Integer(123);�ᴴ���¶������Բ���� Integer x = new Integer(123);
		 * Integer y = new Integer(123); System.out.println("x,y�Ƿ���ȣ�" + (x ==
		 * y));
		 * 
		 * // valueOf() ������ʵ�ֱȽϼ򵥣��������ж�ֵ�Ƿ��ڻ�����У�����ڵĻ���ֱ�ӷ��ػ���ص����ݡ� Integer z =
		 * Integer.valueOf(123); Integer k = Integer.valueOf(123);
		 * System.out.println("z,k�Ƿ���ȣ�" + (z == k));
		 */

		// 2,String
		/*
		 * String s1 = new String("aaa"); String s2 = new String("aaa");
		 * System.out.println(s1 == s2); String s3 = s1.intern(); String s4 =
		 * s1.intern(); System.out.println(s3 == s4);
		 */

		// ���͵�ַ��https://tech.meituan.com/2014/03/06/in-depth-understanding-string-intern.html
		/*
		 * String s = new String("1"); String s2 = "1"; s.intern();
		 * System.out.println(s == s2);
		 * 
		 * String s3 = new String("1") + new String("1"); String s4 = "11";
		 * s3.intern(); System.out.println(s3 == s4);
		 */
		// jdk7��֮��İ汾��֧��switch String�ַ�
		/*
		 * String s = "a"; switch (s) { case "a": System.out.println("aaa");
		 * break; case "b": System.out.println("bbb"); break; }
		 */

		// "==" �� equals
		/*
		 * ���ڻ������ͣ�== �ж�����ֵ�Ƿ���ȣ���������û�� equals() ������ 
		 * �����������ͣ�== �ж����������Ƿ�����ͬһ�����󣬶�equals() �ж����õĶ����Ƿ�ȼۡ�
		 */
		/*Integer x = new Integer(1);
		Integer y = new Integer(1);
		System.out.println(x.equals(y)); // true
		System.out.println(x == y); // false
		int a = 1;
		int b = 1;*/
		
		// static
		/*BasicJava bj = new BasicJava();
		BasicJava.method1();
		System.out.println(BasicJava.a);
		*/
		String str1 = "中文";
		byte[] bytes = str1.getBytes("UTF-8");
		String str2 = new String(bytes, "UTF-8");
		System.out.println(str2);
		
		//reflection
	/*	Integer a = 2;
		System.out.println(a.getClass());
		
		Integer[] arr = {1, 2, 3};
		List list = Arrays.asList(arr);
		System.out.println(list);*/
		
		/*
		 * ʱ�����ʽ��
		 */
		long unixstamp = 804787200000L;
		Date dt = new Date(unixstamp);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
		System.out.println(sdf.format(dt));
	}

}
