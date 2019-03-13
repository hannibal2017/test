package com.test.annotation;
@MyAnnotation(color = "yellow")
public class MyAnnotationUse {

	public static void main(String[] args) {
	    boolean hasAnnotation = MyAnnotationUse.class.isAnnotationPresent(MyAnnotation.class);
		System.out.println(hasAnnotation);
		if (hasAnnotation){
			System.out.println(MyAnnotationUse.class.getAnnotation(MyAnnotation.class));
			System.out.println(MyAnnotationUse.class.getAnnotation(MyAnnotation.class).color());
		}
	}

}
