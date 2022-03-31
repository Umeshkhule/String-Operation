package com.vasyerp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student(101,"Umesh",23);
		Student student2=new Student(102,"Ramesh",27);
		Student student3=new Student(103,"Satish",24);
		Student student4=new Student(104,"Sarang",25);
		List<Student> list=new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		System.out.println(list);

		Employee employee1=new Employee(1, "Yash",25000,"Ahmedabad");
		Employee employee2=new Employee(1, "Vijay",30000,"Gandhinagar");
		Employee employee3=new Employee(1, "Urvich",55000,"Hyderabad");
		List<Employee> list1=new ArrayList<>();
		list1.add(employee1);
		list1.add(employee2);
		list1.add(employee3);
		System.out.println(list1);
		
		Bike bike1=new Bike(1212,"TVS Star","Red");
		Bike bike2=new Bike(2121,"Pulsor","Black");
		Bike bike3=new Bike(2020,"KTM","Black");
		List<Bike> list2=new ArrayList<>();
		list2.add(bike1);
		list2.add(bike2);
		list2.add(bike3);
		System.out.println(list2);
		
		List l=new ArrayList<>();
		l.add(list);
		l.add(list1);
		l.add(list2);
		System.out.println(l);
		
		/*		1st Approach to traverse
		  for(Student student:list) {
			System.out.println(student);
		}
		*/
		
		/*		2nd Approach to traverse
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
	}
}
