package com.test.basicJava;

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
	public static void main(String[] args) {
		// 1 integer
		// -128~127 会相等
		/*
		 * Integer a = 123; Integer b = 123; System.out.println("a,b是否相等：" + (a
		 * == b));
		 * 
		 * // new Integer(123);会创建新对象，所以不相等 Integer x = new Integer(123);
		 * Integer y = new Integer(123); System.out.println("x,y是否相等：" + (x ==
		 * y));
		 * 
		 * // valueOf() 方法的实现比较简单，就是先判断值是否在缓存池中，如果在的话就直接返回缓存池的内容。 Integer z =
		 * Integer.valueOf(123); Integer k = Integer.valueOf(123);
		 * System.out.println("z,k是否相等：" + (z == k));
		 */

		// 2,String
		/*
		 * String s1 = new String("aaa"); String s2 = new String("aaa");
		 * System.out.println(s1 == s2); String s3 = s1.intern(); String s4 =
		 * s1.intern(); System.out.println(s3 == s4);
		 */

		// 解释地址：https://tech.meituan.com/2014/03/06/in-depth-understanding-string-intern.html
		/*
		 * String s = new String("1"); String s2 = "1"; s.intern();
		 * System.out.println(s == s2);
		 * 
		 * String s3 = new String("1") + new String("1"); String s4 = "11";
		 * s3.intern(); System.out.println(s3 == s4);
		 */
		// jdk7及之后的版本，支持switch String字符
		/*
		 * String s = "a"; switch (s) { case "a": System.out.println("aaa");
		 * break; case "b": System.out.println("bbb"); break; }
		 */

		// "==" 和 equals
		/*
		 * 对于基本类型，== 判断两个值是否相等，基本类型没有 equals() 方法。 
		 * 对于引用类型，== 判断两个变量是否引用同一个对象，而equals() 判断引用的对象是否等价。
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
		
		//reflection
	/*	Integer a = 2;
		System.out.println(a.getClass());
		
		Integer[] arr = {1, 2, 3};
		List list = Arrays.asList(arr);
		System.out.println(list);*/
		
		long unixstamp = 804787200000L;
		Date dt = new Date(unixstamp);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
		System.out.println(sdf.format(dt));
	}

}
