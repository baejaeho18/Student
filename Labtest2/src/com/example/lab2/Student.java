package com.example.lab2;

public class Student implements Comparable<Student>{
	private int num;
	private String name;
	private int age;
	// ������, getter ,setter
	// �����ڴ� ����ڰ� �����ϱ� ���� java�� �ڵ����� ��������
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
	// ��Ŭ�� -> source -> generate getters and setters
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
	
	
	// overriding ��� �� ������
	// overloading ���� ����� �Լ��� �Է°��� �ٸ����ϰ� �̸� ����
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return num+"-"+name+"("+age+")";
	}
	
	
}
