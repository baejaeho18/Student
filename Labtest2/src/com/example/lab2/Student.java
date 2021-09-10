package com.example.lab2;

public class Student implements Comparable<Student>{
	private int num;
	private String name;
	private int age;
	// 생성자, getter ,setter
	// 생성자는 사용자가 지정하기 전엔 java가 자동으로 생성해줌
//	Student();
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	public Student() {
		
	}
	
	public Student(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	// 우클릭 -> source -> generate getters and setters
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// overriding 상속 시 재정의
	// overloading 같은 기능의 함수는 입력값만 다르게하고 이름 같게
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return num+"-"+name+"("+age+")";
	}
	
	
}
