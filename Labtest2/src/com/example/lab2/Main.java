package com.example.lab2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();

		Student s = new Student();
		s.setNum(1);
		s.setName("ȫ�浿");
		s.setAge(20);
		list.add(s);
		
//		Student s2 = new Student(2,"ö��",22);
//		list.add(s2);
		list.add(new Student(2,"ö��", 22));
		list.add(new Student(3,"����", 21));
		list.add(new Student(4,"��ȣ", 23));
		list.add(new Student(5,"����", 24));
		list.add(new Student(6,"â��", 21));
		list.add(new Student(7,"����", 22));
		list.add(new Student(8,"����", 20));
		list.add(new Student(9,"����", 25));
		list.add(new Student(10,"�̽�", 19));
//		for(int i = 0;i<list.size();i++) {
//			System.out.println(list.get(i).toString());
//		}
		
		//list.remove(2);
//		for(int j = 0;j<list.size();j++) {
//			System.out.println(list.get(j).toString());
//		}
		
//		for(Student obj : list) {
//			System.out.println(obj.toString());
//		} 			// �� obj��� ������>??????
		Collections.sort(list);
//		for(Student obj: list) {
//			System.out.println(obj.toString());
//		}
		System.out.println("Student List : ");
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		
				
	}

}
