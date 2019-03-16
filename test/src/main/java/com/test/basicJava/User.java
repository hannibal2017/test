package com.test.basicJava;

public class User {
	private int id;
	private int age;
	public User(int id, int age) {
		super();
		this.id = id;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null){
			return false;
		}else {
			if (obj instanceof User){
				User user = (User) obj;
				if (this.id == user.id && this.age == user.age){
					return true;
				}
			}
		}
		return false;
	}
	
}
