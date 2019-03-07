package com.test.basicJava;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class BasicJava {

	// static
	private static int a = 2;
	{
		System.out.println("block");
	}
	static {
		System.out.println("static block");
	}

	public static void method1() {
		System.out.println("static method1");
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		// 1 integer
		// -128~127 �����
		/*
		 * Integer a = 123; Integer b = 123; System.out.println("a,b�Ƿ���ȣ�" +
		 * (a == b));
		 * 
		 * // new Integer(123);�ᴴ���¶������Բ���� Integer x = new Integer(123);
		 * Integer y = new Integer(123); System.out.println("x,y�Ƿ���ȣ�" + (x ==
		 * y));
		 * 
		 * // valueOf()
		 * ������ʵ�ֱȽϼ򵥣��������ж�ֵ�Ƿ��ڻ�����У�����ڵĻ���ֱ�ӷ��ػ���ص����ݡ� Integer
		 * z = Integer.valueOf(123); Integer k = Integer.valueOf(123);
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
		 * �����������ͣ�== �ж����������Ƿ�����ͬһ�����󣬶�equals()
		 * �ж����õĶ����Ƿ�ȼۡ�
		 */
		/*
		 * Integer x = new Integer(1); Integer y = new Integer(1);
		 * System.out.println(x.equals(y)); // true System.out.println(x == y);
		 * // false int a = 1; int b = 1;
		 */

		// static
		/*
		 * BasicJava bj = new BasicJava(); BasicJava.method1();
		 * System.out.println(BasicJava.a);
		 */
		/*
		 * String str1 = "中文"; byte[] bytes = str1.getBytes("UTF-8"); String
		 * str2 = new String(bytes, "UTF-8"); System.out.println(str2);
		 */

		// reflection
		/*
		 * Integer a = 2; System.out.println(a.getClass());
		 * 
		 * Integer[] arr = {1, 2, 3}; List list = Arrays.asList(arr);
		 * System.out.println(list);
		 */

		/*
		 * ʱ�����ʽ��
		 */
		/*
		 * long unixstamp = 804787200000L; Date dt = new Date(unixstamp);
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 * sdf.setTimeZone(TimeZone.getTimeZone("GMT+8")); ;
		 */
		// collection and map
		// 1, map
		/*
		 * HashMap hashMap = new HashMap(); hashMap.put("key1", "value1");
		 * hashMap.put("key2", "value2"); hashMap.put("key3", "value3");
		 * System.out.println(hashMap.put("key1",
		 * "value2"));//如果Key已经存在，则设置新值，再返回旧值。 System.out.println(hashMap);
		 */
		// 2 collection
		/*
		 * Set hashSet = new HashSet(); for (int i = 0; i < 50; i++){
		 * hashSet.add(i); } for (Object o : hashSet){ System.out.print(o +
		 * " "); } LinkedList ll = new LinkedList();
		 */
		/*
		 * ArrayList al = new ArrayList(); al.add(5); al.add(2); al.add(58);
		 * al.add(15); System.out.println(al); Collections.sort(al);
		 * System.out.println(al);
		 */
		/*
		 * // 输出当前时刻 Calendar c = Calendar.getInstance(); int year =
		 * c.get(Calendar.YEAR); int month = c.get(Calendar.MONTH) + 1; int day
		 * = c.get(Calendar.DAY_OF_MONTH); int hour =
		 * c.get(Calendar.HOUR_OF_DAY);//Calendar.HOUR是12分制 int minute =
		 * c.get(Calendar.MINUTE); int seconds = c.get(Calendar.SECOND);
		 * System.out.println("now:" + year + "年" + month + "月" + day + "号，" +
		 * hour + "时" + minute + "分" + seconds + "秒" ); // 输出前一天的当前时刻
		 * c.add(Calendar.DAY_OF_MONTH, -1); //
		 * c.set(Calendar.DAY_OF_MONTH,c.get(Calendar.DAY_OF_MONTH) +
		 * -1);//sencond method to get last day SimpleDateFormat format = new
		 * SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		 * System.out.println("format Calendar:" + format.format(c.getTime()));
		 * Date date1 = c.getTime(); Date date2 = new Date();
		 * System.out.println(date1.after(date2));//测试此日期是否在指定日期之后。date1比date2早，
		 * 所以返回false
		 * System.out.println(date1.before(date2));//测试此日期是否在指定日期之前。date1比date2早
		 * ，所以返回true //比较两个日期的顺序。 //如果参数 Date 等于此 Date，则返回值 0；如果此 Date 在 Date
		 * 参数之前，则返回小于 0 的值；如果此 Date 在 Date 参数之后，则返回大于 0 的值。
		 * System.out.println(date1.compareTo(date2));//测试此日期是否在指定日期之前。
		 * date1比date2早，所以返回-1
		 */
		/*
		 * short s1= 1; s1 += 1;//+=会自动匹配数据类型 System.out.println(s1);
		 */
		// 幂运算
		/*
		 * System.out.println( 2 << 3); System.out.println( Math.pow(2, 4));
		 */
		/*
		 * Pattern p = Pattern.compile("a*b"); Matcher m = p.matcher("aaaaab");
		 * boolean b = m.matches(); System.out.println(b);
		 * System.out.println(Pattern.matches("a*b", "aaaaab"));
		 */
		/*Scanner scan = new Scanner(System.in);
		// 从键盘接收数据
		// next方式接收字符串
		System.out.println("next方式接收：");
		// 判断是否还有输入
		if (scan.hasNext()) {
			String str1 = scan.next();
			System.out.println("输入的数据为：" + str1);
		}
		scan.close();*/	
	}
}
